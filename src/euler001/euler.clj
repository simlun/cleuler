(ns euler001.euler)

(defn divis?
  [a]
  (or (= 0 (rem a 3)) (= 0 (rem a 5))))

(defn multiplesum
  [limit]
  (reduce + (filter divis? (range 1 limit))))

