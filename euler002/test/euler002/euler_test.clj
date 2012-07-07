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
  (fib 93) => 12200160415121876738) 

(future-fact
  (sum-even-fib 189) => 188)

