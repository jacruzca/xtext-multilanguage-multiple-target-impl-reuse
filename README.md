xtext-multilanguage-multiple-target-impl-reuse
==============================================

work in progress ...


Goal:
-------------------------

Implement multiple DSLs using XText. Some DSLs have references to others (0...n).

Each language may have in turn multiple reference implementations, i.e., they have multiple templates (Xtend).

It means (at least for me) that I can "reuse" languages and templates. I hope.

Dependencies between languages
-------------------------

![alt tag](https://raw.github.com/jacruzca/xtext-multilanguage-multiple-target-impl-reuse/master/doc/dependencies_dsl.png)

Note
-------------------------

This is just a POC