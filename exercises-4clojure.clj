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

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 16 - Hello World

; What I pasted in the box:

#(str "Hello, " % "!")

;I used short notation to write an function that parses the strings together. 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 17 - Sequences: map

; What I pasted in the box:

'(6 7 8)

; We are mapping a function to a list of numbers that adds five to each number 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 18 - Sequences: filter

; What I pasted in the box:

'(6 7)

; we filtered through the list keeping only numbers greater that five: #(> % 5), 
;thus we only have the bigger numbers left in the new list

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 20 - Penultimate Element

; What I pasted in the box:

(fn [x] (nth x (- (count x) 2)))

; Pass in a sequence, naming it x. Use the nth function:
;;;for the first parameter, pass in the sequence x
;;;for the second parameter, find the correct index by counting the items in x and then subracting two.
;;;;;(subract once because index is base zero, then again to get the penultimate element)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 21 - Nth Element

; What I pasted in the box:

(fn walkToN [coll index]
  (if (= 0 index)
    (first coll)
    (walkToN (rest coll) (- index 1)) ))

; Remove things from the collection until the correct item is easily accseeible:
;  -base case: the first thing is what we want
;  -continue case: Throw the first thing away, decrement the index. We are thus getting closer to base case.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 23 - Reverse a Sequence

; What I pasted in the box:

reduce #(cons %2 %1) '()

; Using reduce, cons each item on the big list onto an empty list. This effectively reverses them.


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 25 - Find the odd numbers

; What I pasted in the box:

filter #(= (mod % 2) 1)

; filter the sequence using mod2. When dividing by 2, there will be:
;zero remaining if num is even
;one remaining if num is odd (keep these!)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 37 - Regular Expressions

; What I pasted in the box:

"ABC"

;Use the regex to find capital letters (or groups of them)
;putting the results in an array of strings. 
;apply str turns them into a single string of all CAPS, ie. "ABC"

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 40 - Interpose a 

; What I pasted in the box:

(fn mix [addin coll]
   (if (empty? (rest coll))
     (cons (first coll) nil)
     (cons (first coll) (cons addin (mix addin (rest coll)))))
)

; Build a list by cons-ing pieces together two at a time.
;  -Normal case: cons the first and the addin, recurse on rest
;  -End case: cons the first, close the list

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;////////////////////////////////////////////////////////////////////////////////////////////////////
;;;Problem 43 - Reverse Interleave

; What I pasted in the box:

(fn [coll numb]
  (map #(take-nth numb (drop % coll)) (range numb))
)

; We talked about these in office hours/class. 
;This solution uses take-nth to grab the nth term from what is effectively numb vectors.
; In test one, our numb is 2 and we map against:
;   [1 2 3 4 5 6] to get [1 3 5] and then chop off the front term
;   [2 3 4 5 6] to get [2 4 6]
; repeat as necessary numb times for other sets.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;Problem 44 - Rotate Sequence

; What I pasted in the box:

  (fn [rawShift coll]
    (let [size (count coll) shift (mod rawShift size)]
     (concat 
      (drop shift coll)
      (take shift coll))
    ))

; We talked about these in office hours/class. With drop and take, it is way easier.  
;Just cons the drop and take together using mod to hanldle negatives, etc

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

