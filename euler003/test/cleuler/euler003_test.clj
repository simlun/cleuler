(ns cleuler.euler003-test
  (:use midje.sweet
        cleuler.euler003))

(fact 
  (two+odd-numbers 100) => '(2 3 5 7 9))

(fact
  (find-factor-to-value-in-list 9 '(2 3 4)) => {:prime 3 :optimus 3}
  (find-factor-to-value-in-list 9 '()) => nil)

(fact
  (finds-factor 24) => {:prime 2 :optimus 12}
  (finds-factor 12) => {:prime 2 :optimus 6}
  (finds-factor 6) => {:prime 2 :optimus 3}
  (finds-factor 3) => nil 
  (finds-factor 1) => nil)

(future-fact 
  (primes 13195) => '(5 7 13 29))
