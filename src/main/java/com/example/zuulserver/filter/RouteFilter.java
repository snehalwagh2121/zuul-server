//package com.example.zuulserver.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//
//public class RouteFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "route filter";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        System.out.println("Inside Route Filter");
//        return null;
//    }
//}
