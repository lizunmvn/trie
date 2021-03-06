/**
 * Copyright (c) 2015-2016 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jmnarloch.trie;

/**
 * A Trie tree backed by Trove's {@link gnu.trove.map.hash.TCharObjectHashMap}.
 *
 * @author Jakub Narloch
 */
public class TroveCharHashMapTrie<T> extends AbstractTrie<T, TroveCharHashMapTrieNode<T>> {

    /**
     * Creates new instance of {@link TroveCharHashMapTrie} class.
     */
    public TroveCharHashMapTrie() {
        super(new TrieNodeFactory<T, TroveCharHashMapTrieNode<T>>() {
            @Override
            public TroveCharHashMapTrieNode<T> createNode() {
                return new TroveCharHashMapTrieNode<T>();
            }
        });
    }

    /**
     * Creates new instance of {@link TroveCharHashMapTrie} class with initial capacity.
     *
     * @param initialCapacity the initial capacity
     */
    public TroveCharHashMapTrie(final int initialCapacity) {
        super(new TrieNodeFactory<T, TroveCharHashMapTrieNode<T>>() {
            @Override
            public TroveCharHashMapTrieNode<T> createNode() {
                return new TroveCharHashMapTrieNode<T>(initialCapacity);
            }
        });
    }

    /**
     * Creates new instance of {@link TroveCharHashMapTrie} class with initial capacity and load factor.
     *
     * @param initialCapacity the initial capacity
     * @param loadFactor      the load factor
     */
    public TroveCharHashMapTrie(final int initialCapacity, final float loadFactor) {
        super(new TrieNodeFactory<T, TroveCharHashMapTrieNode<T>>() {
            @Override
            public TroveCharHashMapTrieNode<T> createNode() {
                return new TroveCharHashMapTrieNode<T>(initialCapacity, loadFactor);
            }
        });
    }
}
