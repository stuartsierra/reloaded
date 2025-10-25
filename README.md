# reloaded

A Leiningen 2 template to generate project skeletons using
[tools.namespace], [Component], and [component.repl].

This template is based on the blog article [My Clojure Workflow, Reloaded].


[tools.namespace]: https://github.com/clojure/tools.namespace
[Component]: https://github.com/stuartsierra/component
[component.repl]: https://github.com/stuartsierra/component.repl
[My Clojure Workflow, Reloaded]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Releases and Dependency Information

This template requires [Leiningen] 2.

I publish releases to [Clojars].

Current release is 1.2.0

No installation is necessary; Leiningen should automatically discover
and download the template.

[Leiningen]: http://leiningen.org/
[Clojars]: http://clojars.org/


## Quick Start

In your shell:

   lein new reloaded com.example/my-project
   cd my-project
   lein repl

At the REPL prompt:

   (go)

This will load and switch to the `dev` namespace.

As you work, reload/restart your system from the `dev` namespace:

   (reset)

Edit `dev/dev.clj`. Define a constructor for your application in the
placeholder in `dev-system`.


## Details

Run `lein new reloaded com.example/new-project` to generate a new
project skeleton in the `new-project` directory, with a structure like
this:

    .
    ├── README.md
    ├── project.clj
    ├── dev
    │   └── dev.clj
    │   └── user.clj
    └── src
        └── com
            └── example
                └── new_project.clj

The `src` directory contains your application source files.

The `dev` directory contains files that you will use only during
interactive development, including:

 * `dev.clj`, with template functions to create your application.

 * `user.clj`, loaded automatically by Clojure at startup.

These files will not be packaged in the JAR files created by `lein
jar` or `lein uberjar`.

The `user` namespace refers the `go`, `reset`, and `dev` symbols from
the `com.stuartsierra.component.user-helpers` namespace, which is
packaged with [component.repl]. In user-helpers, `reset` is just an
alias for `go`, so that you can use type the same thing regardless of
whether the REPL is in `user` or `dev`.

The `dev` namespace refers common Clojure utilities and the `reset`,
`start`, `stop`, and `system` symbols from the
`com.stuartsierra.component.repl` namespace.


See [component.repl] and the [original article] for explanations of
how I use these files to develop an application. Note: The article was
written before the existence of [Component] and [component.repl].

[original article]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Change Log

See [CHANGELOG.md](CHANGELOG.md)


## Forking

I created this template for my own personal use, and I am publishing
it in the hopes that others will find it useful. I encourage you to
fork and modify this template to suit your own needs and personal
workflow, but I am unlikely to merge any changes into this repository.


## Copyright and License

Copyright © 2013-2017 Stuart Sierra. All rights reserved. The use and
distribution terms for this software are covered by the
[Eclipse Public License 1.0] which can be found in the file
epl-v10.html at the root of this distribution. By using this software
in any fashion, you are agreeing to be bound by the terms of this
license. You must not remove this notice, or any other, from this
software.

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php
