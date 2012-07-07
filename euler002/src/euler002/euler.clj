(ns euler002.euler)

(defn fib-fast 
  [i a b limit]
  (if (< i limit) (fib-fast (inc i) b (+ a b) limit) b))

(defn fib 
  [n]
  (if (= n 0) 0 (fib-fast 1 0 1 n)))

(defn sum-even-fib [x] 0)

