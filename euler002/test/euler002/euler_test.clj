(ns euler002.euler-test
  (:use midje.sweet
        euler002.euler))

(fact
  (fib 0) => 0
  (fib 1) => 1)
