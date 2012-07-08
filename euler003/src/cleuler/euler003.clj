(ns cleuler.euler003
      (:use [clojure.math.numeric-tower :only [floor sqrt]]))

(defn possible-prime-factors [i]
                        (cons 2 (range 1 (floor (sqrt i)) 2)))
