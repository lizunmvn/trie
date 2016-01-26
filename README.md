# Trie

> Trie tree implementation in Java

[![Build Status](https://travis-ci.org/jmnarloch/trie.svg?branch=master)](https://travis-ci.org/jmnarloch/trie)
[![Coverage Status](https://coveralls.io/repos/jmnarloch/trie/badge.svg?branch=master&service=github)](https://coveralls.io/github/jmnarloch/trie?branch=master)

## Features

Extends the Spring Cloud's `ProxyRouteLocator` with configurable matching strategy. The provided implementation allows
to register a [Trie tree](https://en.wikipedia.org/wiki/Trie) for matching the routes.

## Setup

Add the Spring Cloud starter to your project:

```xml
<dependency>
  <groupId>io.jmnarloch</groupId>
  <artifactId>trie</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Implementation details

The Trie is a R way tree that is designed for efficient string searches.

At this moment this component defines three different implementation of the Trie, all of which differs slightly
in performance, but far most with the memory consumption.

The available Trie implementations are:

* CharArrayTrie
* HashMapTrie
* CharHashMapTrie - that uses Trove TCharObjectHashMap

## TODO

* TST
* Compressed trie - Patricia trie
* Immutable trie

## License

Apache 2.0