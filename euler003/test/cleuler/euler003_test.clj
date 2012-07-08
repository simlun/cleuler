(ns cleuler.euler003-test
  (:use midje.sweet
        cleuler.euler003))

(fact 
  (take 5 (possible-prime-factors 900)) => '(2 1 3 5 7))


