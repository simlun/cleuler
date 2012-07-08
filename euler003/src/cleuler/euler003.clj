(ns cleuler.euler003
      (:use [clojure.math.numeric-tower :only [floor sqrt]]))

(defn two+odd-numbers [i] 
  (cons 2 (range 3 (floor (sqrt i)) 2)))

(defn find-factor-to-value-in-list [value n] 
  (if (empty? n) 
    nil
    (let [x (first n)]
      (if (= 0 (mod value x)) 
        {:prime x :optimus (unchecked-divide-int value x)} 
        (recur value (rest n))))))

(defn finds-factor [i] 
  (find-factor-to-value-in-list i (two+odd-numbers i)))

(defn primes [i]
  (let [prime (finds-factor i)] 
    ))

