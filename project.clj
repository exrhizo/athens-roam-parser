(defproject athens-roam-parser "2.0.0-beta.3"
  :description "The Athens markdown parser"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.879" :exclusions [org.apache.ant/ant]]
                 [instaparse/instaparse "1.4.10"]]
  :plugins [[lein-cljsbuild "1.1.8"], [lein-asset-minifier "0.4.6"]]
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "dist/parser.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]}
  :minify-assets [[:js {:source ["dist/parser.js"]
                        :target "dist/parser.min.js"}]])
