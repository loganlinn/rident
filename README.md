# rident

Tiny library to generate various random identifiers

## Install

Add to your `project.clj`:

```clojure
[rident "0.1.0"]
```

## Usage

### Heroku-like identifiers

```clojure
(require 'rident.adj-noun)

(rident.adj-noun/generate) ;; => "summer-flower-2280"
```

### UUIDs

```clojure
(require 'rident.uuid)

(rident.uuid/generate) ;; => "2e744138-7348-4151-abdb-31021f45749e"
```

## License

Copyright © 2013 Logan Linn

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
