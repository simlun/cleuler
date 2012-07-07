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

(defn find-euler-fibs
  ([]  (take-while #(< % 4000000) (find-euler-fibs 0)))
  ([a] (cons (fib a) (lazy-seq (find-euler-fibs (inc a))))))

(defn sum-even-fibs-less-than 
  [x] (reduce + (filter even? (find-euler-fibs))))

(defn find-fibs
  [max-fib]
  (reduce + (for [n (range)
      :let [f (fib n)]
      :when (even? f)
      :while (< f max-fib)]
  f)))

