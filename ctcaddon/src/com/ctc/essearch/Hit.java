/**
 *
 */
package com.ctc.essearch;

import java.util.Map;


/**
 *
 *
 */
public class Hit
{

	private String _index;
	private String _type;
	private String _id;
	private String _score;
	private Map<String, Object> _source;

	/**
	 * @return the _index
	 */
	public String get_index()
	{
		return _index;
	}

	/**
	 * @param _index
	 *           the _index to set
	 */
	public void set_index(final String _index)
	{
		this._index = _index;
	}

	/**
	 * @return the _type
	 */
	public String get_type()
	{
		return _type;
	}

	/**
	 * @param _type
	 *           the _type to set
	 */
	public void set_type(final String _type)
	{
		this._type = _type;
	}

	/**
	 * @return the _id
	 */
	public String get_id()
	{
		return _id;
	}

	/**
	 * @param _id
	 *           the _id to set
	 */
	public void set_id(final String _id)
	{
		this._id = _id;
	}

	/**
	 * @return the _score
	 */
	public String get_score()
	{
		return _score;
	}

	/**
	 * @param _score
	 *           the _score to set
	 */
	public void set_score(final String _score)
	{
		this._score = _score;
	}

	/**
	 * @return the _source
	 */
	public Map<String, Object> get_source()
	{
		return _source;
	}

	/**
	 * @param _source
	 *           the _source to set
	 */
	public void set_source(final Map<String, Object> _source)
	{
		this._source = _source;
	}


}
