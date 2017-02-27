# reloaded

A Leiningen 2 template to generate project skeletons using
[tools.namespace] and [component.repl].

This template is based on the blog article [My Clojure Workflow, Reloaded].


[tools.namespace]: https://github.com/clojure/tools.namespace
[component.repl]: https://github.com/stuartsierra/component.repl
[My Clojure Workflow, Reloaded]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Releases and Dependency Information

This template requires [Leiningen] 2.

I publish releases to [Clojars].

Current release is 0.3.0

No installation is necessary; Leiningen should automatically discover
and download the template.

[Leiningen]: http://leiningen.org/
[Clojars]: http://clojars.org/


## Usage

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

 * `dev.clj` which contains template functions create your
   application.

 * `user.clj`, loaded automatically by Clojure at startup, which
   contains two functions:

   * `(go)` will load all source files, start the application, and
     switch to the `dev` namespace.

   * `(dev)` will just load and switch to the `dev` namespace, without
     starting the application.

See [component.repl] and the [original article] for explanations of
how I use these files to develop an application.

[article]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Change Log

* Version 0.3.0 released on 2017-02-27
  * Use [component.repl]
* Version 0.2.1 released on 2015-09-19
  * Fix mis-named `go` symbol in `dev` namespace
* (BROKEN) Version 0.2.0 released on 2015-09-19
  * Move start/stop functions into `dev` namespace
  * Update tools.namespace & Clojure versions
* Version 0.1.3 released on 2014-10-04
  * Update tools.namespace dependency in template
* Version 0.1.2 released on 2014-07-18
  * Update Clojure & tools.namespace dependencies in template
* Version 0.1.1 released on 2013-10-21
  * Do not assume EPL or any other license in generated project
* Version 0.1.0 released on 2013-08-05


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
