# Athens / Roam Parser

These network note tools use a markdown like grammar, with additional rules.

Here, we extract out Athen's parser to be able to use the grammars as a library!


## Development

Installation on Mac

 - Get Java JDK 8
 - `brew install clojure/tools/clojure`
 - `brew install leiningen`

Compilation

 - `lein cljsbuild once`
 - `lein lein minify-assets`

This creates `dist/parser.min.js` with a size of 2MB... hm.. this is quite large if it is to be included in a Roam Depot style extension.

__Anyone know how to make this smaller?__

## About

Working towards a Roam parser that can be used for 

Alex's CMS and web 
https://github.com/exrhizo/extracellular

and perhaps a to play with roam / athens visualizations.