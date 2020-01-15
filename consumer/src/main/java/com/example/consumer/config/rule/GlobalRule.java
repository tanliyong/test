//package com.example.consumer.config.rule;
//
//import com.netflix.loadbalancer.ILoadBalancer;
//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RoundRobinRule;
//import com.netflix.loadbalancer.Server;
//
//public class GlobalRule implements IRule {
//
//    RoundRobinRule roundRobinRule = new RoundRobinRule();
//@Override
//    public Server choose(Object o) {
//        return roundRobinRule.choose(o);
//    }
//
//    @Override
//    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
//        this.roundRobinRule = (RoundRobinRule) iLoadBalancer;
//    }
//
//    @Override
//    public ILoadBalancer getLoadBalancer() {
//        return (ILoadBalancer) roundRobinRule;
//    }
//
//
//}
