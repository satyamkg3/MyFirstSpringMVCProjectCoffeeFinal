package com.satyam.controller;

import com.satyam.bean.*;
import com.satyam.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"coffeeId","addonId","sizeId","discountId"})
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private AddOnService addOnService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/")
    public ModelAndView indexPage()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/showCoffee")
    public ModelAndView showCoffee()
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("coffeeList",coffeeService.getAllCoffee());
        mv.setViewName("showCoffee");
        return mv;
    }

    @RequestMapping("/showAddOn")
    public ModelAndView showAddOns(@RequestParam("coffeeId") String id/*, HttpSession session*/)
    {
        ModelAndView mv = new ModelAndView();
        //session.setAttribute("coffeeId",id);
        mv.addObject("coffeeId",id);
        mv.addObject("addonList",addOnService.getAllAddOns());
        mv.setViewName("showAddOn");
        return mv;
    }

    @RequestMapping("/showSize")
    public ModelAndView showSize(@RequestParam("addonId") String id)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("addonId",id);
        mv.addObject("sizeList",sizeService.getAllSize());
        mv.setViewName("showSize");
        return mv;
    }

    @RequestMapping("/showDiscount")
    public ModelAndView showDiscount(@RequestParam("sizeId") String id)
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sizeId",id);
        mv.addObject("discountList",discountService.getAllCoupons());
        mv.setViewName("showDiscount");
        return mv;
    }

    @RequestMapping("/coffeeOrder")
    public ModelAndView placeCoffeeOrder(@RequestParam("discountId") String id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("discountId",id);
        mv.addObject("coffee",coffeeService);
        mv.addObject("addon",addOnService);
        mv.addObject("size",sizeService);
        mv.addObject("discount",discountService);
        mv.setViewName("showOrder");
        return mv;
    }
    @RequestMapping("/generateBill")
    public ModelAndView generateBill(HttpSession session)
    {
        Order order = new Order();
        ModelAndView mv = new ModelAndView();
        order.setCoffeeID(Integer.parseInt((String)session.getAttribute("coffeeId")));
        order.setAddOnID(Integer.parseInt((String)session.getAttribute("addonId")));
        order.setSizeID(Integer.parseInt((String)session.getAttribute("sizeId")));
        order.setCouponID(Integer.parseInt((String)session.getAttribute("discountId")));

        double bill = orderService.calculateBill(order);
        order.setTotalPrice(bill);
        orderService.placeOrder(order);

        mv.addObject("Bill",bill);
        mv.addObject("CofeePrice",coffeeService.getCoffeePriceById(order.getCoffeeID()));
        mv.addObject("AddonPrice",addOnService.getAddonPriceById(order.getAddOnID()));
        mv.addObject("SizePrice",sizeService.getSizePriceById(order.getSizeID()));
        mv.addObject("DiscountPrice",discountService.getDiscountPriceById(order.getCouponID()));

        mv.setViewName("order");
        return mv;
    }
}
