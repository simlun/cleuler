(ns cleuler.euler002)

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

; One solution
(defn find-euler-fibs
  ([x]   (take-while #(< % x) (find-euler-fibs 0 x)))
  ([a x] (cons (fib a) (lazy-seq (find-euler-fibs (inc a) x)))))

(defn sum-even-fibs-less-than 
  [x] (reduce + (filter even? (find-euler-fibs x))))

; Another solution
(defn- even-fibs-less-than
 [max-fib]
  (for [n (range)
      :let [f (fib n)]
      :when (even? f)
      :while (< f max-fib)]
  f))

(defn sum-even-fibs-less-than'
  [max-fib]
  (reduce + (even-fibs-less-than max-fib)))

