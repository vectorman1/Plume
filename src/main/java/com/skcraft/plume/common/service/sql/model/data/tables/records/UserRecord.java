/**
 * This class is generated by jOOQ
 */
package com.skcraft.plume.common.service.sql.model.data.tables.records;


import com.skcraft.plume.common.service.sql.model.data.tables.User;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record6<Integer, Integer, Timestamp, Timestamp, Timestamp, String> {

	private static final long serialVersionUID = -1260393953;

	/**
	 * Setter for <code>data.user.user_id</code>.
	 */
	public void setUserId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>data.user.user_id</code>.
	 */
	public Integer getUserId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>data.user.referrer_id</code>.
	 */
	public void setReferrerId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>data.user.referrer_id</code>.
	 */
	public Integer getReferrerId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>data.user.create_date</code>.
	 */
	public void setCreateDate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>data.user.create_date</code>.
	 */
	public Timestamp getCreateDate() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>data.user.join_date</code>.
	 */
	public void setJoinDate(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>data.user.join_date</code>.
	 */
	public Timestamp getJoinDate() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>data.user.last_online</code>.
	 */
	public void setLastOnline(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>data.user.last_online</code>.
	 */
	public Timestamp getLastOnline() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>data.user.host_key</code>.
	 */
	public void setHostKey(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>data.user.host_key</code>.
	 */
	public String getHostKey() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Timestamp, Timestamp, Timestamp, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Timestamp, Timestamp, Timestamp, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return User.USER.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return User.USER.REFERRER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return User.USER.CREATE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return User.USER.JOIN_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return User.USER.LAST_ONLINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return User.USER.HOST_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getReferrerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getCreateDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getJoinDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getLastOnline();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getHostKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(Integer value) {
		setReferrerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(Timestamp value) {
		setCreateDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(Timestamp value) {
		setJoinDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value5(Timestamp value) {
		setLastOnline(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value6(String value) {
		setHostKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, Timestamp value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(Integer userId, Integer referrerId, Timestamp createDate, Timestamp joinDate, Timestamp lastOnline, String hostKey) {
		super(User.USER);

		setValue(0, userId);
		setValue(1, referrerId);
		setValue(2, createDate);
		setValue(3, joinDate);
		setValue(4, lastOnline);
		setValue(5, hostKey);
	}
}
