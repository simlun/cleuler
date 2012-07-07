(ns euler002.euler)

(defn- zerorem?
  [numer denom]
  (= 0 (rem numer denom)))

(defn divis?
  [a]
  (or 
    (zerorem? a 3)
    (zerorem? a 5)))

(defn multiplesum
  [limit]
  (reduce + (filter divis? (range 1 limit))))

