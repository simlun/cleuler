(ns cleuler.euler002-test
  (:use midje.sweet
        cleuler.euler002))

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


(def limit 4000000)

(fact
  (< (last (find-euler-fibs limit)) limit) => true
  (> (last (find-euler-fibs limit)) 3000000) => true)

(fact "The Project Euler problem 2 answer"
  (sum-even-fibs-less-than limit) => 4613732 
  (sum-even-fibs-less-than' limit) => 4613732)

