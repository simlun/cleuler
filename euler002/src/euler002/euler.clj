(ns euler002.euler)

(defn- fib-fast 
  [i a b limit]
  (if 
    (< i limit)
    (fib-fast (inc i) b (+ a b) limit)
    b))

(defn fib 
  [n]
  (if
    (= n 0)
    0
    (fib-fast (bigint 1) (bigint 0) (bigint 1) (bigint n))))

(defn sum-even-fib [x] 0)

(defn find-first-euler-fib
  ([]  (take-while #(< % 4000000) (find-first-euler-fib 0)))
  ([a] (cons (fib a) (lazy-seq (find-first-euler-fib (inc a))))))
