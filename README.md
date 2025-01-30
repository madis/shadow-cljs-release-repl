# REPL in a shadow-cljs release build

This is a small test project to find ways to embed a REPL server into a shadow-cljs release build.

This would be useful to debug running production systems. For the daring ones, they could even monkey-patch live systems.

The difficulty comes from that in release build there's no shadow-cljs server and thus the Clojure code sent from REPL doesn't have any place to be compiled to JavaScript.

## Running

1. Compile: `npx shadow-cljs release node`
2. Run: `node target/main.js`

Currently errors with:
```
❯ npx shadow-cljs release node
------------------------------------------------------------------------------

   WARNING: shadow-cljs not installed in project.
   See https://shadow-cljs.github.io/docs/UsersGuide.html#project-install

------------------------------------------------------------------------------
shadow-cljs - config: /home/madis/temp/clojurescript-embed-repl/shadow-cljs.edn
[:node] Compiling ...
The required namespace "shadow.cljs.devtools.api" is not available, it was required by "example/main.cljs".
"shadow/cljs/devtools/api.clj" was found on the classpath. Maybe this library only supports CLJ?
```
