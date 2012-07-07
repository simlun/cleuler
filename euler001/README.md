# euler001


## Preconditions

Install [Leiningen](http://leiningen.org/):

1. Download the script: `https://raw.github.com/technomancy/leiningen/preview/bin/lein`
2. Place it on your $PATH.
3. Set it to be executable.


## Usage

* Run the tests:

        $ lein midje
        >>> clojure.test summary:
        Ran 1 tests containing 1 assertions.
        0 failures, 0 errors.
        >>> Midje summary:
        All claimed facts (5) have been confirmed. 

* Run the tests continously:

        $ lein midje --lazytest

* Use the function in the REPL:

        $ lein repl
        /.../
        user=> (require 'euler001.euler)
        nil
        user=> (euler001.euler/multiplesum 10)
        23


