# reloaded

A Leiningen 2 template to generate project skeletons using
[tools.namespace] and a `:dev` profile with a `user.clj` file.

This template is based on the blog article [My Clojure Workflow, Reloaded].

[tools.namespace]: https://github.com/clojure/tools.namespace
[My Clojure Workflow, Reloaded]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Releases and Dependency Information

This template requires [Leiningen] 2.

I publish releases to [Clojars].

Current release is 0.1.0

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
    ├── epl-v10.html
    ├── project.clj
    ├── dev
    │   └── user.clj
    └── src
        └── com
            └── example
                └── new_project.clj

The `dev` directory contains files that you will use only during
interactive development, including `user.clj` which is automatically
loaded by Clojure at startup.

The `src` directory contains your application source files.

See the [article] for an explanation of how I use these files to
develop an application.

[article]: http://thinkrelevance.com/blog/2013/06/04/clojure-workflow-reloaded


## Change Log

* Version 0.1.0 released on 2013-Aug-05


## Forking

I created this template for my own personal use, and I am publishing
it in the hopes that others will find it useful. I encourage you to
fork and modify this template to suit your own needs and personal
workflow, but I am unlikely to merge any changes into this repository.


## Copyright and License

Copyright © 2013 Stuart Sierra. All rights reserved. The use and
distribution terms for this software are covered by the
[Eclipse Public License 1.0] which can be found in the file
epl-v10.html at the root of this distribution. By using this software
in any fashion, you are agreeing to be bound by the terms of this
license. You must not remove this notice, or any other, from this
software.

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php
