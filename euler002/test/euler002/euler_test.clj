(ns euler002.euler-test
  (:use midje.sweet
        euler002.euler))

(fact "multiplesum of 2 is 0"
  (multiplesum 2) => 0)

(fact "multiplesum of 4 is 3"
  (multiplesum 4) => 3)

(fact "divis? checks if arg is divisable by 3 or 5"
  (divis? 2) => false
  (divis? 3) => true
  (divis? 4) => false
  (divis? 5) => true
  (divis? 6) => true
  (divis? 7) => false)

(fact "10 => 23"
  (multiplesum 10) => 23)
