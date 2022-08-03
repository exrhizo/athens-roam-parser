# Athens / Roam Parser

These network note tools use a markdown like grammar, with additional rules.

Here, we extract out [Athens](https://github.com/athensresearch/athens)'s [parser](https://github.com/athensresearch/athens/blob/main/src/cljc/athens/parser.cljc) to be able to use the grammars as a library!


## Development

Installation on Mac

 - Get Java JDK 11
 - `brew install clojure/tools/clojure`

Compilation during development

 - `npx cljsbuild watch athens`

Production

 - `npx shadow-cljs release athens`

This creates `dist/index.js` with a size of 312K... hm.. this is large if it is to be included in a Roam Depot style extension? better than when using `lein cljsbuild`.

__Anyone know how to make this smaller?__

## About

Working towards a Roam parser that can be used for 

Alex's CMS and web 
https://github.com/exrhizo/extracellular

and perhaps a to play with roam / athens visualizations.
