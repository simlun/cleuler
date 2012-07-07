(ns euler002.euler-test
  (:use midje.sweet
        euler002.euler))

(fact
  (fib 0) => 0
  (fib 1) => 1
  (fib 2) => 1
  (fib 3) => 2
  (fib 4) => 3)

(fact
  (sum-even-fib 189) => 188)

