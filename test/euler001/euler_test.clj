(ns euler001.euler-test
  (:use midje.sweet
        euler001.euler))

(fact "2 => 0"
  (multiplesum 2) => 0)

(fact "3 => 3"
  (multiplesum 4) => 3)

(fact "3 is divisable by 3"
  (divis? 3) => true
  (divis? 2) => false)

(fact "10 => 23"
  (multiplesum 10) => 23)
