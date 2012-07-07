(ns euler002.euler-test
  (:use midje.sweet
        euler002.euler))

(fact
  (fib 0) => 0
  (fib 1) => 1
  (fib 2) => 1
  (fib 3) => 2
  (fib 4) => 3
  (fib 12) => 144) 

(fact "fib can handle even bigint-large numbers"
  (fib 92) => 7540113804746346429 
  (fib 93) => 12200160415121876738N) 


(def limit 4000000)

(fact
  (take 4 (find-euler-fibs)) => '(2 8 34 144))

(fact "The Project Euler problem 2 answer"
  (sum-even-fibs-less-than limit) => 4613732 
  (sum-even-fibs-less-than' limit) => 4613732)

