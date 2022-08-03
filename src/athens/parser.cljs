(ns athens.parser
  (:require
   [athens.parser.impl      :as impl]
   [athens.parser.structure :as structure]))

;; Exported as athens.parser.parse_to_ast
(defn ^:export parse-to-ast
  "Converts a string of block syntax to an abstract syntax tree for Athens Flavoured Markdown."
  [string]
  (impl/staged-parser->ast string))

;; Exported as athens.parser.structure-parse-to-ast
(defn ^:export structure-parse-to-ast
  "Converts a string to structure elements in it, AST of course."
  [string]
  (structure/structure-parser->ast string))

(defn make-js-map
  "makes a javascript map from a clojure one"
  [cljmap]
  (let [out (js-obj)]
    (doall (map #(aset out (name (first %)) (second %)) cljmap))
    out))

;; Exported as athens.parser.parse
(defn ^:export parse
  "Converts a string to structure elements in it, AST of course."
  [string]
  (make-js-map (structure/structure-parser->ast string)))
