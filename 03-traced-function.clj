;; MACRO PROBLEM 3: Create a 'defn-traced' macro
;; This macro should define a function that automatically prints when it's called
;; and what it returns. This is incredibly useful for debugging!
;;
;; Your macro should transform:
;;   (defn-traced add [a b] (+ a b))
;; Into something equivalent to:
;;   (defn add [a b] 
;;     (println "Calling add with args:" a b)
;;     (let [result (+ a b)]
;;       (println "add returning:" result)
;;       result))
;;
;; Challenge: You need to handle the function name, parameters, and body
;; Hint: Use `~@` for unquote-splicing to handle multiple body expressions
;;
;; Example:
;;   (defn-traced multiply [x y] (* x y))
;;   (multiply 3 4)  ; Should print calling info and result

(defmacro defn-traced [name params & body]
  `(defn ~name ~params
     (println "calling" '~name "with args:" ~@params)
     (let [result# (do ~@body)]
       (println '~name "returning:" result#)
       result#)))


;; Test your macro:
(defn-traced square [x] (* x x))
(print (square 5))