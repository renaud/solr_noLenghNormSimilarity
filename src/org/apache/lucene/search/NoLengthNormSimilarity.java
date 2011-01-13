package org.apache.lucene.search;

import org.apache.lucene.search.DefaultSimilarity;

/**
 * Overwrites (and disables) lengthNorm<br>
 * http://web.archiveorange.com/archive/v/AAfXfa9RqrT9Mjm7yu4e
 * 
 * @author renaud@apache.org
 * 
 */
public class NoLengthNormSimilarity extends DefaultSimilarity {

	private static final long serialVersionUID = 1L;

	public float lengthNorm(String fieldName, int numTerms) {
		return numTerms > 0 ? 1.0f : 0.0f;
	}

	// public float tf(float freq) {
	// return freq > 0 ? 1.0f : 0.0f;
	// }

}
