// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conformance.proto

package com.google.javascript.jscomp;

public interface RequirementOrBuilder extends
    com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<Requirement> {

  // optional string error_message = 1;
  /**
   * <code>optional string error_message = 1;</code>
   *
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   */
  boolean hasErrorMessage();
  /**
   * <code>optional string error_message = 1;</code>
   *
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>optional string error_message = 1;</code>
   *
   * <pre>
   * Required: The message to report when a requirement is violated. This should
   * reference a document describing the reasoning for the requirement
   * and contacts.
   * </pre>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  // repeated string whitelist = 2;
  /**
   * <code>repeated string whitelist = 2;</code>
   *
   * <pre>
   * Optional: A list of source paths that are exempt from the requirement.
   * </pre>
   */
  java.util.List<java.lang.String>
  getWhitelistList();
  /**
   * <code>repeated string whitelist = 2;</code>
   *
   * <pre>
   * Optional: A list of source paths that are exempt from the requirement.
   * </pre>
   */
  int getWhitelistCount();
  /**
   * <code>repeated string whitelist = 2;</code>
   *
   * <pre>
   * Optional: A list of source paths that are exempt from the requirement.
   * </pre>
   */
  java.lang.String getWhitelist(int index);
  /**
   * <code>repeated string whitelist = 2;</code>
   *
   * <pre>
   * Optional: A list of source paths that are exempt from the requirement.
   * </pre>
   */
  com.google.protobuf.ByteString
      getWhitelistBytes(int index);

  // repeated string whitelist_regexp = 3;
  /**
   * <code>repeated string whitelist_regexp = 3;</code>
   *
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   */
  java.util.List<java.lang.String>
  getWhitelistRegexpList();
  /**
   * <code>repeated string whitelist_regexp = 3;</code>
   *
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   */
  int getWhitelistRegexpCount();
  /**
   * <code>repeated string whitelist_regexp = 3;</code>
   *
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   */
  java.lang.String getWhitelistRegexp(int index);
  /**
   * <code>repeated string whitelist_regexp = 3;</code>
   *
   * <pre>
   * Optional: A list of source paths regexs that are exempt from the
   * requirement.
   * </pre>
   */
  com.google.protobuf.ByteString
      getWhitelistRegexpBytes(int index);

  // repeated string only_apply_to = 4;
  /**
   * <code>repeated string only_apply_to = 4;</code>
   *
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   */
  java.util.List<java.lang.String>
  getOnlyApplyToList();
  /**
   * <code>repeated string only_apply_to = 4;</code>
   *
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   */
  int getOnlyApplyToCount();
  /**
   * <code>repeated string only_apply_to = 4;</code>
   *
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   */
  java.lang.String getOnlyApplyTo(int index);
  /**
   * <code>repeated string only_apply_to = 4;</code>
   *
   * <pre>
   * Optional: A list of source paths that will be checked for the requirement
   * (the opposite of whitelist).
   * </pre>
   */
  com.google.protobuf.ByteString
      getOnlyApplyToBytes(int index);

  // repeated string only_apply_to_regexp = 5;
  /**
   * <code>repeated string only_apply_to_regexp = 5;</code>
   *
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   */
  java.util.List<java.lang.String>
  getOnlyApplyToRegexpList();
  /**
   * <code>repeated string only_apply_to_regexp = 5;</code>
   *
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   */
  int getOnlyApplyToRegexpCount();
  /**
   * <code>repeated string only_apply_to_regexp = 5;</code>
   *
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   */
  java.lang.String getOnlyApplyToRegexp(int index);
  /**
   * <code>repeated string only_apply_to_regexp = 5;</code>
   *
   * <pre>
   * Optional: A list of source path regexps that will be checked for
   * the requirement (the opposite of whitelist_regexp).
   * </pre>
   */
  com.google.protobuf.ByteString
      getOnlyApplyToRegexpBytes(int index);

  // optional .jscomp.Requirement.Type type = 6;
  /**
   * <code>optional .jscomp.Requirement.Type type = 6;</code>
   *
   * <pre>
   * Required: The type of requirement.
   * </pre>
   */
  boolean hasType();
  /**
   * <code>optional .jscomp.Requirement.Type type = 6;</code>
   *
   * <pre>
   * Required: The type of requirement.
   * </pre>
   */
  com.google.javascript.jscomp.Requirement.Type getType();

  // repeated string value = 7;
  /**
   * <code>repeated string value = 7;</code>
   *
   * <pre>
   * The value banned, optional for "custom" requirements.
   * </pre>
   */
  java.util.List<java.lang.String>
  getValueList();
  /**
   * <code>repeated string value = 7;</code>
   *
   * <pre>
   * The value banned, optional for "custom" requirements.
   * </pre>
   */
  int getValueCount();
  /**
   * <code>repeated string value = 7;</code>
   *
   * <pre>
   * The value banned, optional for "custom" requirements.
   * </pre>
   */
  java.lang.String getValue(int index);
  /**
   * <code>repeated string value = 7;</code>
   *
   * <pre>
   * The value banned, optional for "custom" requirements.
   * </pre>
   */
  com.google.protobuf.ByteString
      getValueBytes(int index);

  // optional string java_class = 8;
  /**
   * <code>optional string java_class = 8;</code>
   *
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   */
  boolean hasJavaClass();
  /**
   * <code>optional string java_class = 8;</code>
   *
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   */
  java.lang.String getJavaClass();
  /**
   * <code>optional string java_class = 8;</code>
   *
   * <pre>
   * For "custom" requirements, the Java class used to enforce the requirement.
   * Ignored otherwise.
   * </pre>
   */
  com.google.protobuf.ByteString
      getJavaClassBytes();

  // optional string rule_id = 9;
  /**
   * <code>optional string rule_id = 9;</code>
   *
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   */
  boolean hasRuleId();
  /**
   * <code>optional string rule_id = 9;</code>
   *
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   */
  java.lang.String getRuleId();
  /**
   * <code>optional string rule_id = 9;</code>
   *
   * <pre>
   * Gives the rule an unique ID that can be used for extending in other rules
   * through 'extends'. An example of ID is 'closure:innerHtml'.
   * </pre>
   */
  com.google.protobuf.ByteString
      getRuleIdBytes();

  // optional string extends = 10;
  /**
   * <code>optional string extends = 10;</code>
   *
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   */
  boolean hasExtends();
  /**
   * <code>optional string extends = 10;</code>
   *
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   */
  java.lang.String getExtends();
  /**
   * <code>optional string extends = 10;</code>
   *
   * <pre>
   * Allows extending whitelists of rules with the specified rule_id. If this
   * field is specified then all fields except whitelist, whitelist_regexp,
   * only_apply_to and only_apply_to_regexp are ignored.
   * </pre>
   */
  com.google.protobuf.ByteString
      getExtendsBytes();
}
