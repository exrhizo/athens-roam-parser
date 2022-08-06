(ns athens.parser
  (:require
   [athens.parser.impl      :as impl]
   [athens.parser.structure :as structure]))

;; Exported as athens.parser.parse_to_ast
(defn parse-to-ast
  "Converts a string of block syntax to an abstract syntax tree for Athens Flavoured Markdown."
  [string]
  (clj->js(impl/staged-parser->ast string)))

;; Exported as athens.parser.parse
(defn structure-parse-to-ast
  "Converts a string to structure elements in it, AST of course."
  [string]
  (clj->js (structure/structure-parser->ast string)))

(def parser #js { :parseToAst       parse-to-ast
                  :parseToStructure structure-parse-to-ast})
