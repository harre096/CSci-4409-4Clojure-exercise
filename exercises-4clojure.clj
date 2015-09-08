;;;Thomas Harren
;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 10 - Intro to Maps

; What I pasted in the box:

20

; Two ways of using the same hashmap. 20 is the value on the key ":b":

(= __ ((hash-map :a 10, :b 20, :c 30) :b))
(= __ (:b {:a 10, :b 20, :c 30}))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 16 - Hello World

; What I pasted in the box:

#(str "Hello, " % "!")

;I used short notation to write an function that parses the strings togather. 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 17 - Sequences: map

; What I pasted in the box:

'(6 7 8)

; We are mapping a function to a list of numbers that adds five to each number 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 18 - Sequences: filter

; What I pasted in the box:

'(6 7)

; we filtered through the list keeping only numbers greater that five: #(> % 5), thus we only have the bigger numbers left in the new list

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 20 - Penultimate Element

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 21 - Nth Element

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 23 - Reverse a Sequence

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 25 - Find the odd numbers

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 37 - Regular Expressions

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 40 - Interpose a Seq

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 43 - Reverse Interleave

; What I pasted in the box:



; 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 44 - Rotate Sequence

; What I pasted in the box:

(fn rot [shift veck] (flatten (cons (subvec veck (mod shift (+ 1 (count veck))) (count veck)) (subvec veck 0 (+ 1 (mod (count veck) (mod shift (+ 1 (count veck))) )) ))))

; This gets the first one, but seem all too complicated.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 46 - Flipping out

; What I pasted in the box:

(fn [operator] #(operator %2 %1))

;The outer fn would be evaluated first, then flop the params on the inner:
; (= true (((fn [operator] #(operator %2 %1)) >) 7 8))
; (= true ((               #(    >    %2 %1))  ) 7 8))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 47 - Contain yourself

; What I pasted in the box:

4

; Contains looks at keys. For maps, things makes sense. 
;For vectors/java arrays, it still looks at keys NOT VALUES. Huh.
;Doesn't work for lists at all( throws expeption since Clojure >=1.5 )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

