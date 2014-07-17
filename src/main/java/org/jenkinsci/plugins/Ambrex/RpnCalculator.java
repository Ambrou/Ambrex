/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jenkinsci.plugins.Ambrex;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;
/**
 *
 * @author apetitgenet
 */
public class RpnCalculator {
    private final Deque<Number> stack = new LinkedList<Number>();
    private static final List<String> OPS = asList("-", "+", "*", "/");

    public void push(Object arg) {
        if (OPS.contains(arg)) {
            Number y = stack.removeLast();
            Number x = stack.isEmpty() ? 0 : stack.removeLast();
            Double val = null;
            if (arg.equals("-")) {
                val = x.doubleValue() - y.doubleValue();
            } else if (arg.equals("+")) {
                val = x.doubleValue() + y.doubleValue();
            } else if (arg.equals("*")) {
                val = x.doubleValue() * y.doubleValue();
            } else if (arg.equals("/")) {
                val = x.doubleValue() / y.doubleValue();
            }
            push(val);
        } else {
            stack.add((Number) arg);
        }
    }

    public void PI() {
        push(Math.PI);
    }

    public Number value() {
        return stack.getLast();
    }
}
