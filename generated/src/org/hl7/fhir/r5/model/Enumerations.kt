package org.hl7.fhir.r5.model


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Mon, May 3, 2021 21:09-0400 for FHIR v4.5.0


import org.hl7.fhir.instance.model.api.*
import org.hl7.fhir.exceptions.FHIRException

class Enumerations {

// In here: 
//   ActionCardinalityBehavior: Defines behavior for an action or a group for how many times that item may be repeated.[PlanDefinition, RequestGroup]
//   ActionConditionKind: Defines the kinds of conditions that can appear on actions.[PlanDefinition, RequestGroup]
//   ActionGroupingBehavior: Defines organization behavior of a group.[PlanDefinition, RequestGroup]
//   ActionParticipantType: The type of participant for the action.[ActivityDefinition, PlanDefinition]
//   ActionPrecheckBehavior: Defines selection frequency behavior for an action or group.[PlanDefinition, RequestGroup]
//   ActionRelationshipType: Defines the types of relationships between actions.[PlanDefinition, RequestGroup]
//   ActionRequiredBehavior: Defines expectations around whether an action or action group is required.[PlanDefinition, RequestGroup]
//   ActionSelectionBehavior: Defines selection behavior of a group.[PlanDefinition, RequestGroup]
//   AdministrativeGender: The gender of a person used for administrative purposes.[ObservationDefinition, Patient, Person, Practitioner, RelatedPerson]
//   BindingStrength: Indication of the degree of conformance expectations associated with a binding.[ElementDefinition, OperationDefinition]
//   CapabilityStatementKind: How a capability statement is intended to be used.[CapabilityStatement, CapabilityStatement2, TerminologyCapabilities]
//   ClaimProcessingCodes: This value set includes Claim Processing Outcome codes.[ClaimResponse, CoverageEligibilityResponse, EnrollmentResponse, ExplanationOfBenefit, PaymentReconciliation]
//   CompartmentType: Which type a compartment definition describes.[CompartmentDefinition, GraphDefinition]
//   CompositionStatus: The workflow/clinical status of the composition.[Composition, DocumentReference]
//   ConceptMapRelationship: The relationship between concepts.[ConceptMap]
//   DaysOfWeek: The days of the week.[HealthcareService, Location, PractitionerRole, Timing]
//   DeviceNameType: The type of name the device is referred by.[Device, DeviceDefinition]
//   DocumentReferenceStatus: The status of the document reference.[DocumentManifest, DocumentReference]
//   DocumentRelationshipType: The type of relationship between documents.[Composition, DocumentReference]
//   EventStatus: Codes identifying the lifecycle stage of an event.[ClinicalImpression, Communication, NutritionIntake, Procedure]
//   EvidenceVariableHandling: The handling of the variable in statistical analysis for exposures or outcomes (E.g. Dichotomous, Continuous, Descriptive).[EvidenceVariable, Statistic]
//   FHIRAllTypes: A list of all the concrete types defined in this version of the FHIR specification - Abstract Types, Data Types and Resource Types.[DataRequirement, OperationDefinition, ParameterDefinition]
//   FHIRVersion: All published FHIR Versions.[CapabilityStatement, CapabilityStatement2, ImplementationGuide, StructureDefinition]
//   FilterOperator: The kind of operation to perform as a part of a property based filter.[CodeSystem, ValueSet]
//   FinancialResourceStatusCodes: This value set includes Status codes.[Claim, ClaimResponse, Coverage, CoverageEligibilityRequest, CoverageEligibilityResponse, EnrollmentRequest, EnrollmentResponse, PaymentNotice, PaymentReconciliation, VisionPrescription]
//   InvoicePriceComponentType: Codes indicating the kind of the price component.[ChargeItemDefinition, Invoice]
//   ListMode: The processing mode that applies to this list.[Composition, EvidenceReport, List]
//   MeasureImprovementNotation: Observation values that indicate what change in a measurement value or score is indicative of an improvement in the measured item or scored issue.[Measure, MeasureReport]
//   MimeTypes: This value set includes all possible codes from BCP-13 (http://tools.ietf.org/html/bcp13)[Attachment, Binary, CapabilityStatement, CapabilityStatement2, ElementDefinition, Endpoint, Signature, Subscription, TestScript]
//   NoteType: The presentation types of notes.[ClaimResponse, ExplanationOfBenefit, PaymentReconciliation]
//   ObservationStatus: Codes providing the status of an observation.[DetectedIssue, Observation, RiskAssessment]
//   OperationParameterUse: Whether an operation parameter is an input or an output parameter.[OperationDefinition, ParameterDefinition]
//   ParticipationStatus: The Participation status of an appointment.[Appointment, AppointmentResponse]
//   PublicationStatus: The lifecycle status of an artifact.[ActivityDefinition, CanonicalResource, CapabilityStatement, CapabilityStatement2, ChargeItemDefinition, Citation, CodeSystem, CompartmentDefinition, ConceptMap, ConditionDefinition, EventDefinition, Evidence, EvidenceReport, EvidenceVariable, ExampleScenario, GraphDefinition, ImplementationGuide, InsurancePlan, Library, Measure, MessageDefinition, NamingSystem, ObservationDefinition, OperationDefinition, PlanDefinition, Questionnaire, SearchParameter, SpecimenDefinition, StructureDefinition, StructureMap, SubscriptionTopic, TerminologyCapabilities, TestScript, ValueSet]
//   QuantityComparator: How the Quantity should be understood and represented.[Age, Count, Distance, Duration, Quantity]
//   RequestIntent: Codes indicating the degree of authority/intentionality associated with a request.[ActivityDefinition, DeviceRequest, NutritionOrder, RequestGroup, ServiceRequest]
//   RequestPriority: The clinical priority of a diagnostic order.[ActivityDefinition, Communication, CommunicationRequest, DeviceRequest, MedicationRequest, PlanDefinition, RequestGroup, ServiceRequest, SupplyRequest, Task]
//   RequestStatus: Codes identifying the lifecycle stage of a request.[CarePlan, CommunicationRequest, DeviceRequest, NutritionOrder, RequestGroup, ServiceRequest]
//   ResourceTypeEnum: One of the resource types defined as part of this version of FHIR.[CapabilityStatement, CapabilityStatement2, CompartmentDefinition, ExampleScenario, GraphDefinition, ImplementationGuide, MessageDefinition, OperationDefinition, Questionnaire, SearchParameter, SubscriptionTopic]
//   RestfulCapabilityMode: The mode of a RESTful capability statement.[CapabilityStatement, CapabilityStatement2]
//   SearchParamType: Data types allowed to be used for search parameters.[CapabilityStatement, CapabilityStatement2, OperationDefinition, SearchParameter]
//   SubscriptionSearchModifier: FHIR search modifiers allowed for use in Subscriptions and SubscriptionTopics.[Subscription, SubscriptionTopic]
//   SubscriptionState: State values for FHIR Subscriptions.[Subscription, SubscriptionStatus]
//   Use: The purpose of the Claim: predetermination, preauthorization, claim.[Claim, ClaimResponse, ExplanationOfBenefit]


	enum class ActionCardinalityBehavior {
		/**
		* The action may only be selected one time.
		*/
		SINGLE, 
		/**
		* The action may be selected multiple times.
		*/
		MULTIPLE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				SINGLE -> "single"
				MULTIPLE -> "multiple"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				SINGLE -> "http://hl7.org/fhir/action-cardinality-behavior"
				MULTIPLE -> "http://hl7.org/fhir/action-cardinality-behavior"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				SINGLE -> "The action may only be selected one time."
				MULTIPLE -> "The action may be selected multiple times."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				SINGLE -> "Single";
				MULTIPLE -> "Multiple";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionCardinalityBehavior? {
				if (codeString == null || "" == codeString) return null
				if ("single" == codeString) return SINGLE
				if ("multiple" == codeString) return MULTIPLE
				throw FHIRException("Unknown ActionCardinalityBehavior code '"$codeString"'")
			}
		}
	}

	class ActionCardinalityBehaviorEnumFactory : EnumFactory<ActionCardinalityBehavior> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionCardinalityBehavior? {
			if (codeString == null || "" == codeString) return null
			if ("single" == codeString) return ActionCardinalityBehavior.SINGLE
			if ("multiple" == codeString) return ActionCardinalityBehavior.MULTIPLE
			throw IllegalArgumentException("Unknown ActionCardinalityBehavior code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionCardinalityBehavior>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("single" == codeString) return new Enumeration(this, ActionCardinalityBehavior.SINGLE)
			if ("multiple" == codeString) return new Enumeration(this, ActionCardinalityBehavior.MULTIPLE)
			throw FHIRException("Unknown ActionCardinalityBehavior code '$codeString'")
		}
		override fun toCode(code: ActionCardinalityBehavior): String? {
			return when (code) {
				ActionCardinalityBehavior.SINGLE -> "single"
				ActionCardinalityBehavior.MULTIPLE -> "multiple"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionCardinalityBehavior): String? {
			return code.system
		}
    }

	enum class ActionConditionKind {
		/**
		* The condition describes whether or not a given action is applicable.
		*/
		APPLICABILITY, 
		/**
		* The condition is a starting condition for the action.
		*/
		START, 
		/**
		* The condition is a stop, or exit condition for the action.
		*/
		STOP, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				APPLICABILITY -> "applicability"
				START -> "start"
				STOP -> "stop"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				APPLICABILITY -> "http://hl7.org/fhir/action-condition-kind"
				START -> "http://hl7.org/fhir/action-condition-kind"
				STOP -> "http://hl7.org/fhir/action-condition-kind"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				APPLICABILITY -> "The condition describes whether or not a given action is applicable."
				START -> "The condition is a starting condition for the action."
				STOP -> "The condition is a stop, or exit condition for the action."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				APPLICABILITY -> "Applicability";
				START -> "Start";
				STOP -> "Stop";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionConditionKind? {
				if (codeString == null || "" == codeString) return null
				if ("applicability" == codeString) return APPLICABILITY
				if ("start" == codeString) return START
				if ("stop" == codeString) return STOP
				throw FHIRException("Unknown ActionConditionKind code '"$codeString"'")
			}
		}
	}

	class ActionConditionKindEnumFactory : EnumFactory<ActionConditionKind> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionConditionKind? {
			if (codeString == null || "" == codeString) return null
			if ("applicability" == codeString) return ActionConditionKind.APPLICABILITY
			if ("start" == codeString) return ActionConditionKind.START
			if ("stop" == codeString) return ActionConditionKind.STOP
			throw IllegalArgumentException("Unknown ActionConditionKind code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionConditionKind>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("applicability" == codeString) return new Enumeration(this, ActionConditionKind.APPLICABILITY)
			if ("start" == codeString) return new Enumeration(this, ActionConditionKind.START)
			if ("stop" == codeString) return new Enumeration(this, ActionConditionKind.STOP)
			throw FHIRException("Unknown ActionConditionKind code '$codeString'")
		}
		override fun toCode(code: ActionConditionKind): String? {
			return when (code) {
				ActionConditionKind.APPLICABILITY -> "applicability"
				ActionConditionKind.START -> "start"
				ActionConditionKind.STOP -> "stop"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionConditionKind): String? {
			return code.system
		}
    }

	enum class ActionGroupingBehavior {
		/**
		* Any group marked with this behavior should be displayed as a visual group to the end user.
		*/
		VISUALGROUP, 
		/**
		* A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.
		*/
		LOGICALGROUP, 
		/**
		* A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne".
		*/
		SENTENCEGROUP, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				VISUALGROUP -> "visual-group"
				LOGICALGROUP -> "logical-group"
				SENTENCEGROUP -> "sentence-group"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				VISUALGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
				LOGICALGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
				SENTENCEGROUP -> "http://hl7.org/fhir/action-grouping-behavior"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				VISUALGROUP -> "Any group marked with this behavior should be displayed as a visual group to the end user."
				LOGICALGROUP -> "A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so."
				SENTENCEGROUP -> "A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are \"aspirin, 500 mg, 2 times per day\" and \"aspirin, 300 mg, 3 times per day\". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of \"AtMostOne\", unless it's a required action, in which case, it would be \"ExactlyOne\"."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				VISUALGROUP -> "Visual Group";
				LOGICALGROUP -> "Logical Group";
				SENTENCEGROUP -> "Sentence Group";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionGroupingBehavior? {
				if (codeString == null || "" == codeString) return null
				if ("visual-group" == codeString) return VISUALGROUP
				if ("logical-group" == codeString) return LOGICALGROUP
				if ("sentence-group" == codeString) return SENTENCEGROUP
				throw FHIRException("Unknown ActionGroupingBehavior code '"$codeString"'")
			}
		}
	}

	class ActionGroupingBehaviorEnumFactory : EnumFactory<ActionGroupingBehavior> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionGroupingBehavior? {
			if (codeString == null || "" == codeString) return null
			if ("visual-group" == codeString) return ActionGroupingBehavior.VISUALGROUP
			if ("logical-group" == codeString) return ActionGroupingBehavior.LOGICALGROUP
			if ("sentence-group" == codeString) return ActionGroupingBehavior.SENTENCEGROUP
			throw IllegalArgumentException("Unknown ActionGroupingBehavior code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionGroupingBehavior>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("visual-group" == codeString) return new Enumeration(this, ActionGroupingBehavior.VISUALGROUP)
			if ("logical-group" == codeString) return new Enumeration(this, ActionGroupingBehavior.LOGICALGROUP)
			if ("sentence-group" == codeString) return new Enumeration(this, ActionGroupingBehavior.SENTENCEGROUP)
			throw FHIRException("Unknown ActionGroupingBehavior code '$codeString'")
		}
		override fun toCode(code: ActionGroupingBehavior): String? {
			return when (code) {
				ActionGroupingBehavior.VISUALGROUP -> "visual-group"
				ActionGroupingBehavior.LOGICALGROUP -> "logical-group"
				ActionGroupingBehavior.SENTENCEGROUP -> "sentence-group"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionGroupingBehavior): String? {
			return code.system
		}
    }

	enum class ActionParticipantType {
		/**
		* The participant is the patient under evaluation.
		*/
		PATIENT, 
		/**
		* The participant is a practitioner involved in the patient's care.
		*/
		PRACTITIONER, 
		/**
		* The participant is a person related to the patient.
		*/
		RELATEDPERSON, 
		/**
		* The participant is a system or device used in the care of the patient.
		*/
		DEVICE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				PATIENT -> "patient"
				PRACTITIONER -> "practitioner"
				RELATEDPERSON -> "related-person"
				DEVICE -> "device"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				PATIENT -> "http://hl7.org/fhir/action-participant-type"
				PRACTITIONER -> "http://hl7.org/fhir/action-participant-type"
				RELATEDPERSON -> "http://hl7.org/fhir/action-participant-type"
				DEVICE -> "http://hl7.org/fhir/action-participant-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				PATIENT -> "The participant is the patient under evaluation."
				PRACTITIONER -> "The participant is a practitioner involved in the patient's care."
				RELATEDPERSON -> "The participant is a person related to the patient."
				DEVICE -> "The participant is a system or device used in the care of the patient."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				PATIENT -> "Patient";
				PRACTITIONER -> "Practitioner";
				RELATEDPERSON -> "Related Person";
				DEVICE -> "Device";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionParticipantType? {
				if (codeString == null || "" == codeString) return null
				if ("patient" == codeString) return PATIENT
				if ("practitioner" == codeString) return PRACTITIONER
				if ("related-person" == codeString) return RELATEDPERSON
				if ("device" == codeString) return DEVICE
				throw FHIRException("Unknown ActionParticipantType code '"$codeString"'")
			}
		}
	}

	class ActionParticipantTypeEnumFactory : EnumFactory<ActionParticipantType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionParticipantType? {
			if (codeString == null || "" == codeString) return null
			if ("patient" == codeString) return ActionParticipantType.PATIENT
			if ("practitioner" == codeString) return ActionParticipantType.PRACTITIONER
			if ("related-person" == codeString) return ActionParticipantType.RELATEDPERSON
			if ("device" == codeString) return ActionParticipantType.DEVICE
			throw IllegalArgumentException("Unknown ActionParticipantType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionParticipantType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("patient" == codeString) return new Enumeration(this, ActionParticipantType.PATIENT)
			if ("practitioner" == codeString) return new Enumeration(this, ActionParticipantType.PRACTITIONER)
			if ("related-person" == codeString) return new Enumeration(this, ActionParticipantType.RELATEDPERSON)
			if ("device" == codeString) return new Enumeration(this, ActionParticipantType.DEVICE)
			throw FHIRException("Unknown ActionParticipantType code '$codeString'")
		}
		override fun toCode(code: ActionParticipantType): String? {
			return when (code) {
				ActionParticipantType.PATIENT -> "patient"
				ActionParticipantType.PRACTITIONER -> "practitioner"
				ActionParticipantType.RELATEDPERSON -> "related-person"
				ActionParticipantType.DEVICE -> "device"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionParticipantType): String? {
			return code.system
		}
    }

	enum class ActionPrecheckBehavior {
		/**
		* An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider "pre-checking" such an action as a convenience for the user.
		*/
		YES, 
		/**
		* An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not "pre-check" such an action.
		*/
		NO, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				YES -> "yes"
				NO -> "no"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				YES -> "http://hl7.org/fhir/action-precheck-behavior"
				NO -> "http://hl7.org/fhir/action-precheck-behavior"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				YES -> "An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider \"pre-checking\" such an action as a convenience for the user."
				NO -> "An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not \"pre-check\" such an action."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				YES -> "Yes";
				NO -> "No";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionPrecheckBehavior? {
				if (codeString == null || "" == codeString) return null
				if ("yes" == codeString) return YES
				if ("no" == codeString) return NO
				throw FHIRException("Unknown ActionPrecheckBehavior code '"$codeString"'")
			}
		}
	}

	class ActionPrecheckBehaviorEnumFactory : EnumFactory<ActionPrecheckBehavior> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionPrecheckBehavior? {
			if (codeString == null || "" == codeString) return null
			if ("yes" == codeString) return ActionPrecheckBehavior.YES
			if ("no" == codeString) return ActionPrecheckBehavior.NO
			throw IllegalArgumentException("Unknown ActionPrecheckBehavior code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionPrecheckBehavior>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("yes" == codeString) return new Enumeration(this, ActionPrecheckBehavior.YES)
			if ("no" == codeString) return new Enumeration(this, ActionPrecheckBehavior.NO)
			throw FHIRException("Unknown ActionPrecheckBehavior code '$codeString'")
		}
		override fun toCode(code: ActionPrecheckBehavior): String? {
			return when (code) {
				ActionPrecheckBehavior.YES -> "yes"
				ActionPrecheckBehavior.NO -> "no"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionPrecheckBehavior): String? {
			return code.system
		}
    }

	enum class ActionRelationshipType {
		/**
		* The action must be performed before the start of the related action.
		*/
		BEFORESTART, 
		/**
		* The action must be performed before the related action.
		*/
		BEFORE, 
		/**
		* The action must be performed before the end of the related action.
		*/
		BEFOREEND, 
		/**
		* The action must be performed concurrent with the start of the related action.
		*/
		CONCURRENTWITHSTART, 
		/**
		* The action must be performed concurrent with the related action.
		*/
		CONCURRENT, 
		/**
		* The action must be performed concurrent with the end of the related action.
		*/
		CONCURRENTWITHEND, 
		/**
		* The action must be performed after the start of the related action.
		*/
		AFTERSTART, 
		/**
		* The action must be performed after the related action.
		*/
		AFTER, 
		/**
		* The action must be performed after the end of the related action.
		*/
		AFTEREND, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				BEFORESTART -> "before-start"
				BEFORE -> "before"
				BEFOREEND -> "before-end"
				CONCURRENTWITHSTART -> "concurrent-with-start"
				CONCURRENT -> "concurrent"
				CONCURRENTWITHEND -> "concurrent-with-end"
				AFTERSTART -> "after-start"
				AFTER -> "after"
				AFTEREND -> "after-end"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				BEFORESTART -> "http://hl7.org/fhir/action-relationship-type"
				BEFORE -> "http://hl7.org/fhir/action-relationship-type"
				BEFOREEND -> "http://hl7.org/fhir/action-relationship-type"
				CONCURRENTWITHSTART -> "http://hl7.org/fhir/action-relationship-type"
				CONCURRENT -> "http://hl7.org/fhir/action-relationship-type"
				CONCURRENTWITHEND -> "http://hl7.org/fhir/action-relationship-type"
				AFTERSTART -> "http://hl7.org/fhir/action-relationship-type"
				AFTER -> "http://hl7.org/fhir/action-relationship-type"
				AFTEREND -> "http://hl7.org/fhir/action-relationship-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				BEFORESTART -> "The action must be performed before the start of the related action."
				BEFORE -> "The action must be performed before the related action."
				BEFOREEND -> "The action must be performed before the end of the related action."
				CONCURRENTWITHSTART -> "The action must be performed concurrent with the start of the related action."
				CONCURRENT -> "The action must be performed concurrent with the related action."
				CONCURRENTWITHEND -> "The action must be performed concurrent with the end of the related action."
				AFTERSTART -> "The action must be performed after the start of the related action."
				AFTER -> "The action must be performed after the related action."
				AFTEREND -> "The action must be performed after the end of the related action."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				BEFORESTART -> "Before Start";
				BEFORE -> "Before";
				BEFOREEND -> "Before End";
				CONCURRENTWITHSTART -> "Concurrent With Start";
				CONCURRENT -> "Concurrent";
				CONCURRENTWITHEND -> "Concurrent With End";
				AFTERSTART -> "After Start";
				AFTER -> "After";
				AFTEREND -> "After End";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionRelationshipType? {
				if (codeString == null || "" == codeString) return null
				if ("before-start" == codeString) return BEFORESTART
				if ("before" == codeString) return BEFORE
				if ("before-end" == codeString) return BEFOREEND
				if ("concurrent-with-start" == codeString) return CONCURRENTWITHSTART
				if ("concurrent" == codeString) return CONCURRENT
				if ("concurrent-with-end" == codeString) return CONCURRENTWITHEND
				if ("after-start" == codeString) return AFTERSTART
				if ("after" == codeString) return AFTER
				if ("after-end" == codeString) return AFTEREND
				throw FHIRException("Unknown ActionRelationshipType code '"$codeString"'")
			}
		}
	}

	class ActionRelationshipTypeEnumFactory : EnumFactory<ActionRelationshipType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionRelationshipType? {
			if (codeString == null || "" == codeString) return null
			if ("before-start" == codeString) return ActionRelationshipType.BEFORESTART
			if ("before" == codeString) return ActionRelationshipType.BEFORE
			if ("before-end" == codeString) return ActionRelationshipType.BEFOREEND
			if ("concurrent-with-start" == codeString) return ActionRelationshipType.CONCURRENTWITHSTART
			if ("concurrent" == codeString) return ActionRelationshipType.CONCURRENT
			if ("concurrent-with-end" == codeString) return ActionRelationshipType.CONCURRENTWITHEND
			if ("after-start" == codeString) return ActionRelationshipType.AFTERSTART
			if ("after" == codeString) return ActionRelationshipType.AFTER
			if ("after-end" == codeString) return ActionRelationshipType.AFTEREND
			throw IllegalArgumentException("Unknown ActionRelationshipType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionRelationshipType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("before-start" == codeString) return new Enumeration(this, ActionRelationshipType.BEFORESTART)
			if ("before" == codeString) return new Enumeration(this, ActionRelationshipType.BEFORE)
			if ("before-end" == codeString) return new Enumeration(this, ActionRelationshipType.BEFOREEND)
			if ("concurrent-with-start" == codeString) return new Enumeration(this, ActionRelationshipType.CONCURRENTWITHSTART)
			if ("concurrent" == codeString) return new Enumeration(this, ActionRelationshipType.CONCURRENT)
			if ("concurrent-with-end" == codeString) return new Enumeration(this, ActionRelationshipType.CONCURRENTWITHEND)
			if ("after-start" == codeString) return new Enumeration(this, ActionRelationshipType.AFTERSTART)
			if ("after" == codeString) return new Enumeration(this, ActionRelationshipType.AFTER)
			if ("after-end" == codeString) return new Enumeration(this, ActionRelationshipType.AFTEREND)
			throw FHIRException("Unknown ActionRelationshipType code '$codeString'")
		}
		override fun toCode(code: ActionRelationshipType): String? {
			return when (code) {
				ActionRelationshipType.BEFORESTART -> "before-start"
				ActionRelationshipType.BEFORE -> "before"
				ActionRelationshipType.BEFOREEND -> "before-end"
				ActionRelationshipType.CONCURRENTWITHSTART -> "concurrent-with-start"
				ActionRelationshipType.CONCURRENT -> "concurrent"
				ActionRelationshipType.CONCURRENTWITHEND -> "concurrent-with-end"
				ActionRelationshipType.AFTERSTART -> "after-start"
				ActionRelationshipType.AFTER -> "after"
				ActionRelationshipType.AFTEREND -> "after-end"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionRelationshipType): String? {
			return code.system
		}
    }

	enum class ActionRequiredBehavior {
		/**
		* An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.
		*/
		MUST, 
		/**
		* An action with this behavior may be included in the set of actions processed by the end user.
		*/
		COULD, 
		/**
		* An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.
		*/
		MUSTUNLESSDOCUMENTED, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				MUST -> "must"
				COULD -> "could"
				MUSTUNLESSDOCUMENTED -> "must-unless-documented"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				MUST -> "http://hl7.org/fhir/action-required-behavior"
				COULD -> "http://hl7.org/fhir/action-required-behavior"
				MUSTUNLESSDOCUMENTED -> "http://hl7.org/fhir/action-required-behavior"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				MUST -> "An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action."
				COULD -> "An action with this behavior may be included in the set of actions processed by the end user."
				MUSTUNLESSDOCUMENTED -> "An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				MUST -> "Must";
				COULD -> "Could";
				MUSTUNLESSDOCUMENTED -> "Must Unless Documented";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionRequiredBehavior? {
				if (codeString == null || "" == codeString) return null
				if ("must" == codeString) return MUST
				if ("could" == codeString) return COULD
				if ("must-unless-documented" == codeString) return MUSTUNLESSDOCUMENTED
				throw FHIRException("Unknown ActionRequiredBehavior code '"$codeString"'")
			}
		}
	}

	class ActionRequiredBehaviorEnumFactory : EnumFactory<ActionRequiredBehavior> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionRequiredBehavior? {
			if (codeString == null || "" == codeString) return null
			if ("must" == codeString) return ActionRequiredBehavior.MUST
			if ("could" == codeString) return ActionRequiredBehavior.COULD
			if ("must-unless-documented" == codeString) return ActionRequiredBehavior.MUSTUNLESSDOCUMENTED
			throw IllegalArgumentException("Unknown ActionRequiredBehavior code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionRequiredBehavior>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("must" == codeString) return new Enumeration(this, ActionRequiredBehavior.MUST)
			if ("could" == codeString) return new Enumeration(this, ActionRequiredBehavior.COULD)
			if ("must-unless-documented" == codeString) return new Enumeration(this, ActionRequiredBehavior.MUSTUNLESSDOCUMENTED)
			throw FHIRException("Unknown ActionRequiredBehavior code '$codeString'")
		}
		override fun toCode(code: ActionRequiredBehavior): String? {
			return when (code) {
				ActionRequiredBehavior.MUST -> "must"
				ActionRequiredBehavior.COULD -> "could"
				ActionRequiredBehavior.MUSTUNLESSDOCUMENTED -> "must-unless-documented"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionRequiredBehavior): String? {
			return code.system
		}
    }

	enum class ActionSelectionBehavior {
		/**
		* Any number of the actions in the group may be chosen, from zero to all.
		*/
		ANY, 
		/**
		* All the actions in the group must be selected as a single unit.
		*/
		ALL, 
		/**
		* All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.
		*/
		ALLORNONE, 
		/**
		* The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.
		*/
		EXACTLYONE, 
		/**
		* The end user may choose zero or at most one of the actions in the group.
		*/
		ATMOSTONE, 
		/**
		* The end user must choose a minimum of one, and as many additional as desired.
		*/
		ONEORMORE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ANY -> "any"
				ALL -> "all"
				ALLORNONE -> "all-or-none"
				EXACTLYONE -> "exactly-one"
				ATMOSTONE -> "at-most-one"
				ONEORMORE -> "one-or-more"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ANY -> "http://hl7.org/fhir/action-selection-behavior"
				ALL -> "http://hl7.org/fhir/action-selection-behavior"
				ALLORNONE -> "http://hl7.org/fhir/action-selection-behavior"
				EXACTLYONE -> "http://hl7.org/fhir/action-selection-behavior"
				ATMOSTONE -> "http://hl7.org/fhir/action-selection-behavior"
				ONEORMORE -> "http://hl7.org/fhir/action-selection-behavior"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ANY -> "Any number of the actions in the group may be chosen, from zero to all."
				ALL -> "All the actions in the group must be selected as a single unit."
				ALLORNONE -> "All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected."
				EXACTLYONE -> "The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group."
				ATMOSTONE -> "The end user may choose zero or at most one of the actions in the group."
				ONEORMORE -> "The end user must choose a minimum of one, and as many additional as desired."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ANY -> "Any";
				ALL -> "All";
				ALLORNONE -> "All Or None";
				EXACTLYONE -> "Exactly One";
				ATMOSTONE -> "At Most One";
				ONEORMORE -> "One Or More";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ActionSelectionBehavior? {
				if (codeString == null || "" == codeString) return null
				if ("any" == codeString) return ANY
				if ("all" == codeString) return ALL
				if ("all-or-none" == codeString) return ALLORNONE
				if ("exactly-one" == codeString) return EXACTLYONE
				if ("at-most-one" == codeString) return ATMOSTONE
				if ("one-or-more" == codeString) return ONEORMORE
				throw FHIRException("Unknown ActionSelectionBehavior code '"$codeString"'")
			}
		}
	}

	class ActionSelectionBehaviorEnumFactory : EnumFactory<ActionSelectionBehavior> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ActionSelectionBehavior? {
			if (codeString == null || "" == codeString) return null
			if ("any" == codeString) return ActionSelectionBehavior.ANY
			if ("all" == codeString) return ActionSelectionBehavior.ALL
			if ("all-or-none" == codeString) return ActionSelectionBehavior.ALLORNONE
			if ("exactly-one" == codeString) return ActionSelectionBehavior.EXACTLYONE
			if ("at-most-one" == codeString) return ActionSelectionBehavior.ATMOSTONE
			if ("one-or-more" == codeString) return ActionSelectionBehavior.ONEORMORE
			throw IllegalArgumentException("Unknown ActionSelectionBehavior code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ActionSelectionBehavior>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("any" == codeString) return new Enumeration(this, ActionSelectionBehavior.ANY)
			if ("all" == codeString) return new Enumeration(this, ActionSelectionBehavior.ALL)
			if ("all-or-none" == codeString) return new Enumeration(this, ActionSelectionBehavior.ALLORNONE)
			if ("exactly-one" == codeString) return new Enumeration(this, ActionSelectionBehavior.EXACTLYONE)
			if ("at-most-one" == codeString) return new Enumeration(this, ActionSelectionBehavior.ATMOSTONE)
			if ("one-or-more" == codeString) return new Enumeration(this, ActionSelectionBehavior.ONEORMORE)
			throw FHIRException("Unknown ActionSelectionBehavior code '$codeString'")
		}
		override fun toCode(code: ActionSelectionBehavior): String? {
			return when (code) {
				ActionSelectionBehavior.ANY -> "any"
				ActionSelectionBehavior.ALL -> "all"
				ActionSelectionBehavior.ALLORNONE -> "all-or-none"
				ActionSelectionBehavior.EXACTLYONE -> "exactly-one"
				ActionSelectionBehavior.ATMOSTONE -> "at-most-one"
				ActionSelectionBehavior.ONEORMORE -> "one-or-more"
				NULL -> null
			}
		}
		override fun toSystem(code: ActionSelectionBehavior): String? {
			return code.system
		}
    }

	enum class AdministrativeGender {
		/**
		* Male.
		*/
		MALE, 
		/**
		* Female.
		*/
		FEMALE, 
		/**
		* Other.
		*/
		OTHER, 
		/**
		* Unknown.
		*/
		UNKNOWN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				MALE -> "male"
				FEMALE -> "female"
				OTHER -> "other"
				UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				MALE -> "http://hl7.org/fhir/administrative-gender"
				FEMALE -> "http://hl7.org/fhir/administrative-gender"
				OTHER -> "http://hl7.org/fhir/administrative-gender"
				UNKNOWN -> "http://hl7.org/fhir/administrative-gender"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				MALE -> "Male."
				FEMALE -> "Female."
				OTHER -> "Other."
				UNKNOWN -> "Unknown."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				MALE -> "Male";
				FEMALE -> "Female";
				OTHER -> "Other";
				UNKNOWN -> "Unknown";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): AdministrativeGender? {
				if (codeString == null || "" == codeString) return null
				if ("male" == codeString) return MALE
				if ("female" == codeString) return FEMALE
				if ("other" == codeString) return OTHER
				if ("unknown" == codeString) return UNKNOWN
				throw FHIRException("Unknown AdministrativeGender code '"$codeString"'")
			}
		}
	}

	class AdministrativeGenderEnumFactory : EnumFactory<AdministrativeGender> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): AdministrativeGender? {
			if (codeString == null || "" == codeString) return null
			if ("male" == codeString) return AdministrativeGender.MALE
			if ("female" == codeString) return AdministrativeGender.FEMALE
			if ("other" == codeString) return AdministrativeGender.OTHER
			if ("unknown" == codeString) return AdministrativeGender.UNKNOWN
			throw IllegalArgumentException("Unknown AdministrativeGender code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<AdministrativeGender>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("male" == codeString) return new Enumeration(this, AdministrativeGender.MALE)
			if ("female" == codeString) return new Enumeration(this, AdministrativeGender.FEMALE)
			if ("other" == codeString) return new Enumeration(this, AdministrativeGender.OTHER)
			if ("unknown" == codeString) return new Enumeration(this, AdministrativeGender.UNKNOWN)
			throw FHIRException("Unknown AdministrativeGender code '$codeString'")
		}
		override fun toCode(code: AdministrativeGender): String? {
			return when (code) {
				AdministrativeGender.MALE -> "male"
				AdministrativeGender.FEMALE -> "female"
				AdministrativeGender.OTHER -> "other"
				AdministrativeGender.UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		override fun toSystem(code: AdministrativeGender): String? {
			return code.system
		}
    }

	enum class BindingStrength {
		/**
		* To be conformant, the concept in this element SHALL be from the specified value set.
		*/
		REQUIRED, 
		/**
		* To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
		*/
		EXTENSIBLE, 
		/**
		* Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
		*/
		PREFERRED, 
		/**
		* Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
		*/
		EXAMPLE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				REQUIRED -> "required"
				EXTENSIBLE -> "extensible"
				PREFERRED -> "preferred"
				EXAMPLE -> "example"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				REQUIRED -> "http://hl7.org/fhir/binding-strength"
				EXTENSIBLE -> "http://hl7.org/fhir/binding-strength"
				PREFERRED -> "http://hl7.org/fhir/binding-strength"
				EXAMPLE -> "http://hl7.org/fhir/binding-strength"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				REQUIRED -> "To be conformant, the concept in this element SHALL be from the specified value set."
				EXTENSIBLE -> "To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead."
				PREFERRED -> "Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant."
				EXAMPLE -> "Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				REQUIRED -> "Required";
				EXTENSIBLE -> "Extensible";
				PREFERRED -> "Preferred";
				EXAMPLE -> "Example";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): BindingStrength? {
				if (codeString == null || "" == codeString) return null
				if ("required" == codeString) return REQUIRED
				if ("extensible" == codeString) return EXTENSIBLE
				if ("preferred" == codeString) return PREFERRED
				if ("example" == codeString) return EXAMPLE
				throw FHIRException("Unknown BindingStrength code '"$codeString"'")
			}
		}
	}

	class BindingStrengthEnumFactory : EnumFactory<BindingStrength> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): BindingStrength? {
			if (codeString == null || "" == codeString) return null
			if ("required" == codeString) return BindingStrength.REQUIRED
			if ("extensible" == codeString) return BindingStrength.EXTENSIBLE
			if ("preferred" == codeString) return BindingStrength.PREFERRED
			if ("example" == codeString) return BindingStrength.EXAMPLE
			throw IllegalArgumentException("Unknown BindingStrength code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<BindingStrength>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("required" == codeString) return new Enumeration(this, BindingStrength.REQUIRED)
			if ("extensible" == codeString) return new Enumeration(this, BindingStrength.EXTENSIBLE)
			if ("preferred" == codeString) return new Enumeration(this, BindingStrength.PREFERRED)
			if ("example" == codeString) return new Enumeration(this, BindingStrength.EXAMPLE)
			throw FHIRException("Unknown BindingStrength code '$codeString'")
		}
		override fun toCode(code: BindingStrength): String? {
			return when (code) {
				BindingStrength.REQUIRED -> "required"
				BindingStrength.EXTENSIBLE -> "extensible"
				BindingStrength.PREFERRED -> "preferred"
				BindingStrength.EXAMPLE -> "example"
				NULL -> null
			}
		}
		override fun toSystem(code: BindingStrength): String? {
			return code.system
		}
    }

	enum class CapabilityStatementKind {
		/**
		* The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by /metadata for a FHIR server end-point.
		*/
		INSTANCE, 
		/**
		* The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation.
		*/
		CAPABILITY, 
		/**
		* The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
		*/
		REQUIREMENTS, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				INSTANCE -> "instance"
				CAPABILITY -> "capability"
				REQUIREMENTS -> "requirements"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				INSTANCE -> "http://hl7.org/fhir/capability-statement-kind"
				CAPABILITY -> "http://hl7.org/fhir/capability-statement-kind"
				REQUIREMENTS -> "http://hl7.org/fhir/capability-statement-kind"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				INSTANCE -> "The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by /metadata for a FHIR server end-point."
				CAPABILITY -> "The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation."
				REQUIREMENTS -> "The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				INSTANCE -> "Instance";
				CAPABILITY -> "Capability";
				REQUIREMENTS -> "Requirements";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): CapabilityStatementKind? {
				if (codeString == null || "" == codeString) return null
				if ("instance" == codeString) return INSTANCE
				if ("capability" == codeString) return CAPABILITY
				if ("requirements" == codeString) return REQUIREMENTS
				throw FHIRException("Unknown CapabilityStatementKind code '"$codeString"'")
			}
		}
	}

	class CapabilityStatementKindEnumFactory : EnumFactory<CapabilityStatementKind> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): CapabilityStatementKind? {
			if (codeString == null || "" == codeString) return null
			if ("instance" == codeString) return CapabilityStatementKind.INSTANCE
			if ("capability" == codeString) return CapabilityStatementKind.CAPABILITY
			if ("requirements" == codeString) return CapabilityStatementKind.REQUIREMENTS
			throw IllegalArgumentException("Unknown CapabilityStatementKind code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<CapabilityStatementKind>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("instance" == codeString) return new Enumeration(this, CapabilityStatementKind.INSTANCE)
			if ("capability" == codeString) return new Enumeration(this, CapabilityStatementKind.CAPABILITY)
			if ("requirements" == codeString) return new Enumeration(this, CapabilityStatementKind.REQUIREMENTS)
			throw FHIRException("Unknown CapabilityStatementKind code '$codeString'")
		}
		override fun toCode(code: CapabilityStatementKind): String? {
			return when (code) {
				CapabilityStatementKind.INSTANCE -> "instance"
				CapabilityStatementKind.CAPABILITY -> "capability"
				CapabilityStatementKind.REQUIREMENTS -> "requirements"
				NULL -> null
			}
		}
		override fun toSystem(code: CapabilityStatementKind): String? {
			return code.system
		}
    }

	enum class ClaimProcessingCodes {
		/**
		* The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.
		*/
		QUEUED, 
		/**
		* The processing has completed without errors
		*/
		COMPLETE, 
		/**
		* One or more errors have been detected in the Claim
		*/
		ERROR, 
		/**
		* No errors have been detected in the Claim and some of the adjudication has been performed.
		*/
		PARTIAL, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				QUEUED -> "queued"
				COMPLETE -> "complete"
				ERROR -> "error"
				PARTIAL -> "partial"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				QUEUED -> "http://hl7.org/fhir/remittance-outcome"
				COMPLETE -> "http://hl7.org/fhir/remittance-outcome"
				ERROR -> "http://hl7.org/fhir/remittance-outcome"
				PARTIAL -> "http://hl7.org/fhir/remittance-outcome"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				QUEUED -> "The Claim/Pre-authorization/Pre-determination has been received but processing has not begun."
				COMPLETE -> "The processing has completed without errors"
				ERROR -> "One or more errors have been detected in the Claim"
				PARTIAL -> "No errors have been detected in the Claim and some of the adjudication has been performed."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				QUEUED -> "Queued";
				COMPLETE -> "Processing Complete";
				ERROR -> "Error";
				PARTIAL -> "Partial Processing";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ClaimProcessingCodes? {
				if (codeString == null || "" == codeString) return null
				if ("queued" == codeString) return QUEUED
				if ("complete" == codeString) return COMPLETE
				if ("error" == codeString) return ERROR
				if ("partial" == codeString) return PARTIAL
				throw FHIRException("Unknown ClaimProcessingCodes code '"$codeString"'")
			}
		}
	}

	class ClaimProcessingCodesEnumFactory : EnumFactory<ClaimProcessingCodes> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ClaimProcessingCodes? {
			if (codeString == null || "" == codeString) return null
			if ("queued" == codeString) return ClaimProcessingCodes.QUEUED
			if ("complete" == codeString) return ClaimProcessingCodes.COMPLETE
			if ("error" == codeString) return ClaimProcessingCodes.ERROR
			if ("partial" == codeString) return ClaimProcessingCodes.PARTIAL
			throw IllegalArgumentException("Unknown ClaimProcessingCodes code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ClaimProcessingCodes>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("queued" == codeString) return new Enumeration(this, ClaimProcessingCodes.QUEUED)
			if ("complete" == codeString) return new Enumeration(this, ClaimProcessingCodes.COMPLETE)
			if ("error" == codeString) return new Enumeration(this, ClaimProcessingCodes.ERROR)
			if ("partial" == codeString) return new Enumeration(this, ClaimProcessingCodes.PARTIAL)
			throw FHIRException("Unknown ClaimProcessingCodes code '$codeString'")
		}
		override fun toCode(code: ClaimProcessingCodes): String? {
			return when (code) {
				ClaimProcessingCodes.QUEUED -> "queued"
				ClaimProcessingCodes.COMPLETE -> "complete"
				ClaimProcessingCodes.ERROR -> "error"
				ClaimProcessingCodes.PARTIAL -> "partial"
				NULL -> null
			}
		}
		override fun toSystem(code: ClaimProcessingCodes): String? {
			return code.system
		}
    }

	enum class CompartmentType {
		/**
		* The compartment definition is for the patient compartment.
		*/
		PATIENT, 
		/**
		* The compartment definition is for the encounter compartment.
		*/
		ENCOUNTER, 
		/**
		* The compartment definition is for the related-person compartment.
		*/
		RELATEDPERSON, 
		/**
		* The compartment definition is for the practitioner compartment.
		*/
		PRACTITIONER, 
		/**
		* The compartment definition is for the device compartment.
		*/
		DEVICE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				PATIENT -> "Patient"
				ENCOUNTER -> "Encounter"
				RELATEDPERSON -> "RelatedPerson"
				PRACTITIONER -> "Practitioner"
				DEVICE -> "Device"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				PATIENT -> "http://hl7.org/fhir/compartment-type"
				ENCOUNTER -> "http://hl7.org/fhir/compartment-type"
				RELATEDPERSON -> "http://hl7.org/fhir/compartment-type"
				PRACTITIONER -> "http://hl7.org/fhir/compartment-type"
				DEVICE -> "http://hl7.org/fhir/compartment-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				PATIENT -> "The compartment definition is for the patient compartment."
				ENCOUNTER -> "The compartment definition is for the encounter compartment."
				RELATEDPERSON -> "The compartment definition is for the related-person compartment."
				PRACTITIONER -> "The compartment definition is for the practitioner compartment."
				DEVICE -> "The compartment definition is for the device compartment."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				PATIENT -> "Patient";
				ENCOUNTER -> "Encounter";
				RELATEDPERSON -> "RelatedPerson";
				PRACTITIONER -> "Practitioner";
				DEVICE -> "Device";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): CompartmentType? {
				if (codeString == null || "" == codeString) return null
				if ("Patient" == codeString) return PATIENT
				if ("Encounter" == codeString) return ENCOUNTER
				if ("RelatedPerson" == codeString) return RELATEDPERSON
				if ("Practitioner" == codeString) return PRACTITIONER
				if ("Device" == codeString) return DEVICE
				throw FHIRException("Unknown CompartmentType code '"$codeString"'")
			}
		}
	}

	class CompartmentTypeEnumFactory : EnumFactory<CompartmentType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): CompartmentType? {
			if (codeString == null || "" == codeString) return null
			if ("Patient" == codeString) return CompartmentType.PATIENT
			if ("Encounter" == codeString) return CompartmentType.ENCOUNTER
			if ("RelatedPerson" == codeString) return CompartmentType.RELATEDPERSON
			if ("Practitioner" == codeString) return CompartmentType.PRACTITIONER
			if ("Device" == codeString) return CompartmentType.DEVICE
			throw IllegalArgumentException("Unknown CompartmentType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<CompartmentType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("Patient" == codeString) return new Enumeration(this, CompartmentType.PATIENT)
			if ("Encounter" == codeString) return new Enumeration(this, CompartmentType.ENCOUNTER)
			if ("RelatedPerson" == codeString) return new Enumeration(this, CompartmentType.RELATEDPERSON)
			if ("Practitioner" == codeString) return new Enumeration(this, CompartmentType.PRACTITIONER)
			if ("Device" == codeString) return new Enumeration(this, CompartmentType.DEVICE)
			throw FHIRException("Unknown CompartmentType code '$codeString'")
		}
		override fun toCode(code: CompartmentType): String? {
			return when (code) {
				CompartmentType.PATIENT -> "Patient"
				CompartmentType.ENCOUNTER -> "Encounter"
				CompartmentType.RELATEDPERSON -> "RelatedPerson"
				CompartmentType.PRACTITIONER -> "Practitioner"
				CompartmentType.DEVICE -> "Device"
				NULL -> null
			}
		}
		override fun toSystem(code: CompartmentType): String? {
			return code.system
		}
    }

	enum class CompositionStatus {
		/**
		* This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified.
		*/
		PRELIMINARY, 
		/**
		* This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
		*/
		FINAL, 
		/**
		* The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
		*/
		AMENDED, 
		/**
		* The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
		*/
		ENTEREDINERROR, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				PRELIMINARY -> "preliminary"
				FINAL -> "final"
				AMENDED -> "amended"
				ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				PRELIMINARY -> "http://hl7.org/fhir/composition-status"
				FINAL -> "http://hl7.org/fhir/composition-status"
				AMENDED -> "http://hl7.org/fhir/composition-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/composition-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				PRELIMINARY -> "This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified."
				FINAL -> "This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition."
				AMENDED -> "The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as \"final\" and the composition is complete and verified by an authorized person."
				ENTEREDINERROR -> "The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				PRELIMINARY -> "Preliminary";
				FINAL -> "Final";
				AMENDED -> "Amended";
				ENTEREDINERROR -> "Entered in Error";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): CompositionStatus? {
				if (codeString == null || "" == codeString) return null
				if ("preliminary" == codeString) return PRELIMINARY
				if ("final" == codeString) return FINAL
				if ("amended" == codeString) return AMENDED
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				throw FHIRException("Unknown CompositionStatus code '"$codeString"'")
			}
		}
	}

	class CompositionStatusEnumFactory : EnumFactory<CompositionStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): CompositionStatus? {
			if (codeString == null || "" == codeString) return null
			if ("preliminary" == codeString) return CompositionStatus.PRELIMINARY
			if ("final" == codeString) return CompositionStatus.FINAL
			if ("amended" == codeString) return CompositionStatus.AMENDED
			if ("entered-in-error" == codeString) return CompositionStatus.ENTEREDINERROR
			throw IllegalArgumentException("Unknown CompositionStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<CompositionStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("preliminary" == codeString) return new Enumeration(this, CompositionStatus.PRELIMINARY)
			if ("final" == codeString) return new Enumeration(this, CompositionStatus.FINAL)
			if ("amended" == codeString) return new Enumeration(this, CompositionStatus.AMENDED)
			if ("entered-in-error" == codeString) return new Enumeration(this, CompositionStatus.ENTEREDINERROR)
			throw FHIRException("Unknown CompositionStatus code '$codeString'")
		}
		override fun toCode(code: CompositionStatus): String? {
			return when (code) {
				CompositionStatus.PRELIMINARY -> "preliminary"
				CompositionStatus.FINAL -> "final"
				CompositionStatus.AMENDED -> "amended"
				CompositionStatus.ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		override fun toSystem(code: CompositionStatus): String? {
			return code.system
		}
    }

	enum class ConceptMapRelationship {
		/**
		* The concepts are related to each other, but the exact relationship is not known.
		*/
		RELATEDTO, 
		/**
		* The definitions of the concepts mean the same thing.
		*/
		EQUIVALENT, 
		/**
		* The source concept is narrower in meaning than the target concept.
		*/
		SOURCEISNARROWERTHANTARGET, 
		/**
		* The source concept is broader in meaning than the target concept.
		*/
		SOURCEISBROADERTHANTARGET, 
		/**
		* This is an explicit assertion that the target concept is not related to the source concept.
		*/
		NOTRELATEDTO, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				RELATEDTO -> "related-to"
				EQUIVALENT -> "equivalent"
				SOURCEISNARROWERTHANTARGET -> "source-is-narrower-than-target"
				SOURCEISBROADERTHANTARGET -> "source-is-broader-than-target"
				NOTRELATEDTO -> "not-related-to"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				RELATEDTO -> "http://hl7.org/fhir/concept-map-relationship"
				EQUIVALENT -> "http://hl7.org/fhir/concept-map-relationship"
				SOURCEISNARROWERTHANTARGET -> "http://hl7.org/fhir/concept-map-relationship"
				SOURCEISBROADERTHANTARGET -> "http://hl7.org/fhir/concept-map-relationship"
				NOTRELATEDTO -> "http://hl7.org/fhir/concept-map-relationship"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				RELATEDTO -> "The concepts are related to each other, but the exact relationship is not known."
				EQUIVALENT -> "The definitions of the concepts mean the same thing."
				SOURCEISNARROWERTHANTARGET -> "The source concept is narrower in meaning than the target concept."
				SOURCEISBROADERTHANTARGET -> "The source concept is broader in meaning than the target concept."
				NOTRELATEDTO -> "This is an explicit assertion that the target concept is not related to the source concept."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				RELATEDTO -> "Related To";
				EQUIVALENT -> "Equivalent";
				SOURCEISNARROWERTHANTARGET -> "Source Is Narrower Than Target";
				SOURCEISBROADERTHANTARGET -> "Source Is Broader Than Target";
				NOTRELATEDTO -> "Not Related To";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ConceptMapRelationship? {
				if (codeString == null || "" == codeString) return null
				if ("related-to" == codeString) return RELATEDTO
				if ("equivalent" == codeString) return EQUIVALENT
				if ("source-is-narrower-than-target" == codeString) return SOURCEISNARROWERTHANTARGET
				if ("source-is-broader-than-target" == codeString) return SOURCEISBROADERTHANTARGET
				if ("not-related-to" == codeString) return NOTRELATEDTO
				throw FHIRException("Unknown ConceptMapRelationship code '"$codeString"'")
			}
		}
	}

	class ConceptMapRelationshipEnumFactory : EnumFactory<ConceptMapRelationship> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ConceptMapRelationship? {
			if (codeString == null || "" == codeString) return null
			if ("related-to" == codeString) return ConceptMapRelationship.RELATEDTO
			if ("equivalent" == codeString) return ConceptMapRelationship.EQUIVALENT
			if ("source-is-narrower-than-target" == codeString) return ConceptMapRelationship.SOURCEISNARROWERTHANTARGET
			if ("source-is-broader-than-target" == codeString) return ConceptMapRelationship.SOURCEISBROADERTHANTARGET
			if ("not-related-to" == codeString) return ConceptMapRelationship.NOTRELATEDTO
			throw IllegalArgumentException("Unknown ConceptMapRelationship code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ConceptMapRelationship>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("related-to" == codeString) return new Enumeration(this, ConceptMapRelationship.RELATEDTO)
			if ("equivalent" == codeString) return new Enumeration(this, ConceptMapRelationship.EQUIVALENT)
			if ("source-is-narrower-than-target" == codeString) return new Enumeration(this, ConceptMapRelationship.SOURCEISNARROWERTHANTARGET)
			if ("source-is-broader-than-target" == codeString) return new Enumeration(this, ConceptMapRelationship.SOURCEISBROADERTHANTARGET)
			if ("not-related-to" == codeString) return new Enumeration(this, ConceptMapRelationship.NOTRELATEDTO)
			throw FHIRException("Unknown ConceptMapRelationship code '$codeString'")
		}
		override fun toCode(code: ConceptMapRelationship): String? {
			return when (code) {
				ConceptMapRelationship.RELATEDTO -> "related-to"
				ConceptMapRelationship.EQUIVALENT -> "equivalent"
				ConceptMapRelationship.SOURCEISNARROWERTHANTARGET -> "source-is-narrower-than-target"
				ConceptMapRelationship.SOURCEISBROADERTHANTARGET -> "source-is-broader-than-target"
				ConceptMapRelationship.NOTRELATEDTO -> "not-related-to"
				NULL -> null
			}
		}
		override fun toSystem(code: ConceptMapRelationship): String? {
			return code.system
		}
    }

	enum class DaysOfWeek {
		/**
		* Monday.
		*/
		MON, 
		/**
		* Tuesday.
		*/
		TUE, 
		/**
		* Wednesday.
		*/
		WED, 
		/**
		* Thursday.
		*/
		THU, 
		/**
		* Friday.
		*/
		FRI, 
		/**
		* Saturday.
		*/
		SAT, 
		/**
		* Sunday.
		*/
		SUN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				MON -> "mon"
				TUE -> "tue"
				WED -> "wed"
				THU -> "thu"
				FRI -> "fri"
				SAT -> "sat"
				SUN -> "sun"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				MON -> "http://hl7.org/fhir/days-of-week"
				TUE -> "http://hl7.org/fhir/days-of-week"
				WED -> "http://hl7.org/fhir/days-of-week"
				THU -> "http://hl7.org/fhir/days-of-week"
				FRI -> "http://hl7.org/fhir/days-of-week"
				SAT -> "http://hl7.org/fhir/days-of-week"
				SUN -> "http://hl7.org/fhir/days-of-week"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				MON -> "Monday."
				TUE -> "Tuesday."
				WED -> "Wednesday."
				THU -> "Thursday."
				FRI -> "Friday."
				SAT -> "Saturday."
				SUN -> "Sunday."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				MON -> "Monday";
				TUE -> "Tuesday";
				WED -> "Wednesday";
				THU -> "Thursday";
				FRI -> "Friday";
				SAT -> "Saturday";
				SUN -> "Sunday";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): DaysOfWeek? {
				if (codeString == null || "" == codeString) return null
				if ("mon" == codeString) return MON
				if ("tue" == codeString) return TUE
				if ("wed" == codeString) return WED
				if ("thu" == codeString) return THU
				if ("fri" == codeString) return FRI
				if ("sat" == codeString) return SAT
				if ("sun" == codeString) return SUN
				throw FHIRException("Unknown DaysOfWeek code '"$codeString"'")
			}
		}
	}

	class DaysOfWeekEnumFactory : EnumFactory<DaysOfWeek> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): DaysOfWeek? {
			if (codeString == null || "" == codeString) return null
			if ("mon" == codeString) return DaysOfWeek.MON
			if ("tue" == codeString) return DaysOfWeek.TUE
			if ("wed" == codeString) return DaysOfWeek.WED
			if ("thu" == codeString) return DaysOfWeek.THU
			if ("fri" == codeString) return DaysOfWeek.FRI
			if ("sat" == codeString) return DaysOfWeek.SAT
			if ("sun" == codeString) return DaysOfWeek.SUN
			throw IllegalArgumentException("Unknown DaysOfWeek code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<DaysOfWeek>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("mon" == codeString) return new Enumeration(this, DaysOfWeek.MON)
			if ("tue" == codeString) return new Enumeration(this, DaysOfWeek.TUE)
			if ("wed" == codeString) return new Enumeration(this, DaysOfWeek.WED)
			if ("thu" == codeString) return new Enumeration(this, DaysOfWeek.THU)
			if ("fri" == codeString) return new Enumeration(this, DaysOfWeek.FRI)
			if ("sat" == codeString) return new Enumeration(this, DaysOfWeek.SAT)
			if ("sun" == codeString) return new Enumeration(this, DaysOfWeek.SUN)
			throw FHIRException("Unknown DaysOfWeek code '$codeString'")
		}
		override fun toCode(code: DaysOfWeek): String? {
			return when (code) {
				DaysOfWeek.MON -> "mon"
				DaysOfWeek.TUE -> "tue"
				DaysOfWeek.WED -> "wed"
				DaysOfWeek.THU -> "thu"
				DaysOfWeek.FRI -> "fri"
				DaysOfWeek.SAT -> "sat"
				DaysOfWeek.SUN -> "sun"
				NULL -> null
			}
		}
		override fun toSystem(code: DaysOfWeek): String? {
			return code.system
		}
    }

	enum class DeviceNameType {
		/**
		* UDI Label name.
		*/
		UDILABELNAME, 
		/**
		* The 'user friendly name' typically is the name of the device on the package it came in or some combination of that name with the model number, serial number, or other attribute that makes the name easy to understand for the user of that device. It is often exposed in communicating devices transport protocols. It is provided to help users identify the device when reported in discovery operations.
		*/
		USERFRIENDLYNAME, 
		/**
		* A name as provided by a patient of the device, for example "knee implant", when documenting, e.g., self-reported device.
		*/
		PATIENTREPORTEDNAME, 
		/**
		* The formal name as provided by the manufacturer of the device.
		*/
		MANUFACTURERNAME, 
		/**
		* The name of the model. The manufacturer-name or user-friendly-name may include that as a component.
		*/
		MODELNAME, 
		/**
		* other.
		*/
		OTHER, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				UDILABELNAME -> "udi-label-name"
				USERFRIENDLYNAME -> "user-friendly-name"
				PATIENTREPORTEDNAME -> "patient-reported-name"
				MANUFACTURERNAME -> "manufacturer-name"
				MODELNAME -> "model-name"
				OTHER -> "other"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				UDILABELNAME -> "http://hl7.org/fhir/device-nametype"
				USERFRIENDLYNAME -> "http://hl7.org/fhir/device-nametype"
				PATIENTREPORTEDNAME -> "http://hl7.org/fhir/device-nametype"
				MANUFACTURERNAME -> "http://hl7.org/fhir/device-nametype"
				MODELNAME -> "http://hl7.org/fhir/device-nametype"
				OTHER -> "http://hl7.org/fhir/device-nametype"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				UDILABELNAME -> "UDI Label name."
				USERFRIENDLYNAME -> "The 'user friendly name' typically is the name of the device on the package it came in or some combination of that name with the model number, serial number, or other attribute that makes the name easy to understand for the user of that device. It is often exposed in communicating devices transport protocols. It is provided to help users identify the device when reported in discovery operations."
				PATIENTREPORTEDNAME -> "A name as provided by a patient of the device, for example \"knee implant\", when documenting, e.g., self-reported device."
				MANUFACTURERNAME -> "The formal name as provided by the manufacturer of the device."
				MODELNAME -> "The name of the model. The manufacturer-name or user-friendly-name may include that as a component."
				OTHER -> "other."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				UDILABELNAME -> "UDI Label name";
				USERFRIENDLYNAME -> "User Friendly name";
				PATIENTREPORTEDNAME -> "Patient Reported name";
				MANUFACTURERNAME -> "Manufacturer name";
				MODELNAME -> "Model name";
				OTHER -> "other";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): DeviceNameType? {
				if (codeString == null || "" == codeString) return null
				if ("udi-label-name" == codeString) return UDILABELNAME
				if ("user-friendly-name" == codeString) return USERFRIENDLYNAME
				if ("patient-reported-name" == codeString) return PATIENTREPORTEDNAME
				if ("manufacturer-name" == codeString) return MANUFACTURERNAME
				if ("model-name" == codeString) return MODELNAME
				if ("other" == codeString) return OTHER
				throw FHIRException("Unknown DeviceNameType code '"$codeString"'")
			}
		}
	}

	class DeviceNameTypeEnumFactory : EnumFactory<DeviceNameType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): DeviceNameType? {
			if (codeString == null || "" == codeString) return null
			if ("udi-label-name" == codeString) return DeviceNameType.UDILABELNAME
			if ("user-friendly-name" == codeString) return DeviceNameType.USERFRIENDLYNAME
			if ("patient-reported-name" == codeString) return DeviceNameType.PATIENTREPORTEDNAME
			if ("manufacturer-name" == codeString) return DeviceNameType.MANUFACTURERNAME
			if ("model-name" == codeString) return DeviceNameType.MODELNAME
			if ("other" == codeString) return DeviceNameType.OTHER
			throw IllegalArgumentException("Unknown DeviceNameType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<DeviceNameType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("udi-label-name" == codeString) return new Enumeration(this, DeviceNameType.UDILABELNAME)
			if ("user-friendly-name" == codeString) return new Enumeration(this, DeviceNameType.USERFRIENDLYNAME)
			if ("patient-reported-name" == codeString) return new Enumeration(this, DeviceNameType.PATIENTREPORTEDNAME)
			if ("manufacturer-name" == codeString) return new Enumeration(this, DeviceNameType.MANUFACTURERNAME)
			if ("model-name" == codeString) return new Enumeration(this, DeviceNameType.MODELNAME)
			if ("other" == codeString) return new Enumeration(this, DeviceNameType.OTHER)
			throw FHIRException("Unknown DeviceNameType code '$codeString'")
		}
		override fun toCode(code: DeviceNameType): String? {
			return when (code) {
				DeviceNameType.UDILABELNAME -> "udi-label-name"
				DeviceNameType.USERFRIENDLYNAME -> "user-friendly-name"
				DeviceNameType.PATIENTREPORTEDNAME -> "patient-reported-name"
				DeviceNameType.MANUFACTURERNAME -> "manufacturer-name"
				DeviceNameType.MODELNAME -> "model-name"
				DeviceNameType.OTHER -> "other"
				NULL -> null
			}
		}
		override fun toSystem(code: DeviceNameType): String? {
			return code.system
		}
    }

	enum class DocumentReferenceStatus {
		/**
		* This is the current reference for this document.
		*/
		CURRENT, 
		/**
		* This reference has been superseded by another reference.
		*/
		SUPERSEDED, 
		/**
		* This reference was created in error.
		*/
		ENTEREDINERROR, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				CURRENT -> "current"
				SUPERSEDED -> "superseded"
				ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				CURRENT -> "http://hl7.org/fhir/document-reference-status"
				SUPERSEDED -> "http://hl7.org/fhir/document-reference-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/document-reference-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				CURRENT -> "This is the current reference for this document."
				SUPERSEDED -> "This reference has been superseded by another reference."
				ENTEREDINERROR -> "This reference was created in error."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				CURRENT -> "Current";
				SUPERSEDED -> "Superseded";
				ENTEREDINERROR -> "Entered in Error";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): DocumentReferenceStatus? {
				if (codeString == null || "" == codeString) return null
				if ("current" == codeString) return CURRENT
				if ("superseded" == codeString) return SUPERSEDED
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				throw FHIRException("Unknown DocumentReferenceStatus code '"$codeString"'")
			}
		}
	}

	class DocumentReferenceStatusEnumFactory : EnumFactory<DocumentReferenceStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): DocumentReferenceStatus? {
			if (codeString == null || "" == codeString) return null
			if ("current" == codeString) return DocumentReferenceStatus.CURRENT
			if ("superseded" == codeString) return DocumentReferenceStatus.SUPERSEDED
			if ("entered-in-error" == codeString) return DocumentReferenceStatus.ENTEREDINERROR
			throw IllegalArgumentException("Unknown DocumentReferenceStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<DocumentReferenceStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("current" == codeString) return new Enumeration(this, DocumentReferenceStatus.CURRENT)
			if ("superseded" == codeString) return new Enumeration(this, DocumentReferenceStatus.SUPERSEDED)
			if ("entered-in-error" == codeString) return new Enumeration(this, DocumentReferenceStatus.ENTEREDINERROR)
			throw FHIRException("Unknown DocumentReferenceStatus code '$codeString'")
		}
		override fun toCode(code: DocumentReferenceStatus): String? {
			return when (code) {
				DocumentReferenceStatus.CURRENT -> "current"
				DocumentReferenceStatus.SUPERSEDED -> "superseded"
				DocumentReferenceStatus.ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		override fun toSystem(code: DocumentReferenceStatus): String? {
			return code.system
		}
    }

	enum class DocumentRelationshipType {
		/**
		* This document logically replaces or supersedes the target document.
		*/
		REPLACES, 
		/**
		* This document was generated by transforming the target document (e.g. format or language conversion).
		*/
		TRANSFORMS, 
		/**
		* This document is a signature of the target document.
		*/
		SIGNS, 
		/**
		* This document adds additional information to the target document.
		*/
		APPENDS, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				REPLACES -> "replaces"
				TRANSFORMS -> "transforms"
				SIGNS -> "signs"
				APPENDS -> "appends"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				REPLACES -> "http://hl7.org/fhir/document-relationship-type"
				TRANSFORMS -> "http://hl7.org/fhir/document-relationship-type"
				SIGNS -> "http://hl7.org/fhir/document-relationship-type"
				APPENDS -> "http://hl7.org/fhir/document-relationship-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				REPLACES -> "This document logically replaces or supersedes the target document."
				TRANSFORMS -> "This document was generated by transforming the target document (e.g. format or language conversion)."
				SIGNS -> "This document is a signature of the target document."
				APPENDS -> "This document adds additional information to the target document."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				REPLACES -> "Replaces";
				TRANSFORMS -> "Transforms";
				SIGNS -> "Signs";
				APPENDS -> "Appends";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): DocumentRelationshipType? {
				if (codeString == null || "" == codeString) return null
				if ("replaces" == codeString) return REPLACES
				if ("transforms" == codeString) return TRANSFORMS
				if ("signs" == codeString) return SIGNS
				if ("appends" == codeString) return APPENDS
				throw FHIRException("Unknown DocumentRelationshipType code '"$codeString"'")
			}
		}
	}

	class DocumentRelationshipTypeEnumFactory : EnumFactory<DocumentRelationshipType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): DocumentRelationshipType? {
			if (codeString == null || "" == codeString) return null
			if ("replaces" == codeString) return DocumentRelationshipType.REPLACES
			if ("transforms" == codeString) return DocumentRelationshipType.TRANSFORMS
			if ("signs" == codeString) return DocumentRelationshipType.SIGNS
			if ("appends" == codeString) return DocumentRelationshipType.APPENDS
			throw IllegalArgumentException("Unknown DocumentRelationshipType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<DocumentRelationshipType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("replaces" == codeString) return new Enumeration(this, DocumentRelationshipType.REPLACES)
			if ("transforms" == codeString) return new Enumeration(this, DocumentRelationshipType.TRANSFORMS)
			if ("signs" == codeString) return new Enumeration(this, DocumentRelationshipType.SIGNS)
			if ("appends" == codeString) return new Enumeration(this, DocumentRelationshipType.APPENDS)
			throw FHIRException("Unknown DocumentRelationshipType code '$codeString'")
		}
		override fun toCode(code: DocumentRelationshipType): String? {
			return when (code) {
				DocumentRelationshipType.REPLACES -> "replaces"
				DocumentRelationshipType.TRANSFORMS -> "transforms"
				DocumentRelationshipType.SIGNS -> "signs"
				DocumentRelationshipType.APPENDS -> "appends"
				NULL -> null
			}
		}
		override fun toSystem(code: DocumentRelationshipType): String? {
			return code.system
		}
    }

	enum class EventStatus {
		/**
		* The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.
		*/
		PREPARATION, 
		/**
		* The event is currently occurring.
		*/
		INPROGRESS, 
		/**
		* The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.
		*/
		NOTDONE, 
		/**
		* The event has been temporarily stopped but is expected to resume in the future.
		*/
		ONHOLD, 
		/**
		* The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred.
		*/
		STOPPED, 
		/**
		* The event has now concluded.
		*/
		COMPLETED, 
		/**
		* This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "stopped" rather than "entered-in-error".).
		*/
		ENTEREDINERROR, 
		/**
		* The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
		*/
		UNKNOWN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				PREPARATION -> "preparation"
				INPROGRESS -> "in-progress"
				NOTDONE -> "not-done"
				ONHOLD -> "on-hold"
				STOPPED -> "stopped"
				COMPLETED -> "completed"
				ENTEREDINERROR -> "entered-in-error"
				UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				PREPARATION -> "http://hl7.org/fhir/event-status"
				INPROGRESS -> "http://hl7.org/fhir/event-status"
				NOTDONE -> "http://hl7.org/fhir/event-status"
				ONHOLD -> "http://hl7.org/fhir/event-status"
				STOPPED -> "http://hl7.org/fhir/event-status"
				COMPLETED -> "http://hl7.org/fhir/event-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/event-status"
				UNKNOWN -> "http://hl7.org/fhir/event-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				PREPARATION -> "The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes."
				INPROGRESS -> "The event is currently occurring."
				NOTDONE -> "The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific."
				ONHOLD -> "The event has been temporarily stopped but is expected to resume in the future."
				STOPPED -> "The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred."
				COMPLETED -> "The event has now concluded."
				ENTEREDINERROR -> "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"stopped\" rather than \"entered-in-error\".)."
				UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				PREPARATION -> "Preparation";
				INPROGRESS -> "In Progress";
				NOTDONE -> "Not Done";
				ONHOLD -> "On Hold";
				STOPPED -> "Stopped";
				COMPLETED -> "Completed";
				ENTEREDINERROR -> "Entered in Error";
				UNKNOWN -> "Unknown";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): EventStatus? {
				if (codeString == null || "" == codeString) return null
				if ("preparation" == codeString) return PREPARATION
				if ("in-progress" == codeString) return INPROGRESS
				if ("not-done" == codeString) return NOTDONE
				if ("on-hold" == codeString) return ONHOLD
				if ("stopped" == codeString) return STOPPED
				if ("completed" == codeString) return COMPLETED
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				if ("unknown" == codeString) return UNKNOWN
				throw FHIRException("Unknown EventStatus code '"$codeString"'")
			}
		}
	}

	class EventStatusEnumFactory : EnumFactory<EventStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): EventStatus? {
			if (codeString == null || "" == codeString) return null
			if ("preparation" == codeString) return EventStatus.PREPARATION
			if ("in-progress" == codeString) return EventStatus.INPROGRESS
			if ("not-done" == codeString) return EventStatus.NOTDONE
			if ("on-hold" == codeString) return EventStatus.ONHOLD
			if ("stopped" == codeString) return EventStatus.STOPPED
			if ("completed" == codeString) return EventStatus.COMPLETED
			if ("entered-in-error" == codeString) return EventStatus.ENTEREDINERROR
			if ("unknown" == codeString) return EventStatus.UNKNOWN
			throw IllegalArgumentException("Unknown EventStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<EventStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("preparation" == codeString) return new Enumeration(this, EventStatus.PREPARATION)
			if ("in-progress" == codeString) return new Enumeration(this, EventStatus.INPROGRESS)
			if ("not-done" == codeString) return new Enumeration(this, EventStatus.NOTDONE)
			if ("on-hold" == codeString) return new Enumeration(this, EventStatus.ONHOLD)
			if ("stopped" == codeString) return new Enumeration(this, EventStatus.STOPPED)
			if ("completed" == codeString) return new Enumeration(this, EventStatus.COMPLETED)
			if ("entered-in-error" == codeString) return new Enumeration(this, EventStatus.ENTEREDINERROR)
			if ("unknown" == codeString) return new Enumeration(this, EventStatus.UNKNOWN)
			throw FHIRException("Unknown EventStatus code '$codeString'")
		}
		override fun toCode(code: EventStatus): String? {
			return when (code) {
				EventStatus.PREPARATION -> "preparation"
				EventStatus.INPROGRESS -> "in-progress"
				EventStatus.NOTDONE -> "not-done"
				EventStatus.ONHOLD -> "on-hold"
				EventStatus.STOPPED -> "stopped"
				EventStatus.COMPLETED -> "completed"
				EventStatus.ENTEREDINERROR -> "entered-in-error"
				EventStatus.UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		override fun toSystem(code: EventStatus): String? {
			return code.system
		}
    }

	enum class EvidenceVariableHandling {
		/**
		* A continuous variable is one for which, within the limits the variable ranges, any value is possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251).
		*/
		CONTINUOUS, 
		/**
		* A dichotomous variable is a categorical variable which is defined to have only 2 categories or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090).
		*/
		DICHOTOMOUS, 
		/**
		* An ordinal variable is a categorical variable where the discrete possible values are ordered or correspond to an implicit ranking (from STATO http://purl.obolibrary.org/obo/STATO_0000228).
		*/
		ORDINAL, 
		/**
		* A polychotomous variable is a categorical variable which is defined to have minimally 2 categories or possible values. (from STATO  http://purl.obolibrary.org/obo/STATO_0000087).  Suggestion to limit code use to situations when neither dichotomous nor ordinal variables apply.
		*/
		POLYCHOTOMOUS, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				CONTINUOUS -> "continuous"
				DICHOTOMOUS -> "dichotomous"
				ORDINAL -> "ordinal"
				POLYCHOTOMOUS -> "polychotomous"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				CONTINUOUS -> "http://hl7.org/fhir/variable-handling"
				DICHOTOMOUS -> "http://hl7.org/fhir/variable-handling"
				ORDINAL -> "http://hl7.org/fhir/variable-handling"
				POLYCHOTOMOUS -> "http://hl7.org/fhir/variable-handling"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				CONTINUOUS -> "A continuous variable is one for which, within the limits the variable ranges, any value is possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251)."
				DICHOTOMOUS -> "A dichotomous variable is a categorical variable which is defined to have only 2 categories or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090)."
				ORDINAL -> "An ordinal variable is a categorical variable where the discrete possible values are ordered or correspond to an implicit ranking (from STATO http://purl.obolibrary.org/obo/STATO_0000228)."
				POLYCHOTOMOUS -> "A polychotomous variable is a categorical variable which is defined to have minimally 2 categories or possible values. (from STATO  http://purl.obolibrary.org/obo/STATO_0000087).  Suggestion to limit code use to situations when neither dichotomous nor ordinal variables apply."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				CONTINUOUS -> "continuous variable";
				DICHOTOMOUS -> "dichotomous variable";
				ORDINAL -> "ordinal variable";
				POLYCHOTOMOUS -> "polychotomous variable";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): EvidenceVariableHandling? {
				if (codeString == null || "" == codeString) return null
				if ("continuous" == codeString) return CONTINUOUS
				if ("dichotomous" == codeString) return DICHOTOMOUS
				if ("ordinal" == codeString) return ORDINAL
				if ("polychotomous" == codeString) return POLYCHOTOMOUS
				throw FHIRException("Unknown EvidenceVariableHandling code '"$codeString"'")
			}
		}
	}

	class EvidenceVariableHandlingEnumFactory : EnumFactory<EvidenceVariableHandling> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): EvidenceVariableHandling? {
			if (codeString == null || "" == codeString) return null
			if ("continuous" == codeString) return EvidenceVariableHandling.CONTINUOUS
			if ("dichotomous" == codeString) return EvidenceVariableHandling.DICHOTOMOUS
			if ("ordinal" == codeString) return EvidenceVariableHandling.ORDINAL
			if ("polychotomous" == codeString) return EvidenceVariableHandling.POLYCHOTOMOUS
			throw IllegalArgumentException("Unknown EvidenceVariableHandling code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<EvidenceVariableHandling>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("continuous" == codeString) return new Enumeration(this, EvidenceVariableHandling.CONTINUOUS)
			if ("dichotomous" == codeString) return new Enumeration(this, EvidenceVariableHandling.DICHOTOMOUS)
			if ("ordinal" == codeString) return new Enumeration(this, EvidenceVariableHandling.ORDINAL)
			if ("polychotomous" == codeString) return new Enumeration(this, EvidenceVariableHandling.POLYCHOTOMOUS)
			throw FHIRException("Unknown EvidenceVariableHandling code '$codeString'")
		}
		override fun toCode(code: EvidenceVariableHandling): String? {
			return when (code) {
				EvidenceVariableHandling.CONTINUOUS -> "continuous"
				EvidenceVariableHandling.DICHOTOMOUS -> "dichotomous"
				EvidenceVariableHandling.ORDINAL -> "ordinal"
				EvidenceVariableHandling.POLYCHOTOMOUS -> "polychotomous"
				NULL -> null
			}
		}
		override fun toSystem(code: EvidenceVariableHandling): String? {
			return code.system
		}
    }

	enum class FHIRAllTypes {
		/**
		* An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
		*/
		ADDRESS, 
		/**
		* A duration of time during which an organism (or a process) has existed.
		*/
		AGE, 
		/**
		* A  text note which also  contains information about who made the statement and when.
		*/
		ANNOTATION, 
		/**
		* For referring to data content defined in other formats.
		*/
		ATTACHMENT, 
		/**
		* Base definition for all elements that are defined inside a resource - but not those in a data type.
		*/
		BACKBONEELEMENT, 
		/**
		* Base definition for the few data types that are allowed to carry modifier extensions.
		*/
		BACKBONETYPE, 
		/**
		* Base definition for all types defined in FHIR type system.
		*/
		BASE, 
		/**
		* A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
		*/
		CODEABLECONCEPT, 
		/**
		* A reference to a resource (by instance), or instead, a reference to a cencept defined in a terminology or ontology (by class).
		*/
		CODEABLEREFERENCE, 
		/**
		* A reference to a code defined by a terminology system.
		*/
		CODING, 
		/**
		* Specifies contact information for a person or organization.
		*/
		CONTACTDETAIL, 
		/**
		* Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
		*/
		CONTACTPOINT, 
		/**
		* A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
		*/
		CONTRIBUTOR, 
		/**
		* A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
		*/
		COUNT, 
		/**
		* Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
		*/
		DATAREQUIREMENT, 
		/**
		* The base class for all re-useable types defined as part of the FHIR Specification.
		*/
		DATATYPE, 
		/**
		* A length - a value with a unit that is a physical distance.
		*/
		DISTANCE, 
		/**
		* Indicates how the medication is/was taken or should be taken by the patient.
		*/
		DOSAGE, 
		/**
		* A length of time.
		*/
		DURATION, 
		/**
		* Base definition for all elements in a resource.
		*/
		ELEMENT, 
		/**
		* Captures constraints on each element within the resource, profile, or extension.
		*/
		ELEMENTDEFINITION, 
		/**
		* A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.
		*/
		EXPRESSION, 
		/**
		* Optional Extension Element - found in all resources.
		*/
		EXTENSION, 
		/**
		* A human's name with the ability to identify parts and usage.
		*/
		HUMANNAME, 
		/**
		* An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.
		*/
		IDENTIFIER, 
		/**
		* The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
		*/
		MARKETINGSTATUS, 
		/**
		* The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
		*/
		META, 
		/**
		* An amount of economic utility in some recognized currency.
		*/
		MONEY, 
		/**
		* null
		*/
		MONEYQUANTITY, 
		/**
		* A human-readable summary of the resource conveying the essential clinical and business information for the resource.
		*/
		NARRATIVE, 
		/**
		* An ordered list (distribution) of statistics.
		*/
		ORDEREDDISTRIBUTION, 
		/**
		* The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse.
		*/
		PARAMETERDEFINITION, 
		/**
		* A time period defined by a start and end date and optionally time.
		*/
		PERIOD, 
		/**
		* A populatioof people with some set of grouping criteria.
		*/
		POPULATION, 
		/**
		* The base type for all re-useable types defined that have a simple property.
		*/
		PRIMITIVETYPE, 
		/**
		* The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.
		*/
		PRODCHARACTERISTIC, 
		/**
		* The shelf-life and storage information for a medicinal product item or container can be described using this class.
		*/
		PRODUCTSHELFLIFE, 
		/**
		* A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
		*/
		QUANTITY, 
		/**
		* A set of ordered Quantities defined by a low and high limit.
		*/
		RANGE, 
		/**
		* A relationship of two Quantity values - expressed as a numerator and a denominator.
		*/
		RATIO, 
		/**
		* A reference from one resource to another.
		*/
		REFERENCE, 
		/**
		* Related artifacts such as additional documentation, justification, or bibliographic references.
		*/
		RELATEDARTIFACT, 
		/**
		* A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
		*/
		SAMPLEDDATA, 
		/**
		* A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.
		*/
		SIGNATURE, 
		/**
		* null
		*/
		SIMPLEQUANTITY, 
		/**
		* A fact or piece of data from a  study of a large quantity of numerical data.  A mathematical or quantified characteristic of a group of observations.
		*/
		STATISTIC, 
		/**
		* Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.
		*/
		TIMING, 
		/**
		* A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.
		*/
		TRIGGERDEFINITION, 
		/**
		* Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
		*/
		USAGECONTEXT, 
		/**
		* A stream of bytes
		*/
		BASE64BINARY, 
		/**
		* Value of "true" or "false"
		*/
		BOOLEAN, 
		/**
		* A URI that is a reference to a canonical URL on a FHIR resource
		*/
		CANONICAL, 
		/**
		* A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents
		*/
		CODE, 
		/**
		* A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.
		*/
		DATE, 
		/**
		* A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.
		*/
		DATETIME, 
		/**
		* A rational number with implicit precision
		*/
		DECIMAL, 
		/**
		* Any combination of letters, numerals, "-" and ".", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.
		*/
		ID, 
		/**
		* An instant in time - known at least to the second
		*/
		INSTANT, 
		/**
		* A whole number
		*/
		INTEGER, 
		/**
		* A very large whole number
		*/
		INTEGER64, 
		/**
		* A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine
		*/
		MARKDOWN, 
		/**
		* An OID represented as a URI
		*/
		OID, 
		/**
		* An integer with a value that is positive (e.g. >0)
		*/
		POSITIVEINT, 
		/**
		* A sequence of Unicode characters
		*/
		STRING, 
		/**
		* A time during the day, with no date specified
		*/
		TIME, 
		/**
		* An integer with a value that is not negative (e.g. >= 0)
		*/
		UNSIGNEDINT, 
		/**
		* String of characters used to identify a name or a resource
		*/
		URI, 
		/**
		* A URI that is a literal reference
		*/
		URL, 
		/**
		* A UUID, represented as a URI
		*/
		UUID, 
		/**
		* XHTML format, as defined by W3C, but restricted usage (mainly, no active content)
		*/
		XHTML, 
		/**
		* A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
		*/
		ACCOUNT, 
		/**
		* This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
		*/
		ACTIVITYDEFINITION, 
		/**
		* A pharmaceutical product described in terms of its composition and dose form.
		*/
		ADMINISTRABLEPRODUCTDEFINITION, 
		/**
		* An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research subject.  The unintended effects may require additional monitoring, treatment or hospitalization or may result in death.  The AdverseEvent resource also extends to potential or avoided events that could have had such effects.
		*/
		ADVERSEEVENT, 
		/**
		* Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
		*/
		ALLERGYINTOLERANCE, 
		/**
		* A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
		*/
		APPOINTMENT, 
		/**
		* A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
		*/
		APPOINTMENTRESPONSE, 
		/**
		* A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
		*/
		AUDITEVENT, 
		/**
		* Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
		*/
		BASIC, 
		/**
		* A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
		*/
		BINARY, 
		/**
		* A material substance originating from a biological entity intended to be transplanted or infused
into another (possibly the same) biological entity.
		*/
		BIOLOGICALLYDERIVEDPRODUCT, 
		/**
		* Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
		*/
		BODYSTRUCTURE, 
		/**
		* A container for a collection of resources.
		*/
		BUNDLE, 
		/**
		* A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		CAPABILITYSTATEMENT, 
		/**
		* A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		CAPABILITYSTATEMENT2, 
		/**
		* Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
		*/
		CAREPLAN, 
		/**
		* The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.
		*/
		CARETEAM, 
		/**
		* Catalog entries are wrappers that contextualize items included in a catalog.
		*/
		CATALOGENTRY, 
		/**
		* The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
		*/
		CHARGEITEM, 
		/**
		* The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
		*/
		CHARGEITEMDEFINITION, 
		/**
		* The Citation.
		*/
		CITATION, 
		/**
		* A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
		*/
		CLAIM, 
		/**
		* This resource provides the adjudication details from the processing of a Claim resource.
		*/
		CLAIMRESPONSE, 
		/**
		* A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
		*/
		CLINICALIMPRESSION, 
		/**
		* A single usage issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
		*/
		CLINICALUSEISSUE, 
		/**
		* The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
		*/
		CODESYSTEM, 
		/**
		* A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
		*/
		COMMUNICATION, 
		/**
		* A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
		*/
		COMMUNICATIONREQUEST, 
		/**
		* A compartment definition that defines how resources are accessed on a server.
		*/
		COMPARTMENTDEFINITION, 
		/**
		* A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
		*/
		COMPOSITION, 
		/**
		* A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
		*/
		CONCEPTMAP, 
		/**
		* A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
		*/
		CONDITION, 
		/**
		* A definition of a condition and information relevant to managing it.
		*/
		CONDITIONDEFINITION, 
		/**
		* A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
		*/
		CONSENT, 
		/**
		* Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
		*/
		CONTRACT, 
		/**
		* Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
		*/
		COVERAGE, 
		/**
		* The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
		*/
		COVERAGEELIGIBILITYREQUEST, 
		/**
		* This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
		*/
		COVERAGEELIGIBILITYRESPONSE, 
		/**
		* Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
		*/
		DETECTEDISSUE, 
		/**
		* A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
		*/
		DEVICE, 
		/**
		* The characteristics, operational status and capabilities of a medical-related component of a medical device.
		*/
		DEVICEDEFINITION, 
		/**
		* Describes a measurement, calculation or setting capability of a medical device.
		*/
		DEVICEMETRIC, 
		/**
		* Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
		*/
		DEVICEREQUEST, 
		/**
		* A record of a device being used by a patient where the record is the result of a report from the patient or a clinician.
		*/
		DEVICEUSESTATEMENT, 
		/**
		* The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
		*/
		DIAGNOSTICREPORT, 
		/**
		* A collection of documents compiled for a purpose together with metadata that applies to the collection.
		*/
		DOCUMENTMANIFEST, 
		/**
		* A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
		*/
		DOCUMENTREFERENCE, 
		/**
		* A resource that includes narrative, extensions, and contained resources.
		*/
		DOMAINRESOURCE, 
		/**
		* An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
		*/
		ENCOUNTER, 
		/**
		* The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
		*/
		ENDPOINT, 
		/**
		* This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
		*/
		ENROLLMENTREQUEST, 
		/**
		* This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
		*/
		ENROLLMENTRESPONSE, 
		/**
		* An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
		*/
		EPISODEOFCARE, 
		/**
		* The EventDefinition resource provides a reusable description of when a particular event can occur.
		*/
		EVENTDEFINITION, 
		/**
		* This represents statistics, certainty, both the intended and actual population, and evidence variables.
		*/
		EVIDENCE, 
		/**
		* The EvidenceReport.
		*/
		EVIDENCEREPORT, 
		/**
		* The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
		*/
		EVIDENCEVARIABLE, 
		/**
		* Example of workflow instance.
		*/
		EXAMPLESCENARIO, 
		/**
		* This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
		*/
		EXPLANATIONOFBENEFIT, 
		/**
		* Significant health conditions for a person related to the patient relevant in the context of care for the patient.
		*/
		FAMILYMEMBERHISTORY, 
		/**
		* Prospective warnings of potential issues when providing care to the patient.
		*/
		FLAG, 
		/**
		* Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
		*/
		GOAL, 
		/**
		* A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
		*/
		GRAPHDEFINITION, 
		/**
		* Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
		*/
		GROUP, 
		/**
		* A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
		*/
		GUIDANCERESPONSE, 
		/**
		* The details of a healthcare service available at a location.
		*/
		HEALTHCARESERVICE, 
		/**
		* Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
		*/
		IMAGINGSTUDY, 
		/**
		* Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
		*/
		IMMUNIZATION, 
		/**
		* Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
		*/
		IMMUNIZATIONEVALUATION, 
		/**
		* A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
		*/
		IMMUNIZATIONRECOMMENDATION, 
		/**
		* A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
		*/
		IMPLEMENTATIONGUIDE, 
		/**
		* An ingredient of a manufactured item or pharmaceutical product.
		*/
		INGREDIENT, 
		/**
		* Details of a Health Insurance product/plan provided by an organization.
		*/
		INSURANCEPLAN, 
		/**
		* Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
		*/
		INVOICE, 
		/**
		* The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
		*/
		LIBRARY, 
		/**
		* Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
		*/
		LINKAGE, 
		/**
		* A list is a curated collection of resources.
		*/
		LIST, 
		/**
		* Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
		*/
		LOCATION, 
		/**
		* The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
		*/
		MANUFACTUREDITEMDEFINITION, 
		/**
		* The Measure resource provides the definition of a quality measure.
		*/
		MEASURE, 
		/**
		* The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
		*/
		MEASUREREPORT, 
		/**
		* This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
		*/
		MEDICATION, 
		/**
		* Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
		*/
		MEDICATIONADMINISTRATION, 
		/**
		* Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
		*/
		MEDICATIONDISPENSE, 
		/**
		* Information about a medication that is used to support knowledge.
		*/
		MEDICATIONKNOWLEDGE, 
		/**
		* An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
		*/
		MEDICATIONREQUEST, 
		/**
		* A record of a medication that is being consumed by a patient.   A MedicationUsage may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 

The primary difference between a medicationusage and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationusage is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Usage information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
		*/
		MEDICATIONUSAGE, 
		/**
		* Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
		*/
		MEDICINALPRODUCTDEFINITION, 
		/**
		* Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
		*/
		MESSAGEDEFINITION, 
		/**
		* The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
		*/
		MESSAGEHEADER, 
		/**
		* Raw data describing a biological sequence.
		*/
		MOLECULARSEQUENCE, 
		/**
		* A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
		*/
		NAMINGSYSTEM, 
		/**
		* A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
		*/
		NUTRITIONINTAKE, 
		/**
		* A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
		*/
		NUTRITIONORDER, 
		/**
		* A food or fluid product that is consumed by patients.
		*/
		NUTRITIONPRODUCT, 
		/**
		* Measurements and simple assertions made about a patient, device or other subject.
		*/
		OBSERVATION, 
		/**
		* Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
		*/
		OBSERVATIONDEFINITION, 
		/**
		* A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
		*/
		OPERATIONDEFINITION, 
		/**
		* A collection of error, warning, or information messages that result from a system action.
		*/
		OPERATIONOUTCOME, 
		/**
		* A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
		*/
		ORGANIZATION, 
		/**
		* Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
		*/
		ORGANIZATIONAFFILIATION, 
		/**
		* A medically related item or items, in a container or package.
		*/
		PACKAGEDPRODUCTDEFINITION, 
		/**
		* This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.
		*/
		PARAMETERS, 
		/**
		* Demographics and other administrative information about an individual or animal receiving care or other health-related services.
		*/
		PATIENT, 
		/**
		* This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
		*/
		PAYMENTNOTICE, 
		/**
		* This resource provides the details including amount of a payment and allocates the payment items being paid.
		*/
		PAYMENTRECONCILIATION, 
		/**
		* Permission.
		*/
		PERMISSION, 
		/**
		* Demographics and administrative information about a person independent of a specific health-related context.
		*/
		PERSON, 
		/**
		* This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
		*/
		PLANDEFINITION, 
		/**
		* A person who is directly or indirectly involved in the provisioning of healthcare.
		*/
		PRACTITIONER, 
		/**
		* A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
		*/
		PRACTITIONERROLE, 
		/**
		* An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
		*/
		PROCEDURE, 
		/**
		* Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
		*/
		PROVENANCE, 
		/**
		* A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
		*/
		QUESTIONNAIRE, 
		/**
		* A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
		*/
		QUESTIONNAIRERESPONSE, 
		/**
		* The regulatory authorization of a medicinal product, device or process.
		*/
		REGULATEDAUTHORIZATION, 
		/**
		* Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
		*/
		RELATEDPERSON, 
		/**
		* A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
		*/
		REQUESTGROUP, 
		/**
		* A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
		*/
		RESEARCHSTUDY, 
		/**
		* A physical entity which is the primary unit of operational and/or administrative interest in a study.
		*/
		RESEARCHSUBJECT, 
		/**
		* This is the base resource type for everything.
		*/
		RESOURCE, 
		/**
		* An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
		*/
		RISKASSESSMENT, 
		/**
		* A container for slots of time that may be available for booking appointments.
		*/
		SCHEDULE, 
		/**
		* A search parameter that defines a named search item that can be used to search/filter on a resource.
		*/
		SEARCHPARAMETER, 
		/**
		* A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
		*/
		SERVICEREQUEST, 
		/**
		* A slot of time on a schedule that may be available for booking appointments.
		*/
		SLOT, 
		/**
		* A sample to be used for analysis.
		*/
		SPECIMEN, 
		/**
		* A kind of specimen with associated set of requirements.
		*/
		SPECIMENDEFINITION, 
		/**
		* A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
		*/
		STRUCTUREDEFINITION, 
		/**
		* A Map of relationships between 2 structures that can be used to transform data.
		*/
		STRUCTUREMAP, 
		/**
		* The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
		*/
		SUBSCRIPTION, 
		/**
		* The SubscriptionStatus resource describes the state of a Subscription during notifications.
		*/
		SUBSCRIPTIONSTATUS, 
		/**
		* Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.
		*/
		SUBSCRIPTIONTOPIC, 
		/**
		* A homogeneous material with a definite composition.
		*/
		SUBSTANCE, 
		/**
		* The detailed description of a substance, typically at a level beyond what is used for prescribing.
		*/
		SUBSTANCEDEFINITION, 
		/**
		* Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
		*/
		SUBSTANCENUCLEICACID, 
		/**
		* Properties of a substance specific to it being a polymer.
		*/
		SUBSTANCEPOLYMER, 
		/**
		* A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
		*/
		SUBSTANCEPROTEIN, 
		/**
		* Todo.
		*/
		SUBSTANCEREFERENCEINFORMATION, 
		/**
		* Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
		*/
		SUBSTANCESOURCEMATERIAL, 
		/**
		* Record of delivery of what is supplied.
		*/
		SUPPLYDELIVERY, 
		/**
		* A record of a request for a medication, substance or device used in the healthcare setting.
		*/
		SUPPLYREQUEST, 
		/**
		* A task to be performed.
		*/
		TASK, 
		/**
		* A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		TERMINOLOGYCAPABILITIES, 
		/**
		* A summary of information based on the results of executing a TestScript.
		*/
		TESTREPORT, 
		/**
		* A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
		*/
		TESTSCRIPT, 
		/**
		* A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
		*/
		VALUESET, 
		/**
		* Describes validation requirements, source(s), status and dates for one or more elements.
		*/
		VERIFICATIONRESULT, 
		/**
		* An authorization for the provision of glasses and/or contact lenses to a patient.
		*/
		VISIONPRESCRIPTION, 
		/**
		* A place holder that means any kind of data type
		*/
		TYPE, 
		/**
		* A place holder that means any kind of resource
		*/
		ANY, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ADDRESS -> "Address"
				AGE -> "Age"
				ANNOTATION -> "Annotation"
				ATTACHMENT -> "Attachment"
				BACKBONEELEMENT -> "BackboneElement"
				BACKBONETYPE -> "BackboneType"
				BASE -> "Base"
				CODEABLECONCEPT -> "CodeableConcept"
				CODEABLEREFERENCE -> "CodeableReference"
				CODING -> "Coding"
				CONTACTDETAIL -> "ContactDetail"
				CONTACTPOINT -> "ContactPoint"
				CONTRIBUTOR -> "Contributor"
				COUNT -> "Count"
				DATAREQUIREMENT -> "DataRequirement"
				DATATYPE -> "DataType"
				DISTANCE -> "Distance"
				DOSAGE -> "Dosage"
				DURATION -> "Duration"
				ELEMENT -> "Element"
				ELEMENTDEFINITION -> "ElementDefinition"
				EXPRESSION -> "Expression"
				EXTENSION -> "Extension"
				HUMANNAME -> "HumanName"
				IDENTIFIER -> "Identifier"
				MARKETINGSTATUS -> "MarketingStatus"
				META -> "Meta"
				MONEY -> "Money"
				MONEYQUANTITY -> "MoneyQuantity"
				NARRATIVE -> "Narrative"
				ORDEREDDISTRIBUTION -> "OrderedDistribution"
				PARAMETERDEFINITION -> "ParameterDefinition"
				PERIOD -> "Period"
				POPULATION -> "Population"
				PRIMITIVETYPE -> "PrimitiveType"
				PRODCHARACTERISTIC -> "ProdCharacteristic"
				PRODUCTSHELFLIFE -> "ProductShelfLife"
				QUANTITY -> "Quantity"
				RANGE -> "Range"
				RATIO -> "Ratio"
				REFERENCE -> "Reference"
				RELATEDARTIFACT -> "RelatedArtifact"
				SAMPLEDDATA -> "SampledData"
				SIGNATURE -> "Signature"
				SIMPLEQUANTITY -> "SimpleQuantity"
				STATISTIC -> "Statistic"
				TIMING -> "Timing"
				TRIGGERDEFINITION -> "TriggerDefinition"
				USAGECONTEXT -> "UsageContext"
				BASE64BINARY -> "base64Binary"
				BOOLEAN -> "boolean"
				CANONICAL -> "canonical"
				CODE -> "code"
				DATE -> "date"
				DATETIME -> "dateTime"
				DECIMAL -> "decimal"
				ID -> "id"
				INSTANT -> "instant"
				INTEGER -> "integer"
				INTEGER64 -> "integer64"
				MARKDOWN -> "markdown"
				OID -> "oid"
				POSITIVEINT -> "positiveInt"
				STRING -> "string"
				TIME -> "time"
				UNSIGNEDINT -> "unsignedInt"
				URI -> "uri"
				URL -> "url"
				UUID -> "uuid"
				XHTML -> "xhtml"
				ACCOUNT -> "Account"
				ACTIVITYDEFINITION -> "ActivityDefinition"
				ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition"
				ADVERSEEVENT -> "AdverseEvent"
				ALLERGYINTOLERANCE -> "AllergyIntolerance"
				APPOINTMENT -> "Appointment"
				APPOINTMENTRESPONSE -> "AppointmentResponse"
				AUDITEVENT -> "AuditEvent"
				BASIC -> "Basic"
				BINARY -> "Binary"
				BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct"
				BODYSTRUCTURE -> "BodyStructure"
				BUNDLE -> "Bundle"
				CAPABILITYSTATEMENT -> "CapabilityStatement"
				CAPABILITYSTATEMENT2 -> "CapabilityStatement2"
				CAREPLAN -> "CarePlan"
				CARETEAM -> "CareTeam"
				CATALOGENTRY -> "CatalogEntry"
				CHARGEITEM -> "ChargeItem"
				CHARGEITEMDEFINITION -> "ChargeItemDefinition"
				CITATION -> "Citation"
				CLAIM -> "Claim"
				CLAIMRESPONSE -> "ClaimResponse"
				CLINICALIMPRESSION -> "ClinicalImpression"
				CLINICALUSEISSUE -> "ClinicalUseIssue"
				CODESYSTEM -> "CodeSystem"
				COMMUNICATION -> "Communication"
				COMMUNICATIONREQUEST -> "CommunicationRequest"
				COMPARTMENTDEFINITION -> "CompartmentDefinition"
				COMPOSITION -> "Composition"
				CONCEPTMAP -> "ConceptMap"
				CONDITION -> "Condition"
				CONDITIONDEFINITION -> "ConditionDefinition"
				CONSENT -> "Consent"
				CONTRACT -> "Contract"
				COVERAGE -> "Coverage"
				COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest"
				COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse"
				DETECTEDISSUE -> "DetectedIssue"
				DEVICE -> "Device"
				DEVICEDEFINITION -> "DeviceDefinition"
				DEVICEMETRIC -> "DeviceMetric"
				DEVICEREQUEST -> "DeviceRequest"
				DEVICEUSESTATEMENT -> "DeviceUseStatement"
				DIAGNOSTICREPORT -> "DiagnosticReport"
				DOCUMENTMANIFEST -> "DocumentManifest"
				DOCUMENTREFERENCE -> "DocumentReference"
				DOMAINRESOURCE -> "DomainResource"
				ENCOUNTER -> "Encounter"
				ENDPOINT -> "Endpoint"
				ENROLLMENTREQUEST -> "EnrollmentRequest"
				ENROLLMENTRESPONSE -> "EnrollmentResponse"
				EPISODEOFCARE -> "EpisodeOfCare"
				EVENTDEFINITION -> "EventDefinition"
				EVIDENCE -> "Evidence"
				EVIDENCEREPORT -> "EvidenceReport"
				EVIDENCEVARIABLE -> "EvidenceVariable"
				EXAMPLESCENARIO -> "ExampleScenario"
				EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit"
				FAMILYMEMBERHISTORY -> "FamilyMemberHistory"
				FLAG -> "Flag"
				GOAL -> "Goal"
				GRAPHDEFINITION -> "GraphDefinition"
				GROUP -> "Group"
				GUIDANCERESPONSE -> "GuidanceResponse"
				HEALTHCARESERVICE -> "HealthcareService"
				IMAGINGSTUDY -> "ImagingStudy"
				IMMUNIZATION -> "Immunization"
				IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation"
				IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation"
				IMPLEMENTATIONGUIDE -> "ImplementationGuide"
				INGREDIENT -> "Ingredient"
				INSURANCEPLAN -> "InsurancePlan"
				INVOICE -> "Invoice"
				LIBRARY -> "Library"
				LINKAGE -> "Linkage"
				LIST -> "List"
				LOCATION -> "Location"
				MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition"
				MEASURE -> "Measure"
				MEASUREREPORT -> "MeasureReport"
				MEDICATION -> "Medication"
				MEDICATIONADMINISTRATION -> "MedicationAdministration"
				MEDICATIONDISPENSE -> "MedicationDispense"
				MEDICATIONKNOWLEDGE -> "MedicationKnowledge"
				MEDICATIONREQUEST -> "MedicationRequest"
				MEDICATIONUSAGE -> "MedicationUsage"
				MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition"
				MESSAGEDEFINITION -> "MessageDefinition"
				MESSAGEHEADER -> "MessageHeader"
				MOLECULARSEQUENCE -> "MolecularSequence"
				NAMINGSYSTEM -> "NamingSystem"
				NUTRITIONINTAKE -> "NutritionIntake"
				NUTRITIONORDER -> "NutritionOrder"
				NUTRITIONPRODUCT -> "NutritionProduct"
				OBSERVATION -> "Observation"
				OBSERVATIONDEFINITION -> "ObservationDefinition"
				OPERATIONDEFINITION -> "OperationDefinition"
				OPERATIONOUTCOME -> "OperationOutcome"
				ORGANIZATION -> "Organization"
				ORGANIZATIONAFFILIATION -> "OrganizationAffiliation"
				PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition"
				PARAMETERS -> "Parameters"
				PATIENT -> "Patient"
				PAYMENTNOTICE -> "PaymentNotice"
				PAYMENTRECONCILIATION -> "PaymentReconciliation"
				PERMISSION -> "Permission"
				PERSON -> "Person"
				PLANDEFINITION -> "PlanDefinition"
				PRACTITIONER -> "Practitioner"
				PRACTITIONERROLE -> "PractitionerRole"
				PROCEDURE -> "Procedure"
				PROVENANCE -> "Provenance"
				QUESTIONNAIRE -> "Questionnaire"
				QUESTIONNAIRERESPONSE -> "QuestionnaireResponse"
				REGULATEDAUTHORIZATION -> "RegulatedAuthorization"
				RELATEDPERSON -> "RelatedPerson"
				REQUESTGROUP -> "RequestGroup"
				RESEARCHSTUDY -> "ResearchStudy"
				RESEARCHSUBJECT -> "ResearchSubject"
				RESOURCE -> "Resource"
				RISKASSESSMENT -> "RiskAssessment"
				SCHEDULE -> "Schedule"
				SEARCHPARAMETER -> "SearchParameter"
				SERVICEREQUEST -> "ServiceRequest"
				SLOT -> "Slot"
				SPECIMEN -> "Specimen"
				SPECIMENDEFINITION -> "SpecimenDefinition"
				STRUCTUREDEFINITION -> "StructureDefinition"
				STRUCTUREMAP -> "StructureMap"
				SUBSCRIPTION -> "Subscription"
				SUBSCRIPTIONSTATUS -> "SubscriptionStatus"
				SUBSCRIPTIONTOPIC -> "SubscriptionTopic"
				SUBSTANCE -> "Substance"
				SUBSTANCEDEFINITION -> "SubstanceDefinition"
				SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid"
				SUBSTANCEPOLYMER -> "SubstancePolymer"
				SUBSTANCEPROTEIN -> "SubstanceProtein"
				SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation"
				SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial"
				SUPPLYDELIVERY -> "SupplyDelivery"
				SUPPLYREQUEST -> "SupplyRequest"
				TASK -> "Task"
				TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities"
				TESTREPORT -> "TestReport"
				TESTSCRIPT -> "TestScript"
				VALUESET -> "ValueSet"
				VERIFICATIONRESULT -> "VerificationResult"
				VISIONPRESCRIPTION -> "VisionPrescription"
				TYPE -> "Type"
				ANY -> "Any"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ADDRESS -> "http://hl7.org/fhir/data-types"
				AGE -> "http://hl7.org/fhir/data-types"
				ANNOTATION -> "http://hl7.org/fhir/data-types"
				ATTACHMENT -> "http://hl7.org/fhir/data-types"
				BACKBONEELEMENT -> "http://hl7.org/fhir/data-types"
				BACKBONETYPE -> "http://hl7.org/fhir/data-types"
				BASE -> "http://hl7.org/fhir/data-types"
				CODEABLECONCEPT -> "http://hl7.org/fhir/data-types"
				CODEABLEREFERENCE -> "http://hl7.org/fhir/data-types"
				CODING -> "http://hl7.org/fhir/data-types"
				CONTACTDETAIL -> "http://hl7.org/fhir/data-types"
				CONTACTPOINT -> "http://hl7.org/fhir/data-types"
				CONTRIBUTOR -> "http://hl7.org/fhir/data-types"
				COUNT -> "http://hl7.org/fhir/data-types"
				DATAREQUIREMENT -> "http://hl7.org/fhir/data-types"
				DATATYPE -> "http://hl7.org/fhir/data-types"
				DISTANCE -> "http://hl7.org/fhir/data-types"
				DOSAGE -> "http://hl7.org/fhir/data-types"
				DURATION -> "http://hl7.org/fhir/data-types"
				ELEMENT -> "http://hl7.org/fhir/data-types"
				ELEMENTDEFINITION -> "http://hl7.org/fhir/data-types"
				EXPRESSION -> "http://hl7.org/fhir/data-types"
				EXTENSION -> "http://hl7.org/fhir/data-types"
				HUMANNAME -> "http://hl7.org/fhir/data-types"
				IDENTIFIER -> "http://hl7.org/fhir/data-types"
				MARKETINGSTATUS -> "http://hl7.org/fhir/data-types"
				META -> "http://hl7.org/fhir/data-types"
				MONEY -> "http://hl7.org/fhir/data-types"
				MONEYQUANTITY -> "http://hl7.org/fhir/data-types"
				NARRATIVE -> "http://hl7.org/fhir/data-types"
				ORDEREDDISTRIBUTION -> "http://hl7.org/fhir/data-types"
				PARAMETERDEFINITION -> "http://hl7.org/fhir/data-types"
				PERIOD -> "http://hl7.org/fhir/data-types"
				POPULATION -> "http://hl7.org/fhir/data-types"
				PRIMITIVETYPE -> "http://hl7.org/fhir/data-types"
				PRODCHARACTERISTIC -> "http://hl7.org/fhir/data-types"
				PRODUCTSHELFLIFE -> "http://hl7.org/fhir/data-types"
				QUANTITY -> "http://hl7.org/fhir/data-types"
				RANGE -> "http://hl7.org/fhir/data-types"
				RATIO -> "http://hl7.org/fhir/data-types"
				REFERENCE -> "http://hl7.org/fhir/data-types"
				RELATEDARTIFACT -> "http://hl7.org/fhir/data-types"
				SAMPLEDDATA -> "http://hl7.org/fhir/data-types"
				SIGNATURE -> "http://hl7.org/fhir/data-types"
				SIMPLEQUANTITY -> "http://hl7.org/fhir/data-types"
				STATISTIC -> "http://hl7.org/fhir/data-types"
				TIMING -> "http://hl7.org/fhir/data-types"
				TRIGGERDEFINITION -> "http://hl7.org/fhir/data-types"
				USAGECONTEXT -> "http://hl7.org/fhir/data-types"
				BASE64BINARY -> "http://hl7.org/fhir/data-types"
				BOOLEAN -> "http://hl7.org/fhir/data-types"
				CANONICAL -> "http://hl7.org/fhir/data-types"
				CODE -> "http://hl7.org/fhir/data-types"
				DATE -> "http://hl7.org/fhir/data-types"
				DATETIME -> "http://hl7.org/fhir/data-types"
				DECIMAL -> "http://hl7.org/fhir/data-types"
				ID -> "http://hl7.org/fhir/data-types"
				INSTANT -> "http://hl7.org/fhir/data-types"
				INTEGER -> "http://hl7.org/fhir/data-types"
				INTEGER64 -> "http://hl7.org/fhir/data-types"
				MARKDOWN -> "http://hl7.org/fhir/data-types"
				OID -> "http://hl7.org/fhir/data-types"
				POSITIVEINT -> "http://hl7.org/fhir/data-types"
				STRING -> "http://hl7.org/fhir/data-types"
				TIME -> "http://hl7.org/fhir/data-types"
				UNSIGNEDINT -> "http://hl7.org/fhir/data-types"
				URI -> "http://hl7.org/fhir/data-types"
				URL -> "http://hl7.org/fhir/data-types"
				UUID -> "http://hl7.org/fhir/data-types"
				XHTML -> "http://hl7.org/fhir/data-types"
				ACCOUNT -> "http://hl7.org/fhir/resource-types"
				ACTIVITYDEFINITION -> "http://hl7.org/fhir/resource-types"
				ADMINISTRABLEPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				ADVERSEEVENT -> "http://hl7.org/fhir/resource-types"
				ALLERGYINTOLERANCE -> "http://hl7.org/fhir/resource-types"
				APPOINTMENT -> "http://hl7.org/fhir/resource-types"
				APPOINTMENTRESPONSE -> "http://hl7.org/fhir/resource-types"
				AUDITEVENT -> "http://hl7.org/fhir/resource-types"
				BASIC -> "http://hl7.org/fhir/resource-types"
				BINARY -> "http://hl7.org/fhir/resource-types"
				BIOLOGICALLYDERIVEDPRODUCT -> "http://hl7.org/fhir/resource-types"
				BODYSTRUCTURE -> "http://hl7.org/fhir/resource-types"
				BUNDLE -> "http://hl7.org/fhir/resource-types"
				CAPABILITYSTATEMENT -> "http://hl7.org/fhir/resource-types"
				CAPABILITYSTATEMENT2 -> "http://hl7.org/fhir/resource-types"
				CAREPLAN -> "http://hl7.org/fhir/resource-types"
				CARETEAM -> "http://hl7.org/fhir/resource-types"
				CATALOGENTRY -> "http://hl7.org/fhir/resource-types"
				CHARGEITEM -> "http://hl7.org/fhir/resource-types"
				CHARGEITEMDEFINITION -> "http://hl7.org/fhir/resource-types"
				CITATION -> "http://hl7.org/fhir/resource-types"
				CLAIM -> "http://hl7.org/fhir/resource-types"
				CLAIMRESPONSE -> "http://hl7.org/fhir/resource-types"
				CLINICALIMPRESSION -> "http://hl7.org/fhir/resource-types"
				CLINICALUSEISSUE -> "http://hl7.org/fhir/resource-types"
				CODESYSTEM -> "http://hl7.org/fhir/resource-types"
				COMMUNICATION -> "http://hl7.org/fhir/resource-types"
				COMMUNICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
				COMPARTMENTDEFINITION -> "http://hl7.org/fhir/resource-types"
				COMPOSITION -> "http://hl7.org/fhir/resource-types"
				CONCEPTMAP -> "http://hl7.org/fhir/resource-types"
				CONDITION -> "http://hl7.org/fhir/resource-types"
				CONDITIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				CONSENT -> "http://hl7.org/fhir/resource-types"
				CONTRACT -> "http://hl7.org/fhir/resource-types"
				COVERAGE -> "http://hl7.org/fhir/resource-types"
				COVERAGEELIGIBILITYREQUEST -> "http://hl7.org/fhir/resource-types"
				COVERAGEELIGIBILITYRESPONSE -> "http://hl7.org/fhir/resource-types"
				DETECTEDISSUE -> "http://hl7.org/fhir/resource-types"
				DEVICE -> "http://hl7.org/fhir/resource-types"
				DEVICEDEFINITION -> "http://hl7.org/fhir/resource-types"
				DEVICEMETRIC -> "http://hl7.org/fhir/resource-types"
				DEVICEREQUEST -> "http://hl7.org/fhir/resource-types"
				DEVICEUSESTATEMENT -> "http://hl7.org/fhir/resource-types"
				DIAGNOSTICREPORT -> "http://hl7.org/fhir/resource-types"
				DOCUMENTMANIFEST -> "http://hl7.org/fhir/resource-types"
				DOCUMENTREFERENCE -> "http://hl7.org/fhir/resource-types"
				DOMAINRESOURCE -> "http://hl7.org/fhir/resource-types"
				ENCOUNTER -> "http://hl7.org/fhir/resource-types"
				ENDPOINT -> "http://hl7.org/fhir/resource-types"
				ENROLLMENTREQUEST -> "http://hl7.org/fhir/resource-types"
				ENROLLMENTRESPONSE -> "http://hl7.org/fhir/resource-types"
				EPISODEOFCARE -> "http://hl7.org/fhir/resource-types"
				EVENTDEFINITION -> "http://hl7.org/fhir/resource-types"
				EVIDENCE -> "http://hl7.org/fhir/resource-types"
				EVIDENCEREPORT -> "http://hl7.org/fhir/resource-types"
				EVIDENCEVARIABLE -> "http://hl7.org/fhir/resource-types"
				EXAMPLESCENARIO -> "http://hl7.org/fhir/resource-types"
				EXPLANATIONOFBENEFIT -> "http://hl7.org/fhir/resource-types"
				FAMILYMEMBERHISTORY -> "http://hl7.org/fhir/resource-types"
				FLAG -> "http://hl7.org/fhir/resource-types"
				GOAL -> "http://hl7.org/fhir/resource-types"
				GRAPHDEFINITION -> "http://hl7.org/fhir/resource-types"
				GROUP -> "http://hl7.org/fhir/resource-types"
				GUIDANCERESPONSE -> "http://hl7.org/fhir/resource-types"
				HEALTHCARESERVICE -> "http://hl7.org/fhir/resource-types"
				IMAGINGSTUDY -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATION -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATIONEVALUATION -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATIONRECOMMENDATION -> "http://hl7.org/fhir/resource-types"
				IMPLEMENTATIONGUIDE -> "http://hl7.org/fhir/resource-types"
				INGREDIENT -> "http://hl7.org/fhir/resource-types"
				INSURANCEPLAN -> "http://hl7.org/fhir/resource-types"
				INVOICE -> "http://hl7.org/fhir/resource-types"
				LIBRARY -> "http://hl7.org/fhir/resource-types"
				LINKAGE -> "http://hl7.org/fhir/resource-types"
				LIST -> "http://hl7.org/fhir/resource-types"
				LOCATION -> "http://hl7.org/fhir/resource-types"
				MANUFACTUREDITEMDEFINITION -> "http://hl7.org/fhir/resource-types"
				MEASURE -> "http://hl7.org/fhir/resource-types"
				MEASUREREPORT -> "http://hl7.org/fhir/resource-types"
				MEDICATION -> "http://hl7.org/fhir/resource-types"
				MEDICATIONADMINISTRATION -> "http://hl7.org/fhir/resource-types"
				MEDICATIONDISPENSE -> "http://hl7.org/fhir/resource-types"
				MEDICATIONKNOWLEDGE -> "http://hl7.org/fhir/resource-types"
				MEDICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
				MEDICATIONUSAGE -> "http://hl7.org/fhir/resource-types"
				MEDICINALPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				MESSAGEDEFINITION -> "http://hl7.org/fhir/resource-types"
				MESSAGEHEADER -> "http://hl7.org/fhir/resource-types"
				MOLECULARSEQUENCE -> "http://hl7.org/fhir/resource-types"
				NAMINGSYSTEM -> "http://hl7.org/fhir/resource-types"
				NUTRITIONINTAKE -> "http://hl7.org/fhir/resource-types"
				NUTRITIONORDER -> "http://hl7.org/fhir/resource-types"
				NUTRITIONPRODUCT -> "http://hl7.org/fhir/resource-types"
				OBSERVATION -> "http://hl7.org/fhir/resource-types"
				OBSERVATIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				OPERATIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				OPERATIONOUTCOME -> "http://hl7.org/fhir/resource-types"
				ORGANIZATION -> "http://hl7.org/fhir/resource-types"
				ORGANIZATIONAFFILIATION -> "http://hl7.org/fhir/resource-types"
				PACKAGEDPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				PARAMETERS -> "http://hl7.org/fhir/resource-types"
				PATIENT -> "http://hl7.org/fhir/resource-types"
				PAYMENTNOTICE -> "http://hl7.org/fhir/resource-types"
				PAYMENTRECONCILIATION -> "http://hl7.org/fhir/resource-types"
				PERMISSION -> "http://hl7.org/fhir/resource-types"
				PERSON -> "http://hl7.org/fhir/resource-types"
				PLANDEFINITION -> "http://hl7.org/fhir/resource-types"
				PRACTITIONER -> "http://hl7.org/fhir/resource-types"
				PRACTITIONERROLE -> "http://hl7.org/fhir/resource-types"
				PROCEDURE -> "http://hl7.org/fhir/resource-types"
				PROVENANCE -> "http://hl7.org/fhir/resource-types"
				QUESTIONNAIRE -> "http://hl7.org/fhir/resource-types"
				QUESTIONNAIRERESPONSE -> "http://hl7.org/fhir/resource-types"
				REGULATEDAUTHORIZATION -> "http://hl7.org/fhir/resource-types"
				RELATEDPERSON -> "http://hl7.org/fhir/resource-types"
				REQUESTGROUP -> "http://hl7.org/fhir/resource-types"
				RESEARCHSTUDY -> "http://hl7.org/fhir/resource-types"
				RESEARCHSUBJECT -> "http://hl7.org/fhir/resource-types"
				RESOURCE -> "http://hl7.org/fhir/resource-types"
				RISKASSESSMENT -> "http://hl7.org/fhir/resource-types"
				SCHEDULE -> "http://hl7.org/fhir/resource-types"
				SEARCHPARAMETER -> "http://hl7.org/fhir/resource-types"
				SERVICEREQUEST -> "http://hl7.org/fhir/resource-types"
				SLOT -> "http://hl7.org/fhir/resource-types"
				SPECIMEN -> "http://hl7.org/fhir/resource-types"
				SPECIMENDEFINITION -> "http://hl7.org/fhir/resource-types"
				STRUCTUREDEFINITION -> "http://hl7.org/fhir/resource-types"
				STRUCTUREMAP -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTION -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTIONSTATUS -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTIONTOPIC -> "http://hl7.org/fhir/resource-types"
				SUBSTANCE -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEDEFINITION -> "http://hl7.org/fhir/resource-types"
				SUBSTANCENUCLEICACID -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEPOLYMER -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEPROTEIN -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEREFERENCEINFORMATION -> "http://hl7.org/fhir/resource-types"
				SUBSTANCESOURCEMATERIAL -> "http://hl7.org/fhir/resource-types"
				SUPPLYDELIVERY -> "http://hl7.org/fhir/resource-types"
				SUPPLYREQUEST -> "http://hl7.org/fhir/resource-types"
				TASK -> "http://hl7.org/fhir/resource-types"
				TERMINOLOGYCAPABILITIES -> "http://hl7.org/fhir/resource-types"
				TESTREPORT -> "http://hl7.org/fhir/resource-types"
				TESTSCRIPT -> "http://hl7.org/fhir/resource-types"
				VALUESET -> "http://hl7.org/fhir/resource-types"
				VERIFICATIONRESULT -> "http://hl7.org/fhir/resource-types"
				VISIONPRESCRIPTION -> "http://hl7.org/fhir/resource-types"
				TYPE -> "http://hl7.org/fhir/abstract-types"
				ANY -> "http://hl7.org/fhir/abstract-types"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ADDRESS -> "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world."
				AGE -> "A duration of time during which an organism (or a process) has existed."
				ANNOTATION -> "A  text note which also  contains information about who made the statement and when."
				ATTACHMENT -> "For referring to data content defined in other formats."
				BACKBONEELEMENT -> "Base definition for all elements that are defined inside a resource - but not those in a data type."
				BACKBONETYPE -> "Base definition for the few data types that are allowed to carry modifier extensions."
				BASE -> "Base definition for all types defined in FHIR type system."
				CODEABLECONCEPT -> "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text."
				CODEABLEREFERENCE -> "A reference to a resource (by instance), or instead, a reference to a cencept defined in a terminology or ontology (by class)."
				CODING -> "A reference to a code defined by a terminology system."
				CONTACTDETAIL -> "Specifies contact information for a person or organization."
				CONTACTPOINT -> "Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc."
				CONTRIBUTOR -> "A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers."
				COUNT -> "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies."
				DATAREQUIREMENT -> "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
				DATATYPE -> "The base class for all re-useable types defined as part of the FHIR Specification."
				DISTANCE -> "A length - a value with a unit that is a physical distance."
				DOSAGE -> "Indicates how the medication is/was taken or should be taken by the patient."
				DURATION -> "A length of time."
				ELEMENT -> "Base definition for all elements in a resource."
				ELEMENTDEFINITION -> "Captures constraints on each element within the resource, profile, or extension."
				EXPRESSION -> "A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used."
				EXTENSION -> "Optional Extension Element - found in all resources."
				HUMANNAME -> "A human's name with the ability to identify parts and usage."
				IDENTIFIER -> "An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers."
				MARKETINGSTATUS -> "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available."
				META -> "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource."
				MONEY -> "An amount of economic utility in some recognized currency."
				MONEYQUANTITY -> ""
				NARRATIVE -> "A human-readable summary of the resource conveying the essential clinical and business information for the resource."
				ORDEREDDISTRIBUTION -> "An ordered list (distribution) of statistics."
				PARAMETERDEFINITION -> "The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the $evaluate operation. Output parameters are included in the GuidanceResponse."
				PERIOD -> "A time period defined by a start and end date and optionally time."
				POPULATION -> "A populatioof people with some set of grouping criteria."
				PRIMITIVETYPE -> "The base type for all re-useable types defined that have a simple property."
				PRODCHARACTERISTIC -> "The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available."
				PRODUCTSHELFLIFE -> "The shelf-life and storage information for a medicinal product item or container can be described using this class."
				QUANTITY -> "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies."
				RANGE -> "A set of ordered Quantities defined by a low and high limit."
				RATIO -> "A relationship of two Quantity values - expressed as a numerator and a denominator."
				REFERENCE -> "A reference from one resource to another."
				RELATEDARTIFACT -> "Related artifacts such as additional documentation, justification, or bibliographic references."
				SAMPLEDDATA -> "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data."
				SIGNATURE -> "A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities."
				SIMPLEQUANTITY -> ""
				STATISTIC -> "A fact or piece of data from a  study of a large quantity of numerical data.  A mathematical or quantified characteristic of a group of observations."
				TIMING -> "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out."
				TRIGGERDEFINITION -> "A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element."
				USAGECONTEXT -> "Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
				BASE64BINARY -> "A stream of bytes"
				BOOLEAN -> "Value of \"true\" or \"false\""
				CANONICAL -> "A URI that is a reference to a canonical URL on a FHIR resource"
				CODE -> "A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents"
				DATE -> "A date or partial date (e.g. just year or year + month). There is no time zone. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates."
				DATETIME -> "A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a time zone SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates."
				DECIMAL -> "A rational number with implicit precision"
				ID -> "Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive."
				INSTANT -> "An instant in time - known at least to the second"
				INTEGER -> "A whole number"
				INTEGER64 -> "A very large whole number"
				MARKDOWN -> "A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine"
				OID -> "An OID represented as a URI"
				POSITIVEINT -> "An integer with a value that is positive (e.g. >0)"
				STRING -> "A sequence of Unicode characters"
				TIME -> "A time during the day, with no date specified"
				UNSIGNEDINT -> "An integer with a value that is not negative (e.g. >= 0)"
				URI -> "String of characters used to identify a name or a resource"
				URL -> "A URI that is a literal reference"
				UUID -> "A UUID, represented as a URI"
				XHTML -> "XHTML format, as defined by W3C, but restricted usage (mainly, no active content)"
				ACCOUNT -> "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
				ACTIVITYDEFINITION -> "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
				ADMINISTRABLEPRODUCTDEFINITION -> "A pharmaceutical product described in terms of its composition and dose form."
				ADVERSEEVENT -> "An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research subject.  The unintended effects may require additional monitoring, treatment or hospitalization or may result in death.  The AdverseEvent resource also extends to potential or avoided events that could have had such effects."
				ALLERGYINTOLERANCE -> "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
				APPOINTMENT -> "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
				APPOINTMENTRESPONSE -> "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection."
				AUDITEVENT -> "A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis."
				BASIC -> "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification."
				BINARY -> "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc."
				BIOLOGICALLYDERIVEDPRODUCT -> "A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity."
				BODYSTRUCTURE -> "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case."
				BUNDLE -> "A container for a collection of resources."
				CAPABILITYSTATEMENT -> "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				CAPABILITYSTATEMENT2 -> "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				CAREPLAN -> "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
				CARETEAM -> "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care."
				CATALOGENTRY -> "Catalog entries are wrappers that contextualize items included in a catalog."
				CHARGEITEM -> "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
				CHARGEITEMDEFINITION -> "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system."
				CITATION -> "The Citation."
				CLAIM -> "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement."
				CLAIMRESPONSE -> "This resource provides the adjudication details from the processing of a Claim resource."
				CLINICALIMPRESSION -> "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
				CLINICALUSEISSUE -> "A single usage issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure."
				CODESYSTEM -> "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content."
				COMMUNICATION -> "A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition."
				COMMUNICATIONREQUEST -> "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
				COMPARTMENTDEFINITION -> "A compartment definition that defines how resources are accessed on a server."
				COMPOSITION -> "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.)."
				CONCEPTMAP -> "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models."
				CONDITION -> "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
				CONDITIONDEFINITION -> "A definition of a condition and information relevant to managing it."
				CONSENT -> "A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
				CONTRACT -> "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement."
				COVERAGE -> "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment."
				COVERAGEELIGIBILITYREQUEST -> "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
				COVERAGEELIGIBILITYRESPONSE -> "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource."
				DETECTEDISSUE -> "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
				DEVICE -> "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device."
				DEVICEDEFINITION -> "The characteristics, operational status and capabilities of a medical-related component of a medical device."
				DEVICEMETRIC -> "Describes a measurement, calculation or setting capability of a medical device."
				DEVICEREQUEST -> "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker."
				DEVICEUSESTATEMENT -> "A record of a device being used by a patient where the record is the result of a report from the patient or a clinician."
				DIAGNOSTICREPORT -> "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
				DOCUMENTMANIFEST -> "A collection of documents compiled for a purpose together with metadata that applies to the collection."
				DOCUMENTREFERENCE -> "A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this \"document\" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference."
				DOMAINRESOURCE -> "A resource that includes narrative, extensions, and contained resources."
				ENCOUNTER -> "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
				ENDPOINT -> "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
				ENROLLMENTREQUEST -> "This resource provides the insurance enrollment details to the insurer regarding a specified coverage."
				ENROLLMENTRESPONSE -> "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource."
				EPISODEOFCARE -> "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
				EVENTDEFINITION -> "The EventDefinition resource provides a reusable description of when a particular event can occur."
				EVIDENCE -> "This represents statistics, certainty, both the intended and actual population, and evidence variables."
				EVIDENCEREPORT -> "The EvidenceReport."
				EVIDENCEVARIABLE -> "The EvidenceVariable resource describes an element that knowledge (Evidence) is about."
				EXAMPLESCENARIO -> "Example of workflow instance."
				EXPLANATIONOFBENEFIT -> "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
				FAMILYMEMBERHISTORY -> "Significant health conditions for a person related to the patient relevant in the context of care for the patient."
				FLAG -> "Prospective warnings of potential issues when providing care to the patient."
				GOAL -> "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
				GRAPHDEFINITION -> "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
				GROUP -> "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
				GUIDANCERESPONSE -> "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken."
				HEALTHCARESERVICE -> "The details of a healthcare service available at a location."
				IMAGINGSTUDY -> "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
				IMMUNIZATION -> "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party."
				IMMUNIZATIONEVALUATION -> "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations."
				IMMUNIZATIONRECOMMENDATION -> "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification."
				IMPLEMENTATIONGUIDE -> "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
				INGREDIENT -> "An ingredient of a manufactured item or pharmaceutical product."
				INSURANCEPLAN -> "Details of a Health Insurance product/plan provided by an organization."
				INVOICE -> "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose."
				LIBRARY -> "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets."
				LINKAGE -> "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\"."
				LIST -> "A list is a curated collection of resources."
				LOCATION -> "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated."
				MANUFACTUREDITEMDEFINITION -> "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product."
				MEASURE -> "The Measure resource provides the definition of a quality measure."
				MEASUREREPORT -> "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation."
				MEDICATION -> "This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use."
				MEDICATIONADMINISTRATION -> "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
				MEDICATIONDISPENSE -> "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
				MEDICATIONKNOWLEDGE -> "Information about a medication that is used to support knowledge."
				MEDICATIONREQUEST -> "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
				MEDICATIONUSAGE -> "A record of a medication that is being consumed by a patient.   A MedicationUsage may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. \n\nThe primary difference between a medicationusage and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationusage is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Usage information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information."
				MEDICINALPRODUCTDEFINITION -> "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use)."
				MESSAGEDEFINITION -> "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
				MESSAGEHEADER -> "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
				MOLECULARSEQUENCE -> "Raw data describing a biological sequence."
				NAMINGSYSTEM -> "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types."
				NUTRITIONINTAKE -> "A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake."
				NUTRITIONORDER -> "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
				NUTRITIONPRODUCT -> "A food or fluid product that is consumed by patients."
				OBSERVATION -> "Measurements and simple assertions made about a patient, device or other subject."
				OBSERVATIONDEFINITION -> "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service."
				OPERATIONDEFINITION -> "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
				OPERATIONOUTCOME -> "A collection of error, warning, or information messages that result from a system action."
				ORGANIZATION -> "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc."
				ORGANIZATIONAFFILIATION -> "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship."
				PACKAGEDPRODUCTDEFINITION -> "A medically related item or items, in a container or package."
				PARAMETERS -> "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it."
				PATIENT -> "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
				PAYMENTNOTICE -> "This resource provides the status of the payment for goods and services rendered, and the request and response resource references."
				PAYMENTRECONCILIATION -> "This resource provides the details including amount of a payment and allocates the payment items being paid."
				PERMISSION -> "Permission."
				PERSON -> "Demographics and administrative information about a person independent of a specific health-related context."
				PLANDEFINITION -> "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
				PRACTITIONER -> "A person who is directly or indirectly involved in the provisioning of healthcare."
				PRACTITIONERROLE -> "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
				PROCEDURE -> "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy."
				PROVENANCE -> "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
				QUESTIONNAIRE -> "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
				QUESTIONNAIRERESPONSE -> "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
				REGULATEDAUTHORIZATION -> "The regulatory authorization of a medicinal product, device or process."
				RELATEDPERSON -> "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process."
				REQUESTGROUP -> "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
				RESEARCHSTUDY -> "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
				RESEARCHSUBJECT -> "A physical entity which is the primary unit of operational and/or administrative interest in a study."
				RESOURCE -> "This is the base resource type for everything."
				RISKASSESSMENT -> "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
				SCHEDULE -> "A container for slots of time that may be available for booking appointments."
				SEARCHPARAMETER -> "A search parameter that defines a named search item that can be used to search/filter on a resource."
				SERVICEREQUEST -> "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed."
				SLOT -> "A slot of time on a schedule that may be available for booking appointments."
				SPECIMEN -> "A sample to be used for analysis."
				SPECIMENDEFINITION -> "A kind of specimen with associated set of requirements."
				STRUCTUREDEFINITION -> "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
				STRUCTUREMAP -> "A Map of relationships between 2 structures that can be used to transform data."
				SUBSCRIPTION -> "The subscription resource describes a particular client's request to be notified about a SubscriptionTopic."
				SUBSCRIPTIONSTATUS -> "The SubscriptionStatus resource describes the state of a Subscription during notifications."
				SUBSCRIPTIONTOPIC -> "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic."
				SUBSTANCE -> "A homogeneous material with a definite composition."
				SUBSTANCEDEFINITION -> "The detailed description of a substance, typically at a level beyond what is used for prescribing."
				SUBSTANCENUCLEICACID -> "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction."
				SUBSTANCEPOLYMER -> "Properties of a substance specific to it being a polymer."
				SUBSTANCEPROTEIN -> "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators."
				SUBSTANCEREFERENCEINFORMATION -> "Todo."
				SUBSTANCESOURCEMATERIAL -> "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex."
				SUPPLYDELIVERY -> "Record of delivery of what is supplied."
				SUPPLYREQUEST -> "A record of a request for a medication, substance or device used in the healthcare setting."
				TASK -> "A task to be performed."
				TERMINOLOGYCAPABILITIES -> "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				TESTREPORT -> "A summary of information based on the results of executing a TestScript."
				TESTSCRIPT -> "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification."
				VALUESET -> "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html)."
				VERIFICATIONRESULT -> "Describes validation requirements, source(s), status and dates for one or more elements."
				VISIONPRESCRIPTION -> "An authorization for the provision of glasses and/or contact lenses to a patient."
				TYPE -> "A place holder that means any kind of data type"
				ANY -> "A place holder that means any kind of resource"
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ADDRESS -> "Address";
				AGE -> "Age";
				ANNOTATION -> "Annotation";
				ATTACHMENT -> "Attachment";
				BACKBONEELEMENT -> "BackboneElement";
				BACKBONETYPE -> "BackboneType";
				BASE -> "Base";
				CODEABLECONCEPT -> "CodeableConcept";
				CODEABLEREFERENCE -> "CodeableReference";
				CODING -> "Coding";
				CONTACTDETAIL -> "ContactDetail";
				CONTACTPOINT -> "ContactPoint";
				CONTRIBUTOR -> "Contributor";
				COUNT -> "Count";
				DATAREQUIREMENT -> "DataRequirement";
				DATATYPE -> "DataType";
				DISTANCE -> "Distance";
				DOSAGE -> "Dosage";
				DURATION -> "Duration";
				ELEMENT -> "Element";
				ELEMENTDEFINITION -> "ElementDefinition";
				EXPRESSION -> "Expression";
				EXTENSION -> "Extension";
				HUMANNAME -> "HumanName";
				IDENTIFIER -> "Identifier";
				MARKETINGSTATUS -> "MarketingStatus";
				META -> "Meta";
				MONEY -> "Money";
				MONEYQUANTITY -> "MoneyQuantity";
				NARRATIVE -> "Narrative";
				ORDEREDDISTRIBUTION -> "OrderedDistribution";
				PARAMETERDEFINITION -> "ParameterDefinition";
				PERIOD -> "Period";
				POPULATION -> "Population";
				PRIMITIVETYPE -> "PrimitiveType";
				PRODCHARACTERISTIC -> "ProdCharacteristic";
				PRODUCTSHELFLIFE -> "ProductShelfLife";
				QUANTITY -> "Quantity";
				RANGE -> "Range";
				RATIO -> "Ratio";
				REFERENCE -> "Reference";
				RELATEDARTIFACT -> "RelatedArtifact";
				SAMPLEDDATA -> "SampledData";
				SIGNATURE -> "Signature";
				SIMPLEQUANTITY -> "SimpleQuantity";
				STATISTIC -> "Statistic";
				TIMING -> "Timing";
				TRIGGERDEFINITION -> "TriggerDefinition";
				USAGECONTEXT -> "UsageContext";
				BASE64BINARY -> "base64Binary";
				BOOLEAN -> "boolean";
				CANONICAL -> "canonical";
				CODE -> "code";
				DATE -> "date";
				DATETIME -> "dateTime";
				DECIMAL -> "decimal";
				ID -> "id";
				INSTANT -> "instant";
				INTEGER -> "integer";
				INTEGER64 -> "integer64";
				MARKDOWN -> "markdown";
				OID -> "oid";
				POSITIVEINT -> "positiveInt";
				STRING -> "string";
				TIME -> "time";
				UNSIGNEDINT -> "unsignedInt";
				URI -> "uri";
				URL -> "url";
				UUID -> "uuid";
				XHTML -> "XHTML";
				ACCOUNT -> "Account";
				ACTIVITYDEFINITION -> "ActivityDefinition";
				ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition";
				ADVERSEEVENT -> "AdverseEvent";
				ALLERGYINTOLERANCE -> "AllergyIntolerance";
				APPOINTMENT -> "Appointment";
				APPOINTMENTRESPONSE -> "AppointmentResponse";
				AUDITEVENT -> "AuditEvent";
				BASIC -> "Basic";
				BINARY -> "Binary";
				BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct";
				BODYSTRUCTURE -> "BodyStructure";
				BUNDLE -> "Bundle";
				CAPABILITYSTATEMENT -> "CapabilityStatement";
				CAPABILITYSTATEMENT2 -> "CapabilityStatement2";
				CAREPLAN -> "CarePlan";
				CARETEAM -> "CareTeam";
				CATALOGENTRY -> "CatalogEntry";
				CHARGEITEM -> "ChargeItem";
				CHARGEITEMDEFINITION -> "ChargeItemDefinition";
				CITATION -> "Citation";
				CLAIM -> "Claim";
				CLAIMRESPONSE -> "ClaimResponse";
				CLINICALIMPRESSION -> "ClinicalImpression";
				CLINICALUSEISSUE -> "ClinicalUseIssue";
				CODESYSTEM -> "CodeSystem";
				COMMUNICATION -> "Communication";
				COMMUNICATIONREQUEST -> "CommunicationRequest";
				COMPARTMENTDEFINITION -> "CompartmentDefinition";
				COMPOSITION -> "Composition";
				CONCEPTMAP -> "ConceptMap";
				CONDITION -> "Condition";
				CONDITIONDEFINITION -> "ConditionDefinition";
				CONSENT -> "Consent";
				CONTRACT -> "Contract";
				COVERAGE -> "Coverage";
				COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest";
				COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse";
				DETECTEDISSUE -> "DetectedIssue";
				DEVICE -> "Device";
				DEVICEDEFINITION -> "DeviceDefinition";
				DEVICEMETRIC -> "DeviceMetric";
				DEVICEREQUEST -> "DeviceRequest";
				DEVICEUSESTATEMENT -> "DeviceUseStatement";
				DIAGNOSTICREPORT -> "DiagnosticReport";
				DOCUMENTMANIFEST -> "DocumentManifest";
				DOCUMENTREFERENCE -> "DocumentReference";
				DOMAINRESOURCE -> "DomainResource";
				ENCOUNTER -> "Encounter";
				ENDPOINT -> "Endpoint";
				ENROLLMENTREQUEST -> "EnrollmentRequest";
				ENROLLMENTRESPONSE -> "EnrollmentResponse";
				EPISODEOFCARE -> "EpisodeOfCare";
				EVENTDEFINITION -> "EventDefinition";
				EVIDENCE -> "Evidence";
				EVIDENCEREPORT -> "EvidenceReport";
				EVIDENCEVARIABLE -> "EvidenceVariable";
				EXAMPLESCENARIO -> "ExampleScenario";
				EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit";
				FAMILYMEMBERHISTORY -> "FamilyMemberHistory";
				FLAG -> "Flag";
				GOAL -> "Goal";
				GRAPHDEFINITION -> "GraphDefinition";
				GROUP -> "Group";
				GUIDANCERESPONSE -> "GuidanceResponse";
				HEALTHCARESERVICE -> "HealthcareService";
				IMAGINGSTUDY -> "ImagingStudy";
				IMMUNIZATION -> "Immunization";
				IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation";
				IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation";
				IMPLEMENTATIONGUIDE -> "ImplementationGuide";
				INGREDIENT -> "Ingredient";
				INSURANCEPLAN -> "InsurancePlan";
				INVOICE -> "Invoice";
				LIBRARY -> "Library";
				LINKAGE -> "Linkage";
				LIST -> "List";
				LOCATION -> "Location";
				MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition";
				MEASURE -> "Measure";
				MEASUREREPORT -> "MeasureReport";
				MEDICATION -> "Medication";
				MEDICATIONADMINISTRATION -> "MedicationAdministration";
				MEDICATIONDISPENSE -> "MedicationDispense";
				MEDICATIONKNOWLEDGE -> "MedicationKnowledge";
				MEDICATIONREQUEST -> "MedicationRequest";
				MEDICATIONUSAGE -> "MedicationUsage";
				MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition";
				MESSAGEDEFINITION -> "MessageDefinition";
				MESSAGEHEADER -> "MessageHeader";
				MOLECULARSEQUENCE -> "MolecularSequence";
				NAMINGSYSTEM -> "NamingSystem";
				NUTRITIONINTAKE -> "NutritionIntake";
				NUTRITIONORDER -> "NutritionOrder";
				NUTRITIONPRODUCT -> "NutritionProduct";
				OBSERVATION -> "Observation";
				OBSERVATIONDEFINITION -> "ObservationDefinition";
				OPERATIONDEFINITION -> "OperationDefinition";
				OPERATIONOUTCOME -> "OperationOutcome";
				ORGANIZATION -> "Organization";
				ORGANIZATIONAFFILIATION -> "OrganizationAffiliation";
				PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition";
				PARAMETERS -> "Parameters";
				PATIENT -> "Patient";
				PAYMENTNOTICE -> "PaymentNotice";
				PAYMENTRECONCILIATION -> "PaymentReconciliation";
				PERMISSION -> "Permission";
				PERSON -> "Person";
				PLANDEFINITION -> "PlanDefinition";
				PRACTITIONER -> "Practitioner";
				PRACTITIONERROLE -> "PractitionerRole";
				PROCEDURE -> "Procedure";
				PROVENANCE -> "Provenance";
				QUESTIONNAIRE -> "Questionnaire";
				QUESTIONNAIRERESPONSE -> "QuestionnaireResponse";
				REGULATEDAUTHORIZATION -> "RegulatedAuthorization";
				RELATEDPERSON -> "RelatedPerson";
				REQUESTGROUP -> "RequestGroup";
				RESEARCHSTUDY -> "ResearchStudy";
				RESEARCHSUBJECT -> "ResearchSubject";
				RESOURCE -> "Resource";
				RISKASSESSMENT -> "RiskAssessment";
				SCHEDULE -> "Schedule";
				SEARCHPARAMETER -> "SearchParameter";
				SERVICEREQUEST -> "ServiceRequest";
				SLOT -> "Slot";
				SPECIMEN -> "Specimen";
				SPECIMENDEFINITION -> "SpecimenDefinition";
				STRUCTUREDEFINITION -> "StructureDefinition";
				STRUCTUREMAP -> "StructureMap";
				SUBSCRIPTION -> "Subscription";
				SUBSCRIPTIONSTATUS -> "SubscriptionStatus";
				SUBSCRIPTIONTOPIC -> "SubscriptionTopic";
				SUBSTANCE -> "Substance";
				SUBSTANCEDEFINITION -> "SubstanceDefinition";
				SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid";
				SUBSTANCEPOLYMER -> "SubstancePolymer";
				SUBSTANCEPROTEIN -> "SubstanceProtein";
				SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation";
				SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial";
				SUPPLYDELIVERY -> "SupplyDelivery";
				SUPPLYREQUEST -> "SupplyRequest";
				TASK -> "Task";
				TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities";
				TESTREPORT -> "TestReport";
				TESTSCRIPT -> "TestScript";
				VALUESET -> "ValueSet";
				VERIFICATIONRESULT -> "VerificationResult";
				VISIONPRESCRIPTION -> "VisionPrescription";
				TYPE -> "Type";
				ANY -> "Any";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): FHIRAllTypes? {
				if (codeString == null || "" == codeString) return null
				if ("Address" == codeString) return ADDRESS
				if ("Age" == codeString) return AGE
				if ("Annotation" == codeString) return ANNOTATION
				if ("Attachment" == codeString) return ATTACHMENT
				if ("BackboneElement" == codeString) return BACKBONEELEMENT
				if ("BackboneType" == codeString) return BACKBONETYPE
				if ("Base" == codeString) return BASE
				if ("CodeableConcept" == codeString) return CODEABLECONCEPT
				if ("CodeableReference" == codeString) return CODEABLEREFERENCE
				if ("Coding" == codeString) return CODING
				if ("ContactDetail" == codeString) return CONTACTDETAIL
				if ("ContactPoint" == codeString) return CONTACTPOINT
				if ("Contributor" == codeString) return CONTRIBUTOR
				if ("Count" == codeString) return COUNT
				if ("DataRequirement" == codeString) return DATAREQUIREMENT
				if ("DataType" == codeString) return DATATYPE
				if ("Distance" == codeString) return DISTANCE
				if ("Dosage" == codeString) return DOSAGE
				if ("Duration" == codeString) return DURATION
				if ("Element" == codeString) return ELEMENT
				if ("ElementDefinition" == codeString) return ELEMENTDEFINITION
				if ("Expression" == codeString) return EXPRESSION
				if ("Extension" == codeString) return EXTENSION
				if ("HumanName" == codeString) return HUMANNAME
				if ("Identifier" == codeString) return IDENTIFIER
				if ("MarketingStatus" == codeString) return MARKETINGSTATUS
				if ("Meta" == codeString) return META
				if ("Money" == codeString) return MONEY
				if ("MoneyQuantity" == codeString) return MONEYQUANTITY
				if ("Narrative" == codeString) return NARRATIVE
				if ("OrderedDistribution" == codeString) return ORDEREDDISTRIBUTION
				if ("ParameterDefinition" == codeString) return PARAMETERDEFINITION
				if ("Period" == codeString) return PERIOD
				if ("Population" == codeString) return POPULATION
				if ("PrimitiveType" == codeString) return PRIMITIVETYPE
				if ("ProdCharacteristic" == codeString) return PRODCHARACTERISTIC
				if ("ProductShelfLife" == codeString) return PRODUCTSHELFLIFE
				if ("Quantity" == codeString) return QUANTITY
				if ("Range" == codeString) return RANGE
				if ("Ratio" == codeString) return RATIO
				if ("Reference" == codeString) return REFERENCE
				if ("RelatedArtifact" == codeString) return RELATEDARTIFACT
				if ("SampledData" == codeString) return SAMPLEDDATA
				if ("Signature" == codeString) return SIGNATURE
				if ("SimpleQuantity" == codeString) return SIMPLEQUANTITY
				if ("Statistic" == codeString) return STATISTIC
				if ("Timing" == codeString) return TIMING
				if ("TriggerDefinition" == codeString) return TRIGGERDEFINITION
				if ("UsageContext" == codeString) return USAGECONTEXT
				if ("base64Binary" == codeString) return BASE64BINARY
				if ("boolean" == codeString) return BOOLEAN
				if ("canonical" == codeString) return CANONICAL
				if ("code" == codeString) return CODE
				if ("date" == codeString) return DATE
				if ("dateTime" == codeString) return DATETIME
				if ("decimal" == codeString) return DECIMAL
				if ("id" == codeString) return ID
				if ("instant" == codeString) return INSTANT
				if ("integer" == codeString) return INTEGER
				if ("integer64" == codeString) return INTEGER64
				if ("markdown" == codeString) return MARKDOWN
				if ("oid" == codeString) return OID
				if ("positiveInt" == codeString) return POSITIVEINT
				if ("string" == codeString) return STRING
				if ("time" == codeString) return TIME
				if ("unsignedInt" == codeString) return UNSIGNEDINT
				if ("uri" == codeString) return URI
				if ("url" == codeString) return URL
				if ("uuid" == codeString) return UUID
				if ("xhtml" == codeString) return XHTML
				if ("Account" == codeString) return ACCOUNT
				if ("ActivityDefinition" == codeString) return ACTIVITYDEFINITION
				if ("AdministrableProductDefinition" == codeString) return ADMINISTRABLEPRODUCTDEFINITION
				if ("AdverseEvent" == codeString) return ADVERSEEVENT
				if ("AllergyIntolerance" == codeString) return ALLERGYINTOLERANCE
				if ("Appointment" == codeString) return APPOINTMENT
				if ("AppointmentResponse" == codeString) return APPOINTMENTRESPONSE
				if ("AuditEvent" == codeString) return AUDITEVENT
				if ("Basic" == codeString) return BASIC
				if ("Binary" == codeString) return BINARY
				if ("BiologicallyDerivedProduct" == codeString) return BIOLOGICALLYDERIVEDPRODUCT
				if ("BodyStructure" == codeString) return BODYSTRUCTURE
				if ("Bundle" == codeString) return BUNDLE
				if ("CapabilityStatement" == codeString) return CAPABILITYSTATEMENT
				if ("CapabilityStatement2" == codeString) return CAPABILITYSTATEMENT2
				if ("CarePlan" == codeString) return CAREPLAN
				if ("CareTeam" == codeString) return CARETEAM
				if ("CatalogEntry" == codeString) return CATALOGENTRY
				if ("ChargeItem" == codeString) return CHARGEITEM
				if ("ChargeItemDefinition" == codeString) return CHARGEITEMDEFINITION
				if ("Citation" == codeString) return CITATION
				if ("Claim" == codeString) return CLAIM
				if ("ClaimResponse" == codeString) return CLAIMRESPONSE
				if ("ClinicalImpression" == codeString) return CLINICALIMPRESSION
				if ("ClinicalUseIssue" == codeString) return CLINICALUSEISSUE
				if ("CodeSystem" == codeString) return CODESYSTEM
				if ("Communication" == codeString) return COMMUNICATION
				if ("CommunicationRequest" == codeString) return COMMUNICATIONREQUEST
				if ("CompartmentDefinition" == codeString) return COMPARTMENTDEFINITION
				if ("Composition" == codeString) return COMPOSITION
				if ("ConceptMap" == codeString) return CONCEPTMAP
				if ("Condition" == codeString) return CONDITION
				if ("ConditionDefinition" == codeString) return CONDITIONDEFINITION
				if ("Consent" == codeString) return CONSENT
				if ("Contract" == codeString) return CONTRACT
				if ("Coverage" == codeString) return COVERAGE
				if ("CoverageEligibilityRequest" == codeString) return COVERAGEELIGIBILITYREQUEST
				if ("CoverageEligibilityResponse" == codeString) return COVERAGEELIGIBILITYRESPONSE
				if ("DetectedIssue" == codeString) return DETECTEDISSUE
				if ("Device" == codeString) return DEVICE
				if ("DeviceDefinition" == codeString) return DEVICEDEFINITION
				if ("DeviceMetric" == codeString) return DEVICEMETRIC
				if ("DeviceRequest" == codeString) return DEVICEREQUEST
				if ("DeviceUseStatement" == codeString) return DEVICEUSESTATEMENT
				if ("DiagnosticReport" == codeString) return DIAGNOSTICREPORT
				if ("DocumentManifest" == codeString) return DOCUMENTMANIFEST
				if ("DocumentReference" == codeString) return DOCUMENTREFERENCE
				if ("DomainResource" == codeString) return DOMAINRESOURCE
				if ("Encounter" == codeString) return ENCOUNTER
				if ("Endpoint" == codeString) return ENDPOINT
				if ("EnrollmentRequest" == codeString) return ENROLLMENTREQUEST
				if ("EnrollmentResponse" == codeString) return ENROLLMENTRESPONSE
				if ("EpisodeOfCare" == codeString) return EPISODEOFCARE
				if ("EventDefinition" == codeString) return EVENTDEFINITION
				if ("Evidence" == codeString) return EVIDENCE
				if ("EvidenceReport" == codeString) return EVIDENCEREPORT
				if ("EvidenceVariable" == codeString) return EVIDENCEVARIABLE
				if ("ExampleScenario" == codeString) return EXAMPLESCENARIO
				if ("ExplanationOfBenefit" == codeString) return EXPLANATIONOFBENEFIT
				if ("FamilyMemberHistory" == codeString) return FAMILYMEMBERHISTORY
				if ("Flag" == codeString) return FLAG
				if ("Goal" == codeString) return GOAL
				if ("GraphDefinition" == codeString) return GRAPHDEFINITION
				if ("Group" == codeString) return GROUP
				if ("GuidanceResponse" == codeString) return GUIDANCERESPONSE
				if ("HealthcareService" == codeString) return HEALTHCARESERVICE
				if ("ImagingStudy" == codeString) return IMAGINGSTUDY
				if ("Immunization" == codeString) return IMMUNIZATION
				if ("ImmunizationEvaluation" == codeString) return IMMUNIZATIONEVALUATION
				if ("ImmunizationRecommendation" == codeString) return IMMUNIZATIONRECOMMENDATION
				if ("ImplementationGuide" == codeString) return IMPLEMENTATIONGUIDE
				if ("Ingredient" == codeString) return INGREDIENT
				if ("InsurancePlan" == codeString) return INSURANCEPLAN
				if ("Invoice" == codeString) return INVOICE
				if ("Library" == codeString) return LIBRARY
				if ("Linkage" == codeString) return LINKAGE
				if ("List" == codeString) return LIST
				if ("Location" == codeString) return LOCATION
				if ("ManufacturedItemDefinition" == codeString) return MANUFACTUREDITEMDEFINITION
				if ("Measure" == codeString) return MEASURE
				if ("MeasureReport" == codeString) return MEASUREREPORT
				if ("Medication" == codeString) return MEDICATION
				if ("MedicationAdministration" == codeString) return MEDICATIONADMINISTRATION
				if ("MedicationDispense" == codeString) return MEDICATIONDISPENSE
				if ("MedicationKnowledge" == codeString) return MEDICATIONKNOWLEDGE
				if ("MedicationRequest" == codeString) return MEDICATIONREQUEST
				if ("MedicationUsage" == codeString) return MEDICATIONUSAGE
				if ("MedicinalProductDefinition" == codeString) return MEDICINALPRODUCTDEFINITION
				if ("MessageDefinition" == codeString) return MESSAGEDEFINITION
				if ("MessageHeader" == codeString) return MESSAGEHEADER
				if ("MolecularSequence" == codeString) return MOLECULARSEQUENCE
				if ("NamingSystem" == codeString) return NAMINGSYSTEM
				if ("NutritionIntake" == codeString) return NUTRITIONINTAKE
				if ("NutritionOrder" == codeString) return NUTRITIONORDER
				if ("NutritionProduct" == codeString) return NUTRITIONPRODUCT
				if ("Observation" == codeString) return OBSERVATION
				if ("ObservationDefinition" == codeString) return OBSERVATIONDEFINITION
				if ("OperationDefinition" == codeString) return OPERATIONDEFINITION
				if ("OperationOutcome" == codeString) return OPERATIONOUTCOME
				if ("Organization" == codeString) return ORGANIZATION
				if ("OrganizationAffiliation" == codeString) return ORGANIZATIONAFFILIATION
				if ("PackagedProductDefinition" == codeString) return PACKAGEDPRODUCTDEFINITION
				if ("Parameters" == codeString) return PARAMETERS
				if ("Patient" == codeString) return PATIENT
				if ("PaymentNotice" == codeString) return PAYMENTNOTICE
				if ("PaymentReconciliation" == codeString) return PAYMENTRECONCILIATION
				if ("Permission" == codeString) return PERMISSION
				if ("Person" == codeString) return PERSON
				if ("PlanDefinition" == codeString) return PLANDEFINITION
				if ("Practitioner" == codeString) return PRACTITIONER
				if ("PractitionerRole" == codeString) return PRACTITIONERROLE
				if ("Procedure" == codeString) return PROCEDURE
				if ("Provenance" == codeString) return PROVENANCE
				if ("Questionnaire" == codeString) return QUESTIONNAIRE
				if ("QuestionnaireResponse" == codeString) return QUESTIONNAIRERESPONSE
				if ("RegulatedAuthorization" == codeString) return REGULATEDAUTHORIZATION
				if ("RelatedPerson" == codeString) return RELATEDPERSON
				if ("RequestGroup" == codeString) return REQUESTGROUP
				if ("ResearchStudy" == codeString) return RESEARCHSTUDY
				if ("ResearchSubject" == codeString) return RESEARCHSUBJECT
				if ("Resource" == codeString) return RESOURCE
				if ("RiskAssessment" == codeString) return RISKASSESSMENT
				if ("Schedule" == codeString) return SCHEDULE
				if ("SearchParameter" == codeString) return SEARCHPARAMETER
				if ("ServiceRequest" == codeString) return SERVICEREQUEST
				if ("Slot" == codeString) return SLOT
				if ("Specimen" == codeString) return SPECIMEN
				if ("SpecimenDefinition" == codeString) return SPECIMENDEFINITION
				if ("StructureDefinition" == codeString) return STRUCTUREDEFINITION
				if ("StructureMap" == codeString) return STRUCTUREMAP
				if ("Subscription" == codeString) return SUBSCRIPTION
				if ("SubscriptionStatus" == codeString) return SUBSCRIPTIONSTATUS
				if ("SubscriptionTopic" == codeString) return SUBSCRIPTIONTOPIC
				if ("Substance" == codeString) return SUBSTANCE
				if ("SubstanceDefinition" == codeString) return SUBSTANCEDEFINITION
				if ("SubstanceNucleicAcid" == codeString) return SUBSTANCENUCLEICACID
				if ("SubstancePolymer" == codeString) return SUBSTANCEPOLYMER
				if ("SubstanceProtein" == codeString) return SUBSTANCEPROTEIN
				if ("SubstanceReferenceInformation" == codeString) return SUBSTANCEREFERENCEINFORMATION
				if ("SubstanceSourceMaterial" == codeString) return SUBSTANCESOURCEMATERIAL
				if ("SupplyDelivery" == codeString) return SUPPLYDELIVERY
				if ("SupplyRequest" == codeString) return SUPPLYREQUEST
				if ("Task" == codeString) return TASK
				if ("TerminologyCapabilities" == codeString) return TERMINOLOGYCAPABILITIES
				if ("TestReport" == codeString) return TESTREPORT
				if ("TestScript" == codeString) return TESTSCRIPT
				if ("ValueSet" == codeString) return VALUESET
				if ("VerificationResult" == codeString) return VERIFICATIONRESULT
				if ("VisionPrescription" == codeString) return VISIONPRESCRIPTION
				if ("Type" == codeString) return TYPE
				if ("Any" == codeString) return ANY
				throw FHIRException("Unknown FHIRAllTypes code '"$codeString"'")
			}
		}
	}

	class FHIRAllTypesEnumFactory : EnumFactory<FHIRAllTypes> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): FHIRAllTypes? {
			if (codeString == null || "" == codeString) return null
			if ("Address" == codeString) return FHIRAllTypes.ADDRESS
			if ("Age" == codeString) return FHIRAllTypes.AGE
			if ("Annotation" == codeString) return FHIRAllTypes.ANNOTATION
			if ("Attachment" == codeString) return FHIRAllTypes.ATTACHMENT
			if ("BackboneElement" == codeString) return FHIRAllTypes.BACKBONEELEMENT
			if ("BackboneType" == codeString) return FHIRAllTypes.BACKBONETYPE
			if ("Base" == codeString) return FHIRAllTypes.BASE
			if ("CodeableConcept" == codeString) return FHIRAllTypes.CODEABLECONCEPT
			if ("CodeableReference" == codeString) return FHIRAllTypes.CODEABLEREFERENCE
			if ("Coding" == codeString) return FHIRAllTypes.CODING
			if ("ContactDetail" == codeString) return FHIRAllTypes.CONTACTDETAIL
			if ("ContactPoint" == codeString) return FHIRAllTypes.CONTACTPOINT
			if ("Contributor" == codeString) return FHIRAllTypes.CONTRIBUTOR
			if ("Count" == codeString) return FHIRAllTypes.COUNT
			if ("DataRequirement" == codeString) return FHIRAllTypes.DATAREQUIREMENT
			if ("DataType" == codeString) return FHIRAllTypes.DATATYPE
			if ("Distance" == codeString) return FHIRAllTypes.DISTANCE
			if ("Dosage" == codeString) return FHIRAllTypes.DOSAGE
			if ("Duration" == codeString) return FHIRAllTypes.DURATION
			if ("Element" == codeString) return FHIRAllTypes.ELEMENT
			if ("ElementDefinition" == codeString) return FHIRAllTypes.ELEMENTDEFINITION
			if ("Expression" == codeString) return FHIRAllTypes.EXPRESSION
			if ("Extension" == codeString) return FHIRAllTypes.EXTENSION
			if ("HumanName" == codeString) return FHIRAllTypes.HUMANNAME
			if ("Identifier" == codeString) return FHIRAllTypes.IDENTIFIER
			if ("MarketingStatus" == codeString) return FHIRAllTypes.MARKETINGSTATUS
			if ("Meta" == codeString) return FHIRAllTypes.META
			if ("Money" == codeString) return FHIRAllTypes.MONEY
			if ("MoneyQuantity" == codeString) return FHIRAllTypes.MONEYQUANTITY
			if ("Narrative" == codeString) return FHIRAllTypes.NARRATIVE
			if ("OrderedDistribution" == codeString) return FHIRAllTypes.ORDEREDDISTRIBUTION
			if ("ParameterDefinition" == codeString) return FHIRAllTypes.PARAMETERDEFINITION
			if ("Period" == codeString) return FHIRAllTypes.PERIOD
			if ("Population" == codeString) return FHIRAllTypes.POPULATION
			if ("PrimitiveType" == codeString) return FHIRAllTypes.PRIMITIVETYPE
			if ("ProdCharacteristic" == codeString) return FHIRAllTypes.PRODCHARACTERISTIC
			if ("ProductShelfLife" == codeString) return FHIRAllTypes.PRODUCTSHELFLIFE
			if ("Quantity" == codeString) return FHIRAllTypes.QUANTITY
			if ("Range" == codeString) return FHIRAllTypes.RANGE
			if ("Ratio" == codeString) return FHIRAllTypes.RATIO
			if ("Reference" == codeString) return FHIRAllTypes.REFERENCE
			if ("RelatedArtifact" == codeString) return FHIRAllTypes.RELATEDARTIFACT
			if ("SampledData" == codeString) return FHIRAllTypes.SAMPLEDDATA
			if ("Signature" == codeString) return FHIRAllTypes.SIGNATURE
			if ("SimpleQuantity" == codeString) return FHIRAllTypes.SIMPLEQUANTITY
			if ("Statistic" == codeString) return FHIRAllTypes.STATISTIC
			if ("Timing" == codeString) return FHIRAllTypes.TIMING
			if ("TriggerDefinition" == codeString) return FHIRAllTypes.TRIGGERDEFINITION
			if ("UsageContext" == codeString) return FHIRAllTypes.USAGECONTEXT
			if ("base64Binary" == codeString) return FHIRAllTypes.BASE64BINARY
			if ("boolean" == codeString) return FHIRAllTypes.BOOLEAN
			if ("canonical" == codeString) return FHIRAllTypes.CANONICAL
			if ("code" == codeString) return FHIRAllTypes.CODE
			if ("date" == codeString) return FHIRAllTypes.DATE
			if ("dateTime" == codeString) return FHIRAllTypes.DATETIME
			if ("decimal" == codeString) return FHIRAllTypes.DECIMAL
			if ("id" == codeString) return FHIRAllTypes.ID
			if ("instant" == codeString) return FHIRAllTypes.INSTANT
			if ("integer" == codeString) return FHIRAllTypes.INTEGER
			if ("integer64" == codeString) return FHIRAllTypes.INTEGER64
			if ("markdown" == codeString) return FHIRAllTypes.MARKDOWN
			if ("oid" == codeString) return FHIRAllTypes.OID
			if ("positiveInt" == codeString) return FHIRAllTypes.POSITIVEINT
			if ("string" == codeString) return FHIRAllTypes.STRING
			if ("time" == codeString) return FHIRAllTypes.TIME
			if ("unsignedInt" == codeString) return FHIRAllTypes.UNSIGNEDINT
			if ("uri" == codeString) return FHIRAllTypes.URI
			if ("url" == codeString) return FHIRAllTypes.URL
			if ("uuid" == codeString) return FHIRAllTypes.UUID
			if ("xhtml" == codeString) return FHIRAllTypes.XHTML
			if ("Account" == codeString) return FHIRAllTypes.ACCOUNT
			if ("ActivityDefinition" == codeString) return FHIRAllTypes.ACTIVITYDEFINITION
			if ("AdministrableProductDefinition" == codeString) return FHIRAllTypes.ADMINISTRABLEPRODUCTDEFINITION
			if ("AdverseEvent" == codeString) return FHIRAllTypes.ADVERSEEVENT
			if ("AllergyIntolerance" == codeString) return FHIRAllTypes.ALLERGYINTOLERANCE
			if ("Appointment" == codeString) return FHIRAllTypes.APPOINTMENT
			if ("AppointmentResponse" == codeString) return FHIRAllTypes.APPOINTMENTRESPONSE
			if ("AuditEvent" == codeString) return FHIRAllTypes.AUDITEVENT
			if ("Basic" == codeString) return FHIRAllTypes.BASIC
			if ("Binary" == codeString) return FHIRAllTypes.BINARY
			if ("BiologicallyDerivedProduct" == codeString) return FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT
			if ("BodyStructure" == codeString) return FHIRAllTypes.BODYSTRUCTURE
			if ("Bundle" == codeString) return FHIRAllTypes.BUNDLE
			if ("CapabilityStatement" == codeString) return FHIRAllTypes.CAPABILITYSTATEMENT
			if ("CapabilityStatement2" == codeString) return FHIRAllTypes.CAPABILITYSTATEMENT2
			if ("CarePlan" == codeString) return FHIRAllTypes.CAREPLAN
			if ("CareTeam" == codeString) return FHIRAllTypes.CARETEAM
			if ("CatalogEntry" == codeString) return FHIRAllTypes.CATALOGENTRY
			if ("ChargeItem" == codeString) return FHIRAllTypes.CHARGEITEM
			if ("ChargeItemDefinition" == codeString) return FHIRAllTypes.CHARGEITEMDEFINITION
			if ("Citation" == codeString) return FHIRAllTypes.CITATION
			if ("Claim" == codeString) return FHIRAllTypes.CLAIM
			if ("ClaimResponse" == codeString) return FHIRAllTypes.CLAIMRESPONSE
			if ("ClinicalImpression" == codeString) return FHIRAllTypes.CLINICALIMPRESSION
			if ("ClinicalUseIssue" == codeString) return FHIRAllTypes.CLINICALUSEISSUE
			if ("CodeSystem" == codeString) return FHIRAllTypes.CODESYSTEM
			if ("Communication" == codeString) return FHIRAllTypes.COMMUNICATION
			if ("CommunicationRequest" == codeString) return FHIRAllTypes.COMMUNICATIONREQUEST
			if ("CompartmentDefinition" == codeString) return FHIRAllTypes.COMPARTMENTDEFINITION
			if ("Composition" == codeString) return FHIRAllTypes.COMPOSITION
			if ("ConceptMap" == codeString) return FHIRAllTypes.CONCEPTMAP
			if ("Condition" == codeString) return FHIRAllTypes.CONDITION
			if ("ConditionDefinition" == codeString) return FHIRAllTypes.CONDITIONDEFINITION
			if ("Consent" == codeString) return FHIRAllTypes.CONSENT
			if ("Contract" == codeString) return FHIRAllTypes.CONTRACT
			if ("Coverage" == codeString) return FHIRAllTypes.COVERAGE
			if ("CoverageEligibilityRequest" == codeString) return FHIRAllTypes.COVERAGEELIGIBILITYREQUEST
			if ("CoverageEligibilityResponse" == codeString) return FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE
			if ("DetectedIssue" == codeString) return FHIRAllTypes.DETECTEDISSUE
			if ("Device" == codeString) return FHIRAllTypes.DEVICE
			if ("DeviceDefinition" == codeString) return FHIRAllTypes.DEVICEDEFINITION
			if ("DeviceMetric" == codeString) return FHIRAllTypes.DEVICEMETRIC
			if ("DeviceRequest" == codeString) return FHIRAllTypes.DEVICEREQUEST
			if ("DeviceUseStatement" == codeString) return FHIRAllTypes.DEVICEUSESTATEMENT
			if ("DiagnosticReport" == codeString) return FHIRAllTypes.DIAGNOSTICREPORT
			if ("DocumentManifest" == codeString) return FHIRAllTypes.DOCUMENTMANIFEST
			if ("DocumentReference" == codeString) return FHIRAllTypes.DOCUMENTREFERENCE
			if ("DomainResource" == codeString) return FHIRAllTypes.DOMAINRESOURCE
			if ("Encounter" == codeString) return FHIRAllTypes.ENCOUNTER
			if ("Endpoint" == codeString) return FHIRAllTypes.ENDPOINT
			if ("EnrollmentRequest" == codeString) return FHIRAllTypes.ENROLLMENTREQUEST
			if ("EnrollmentResponse" == codeString) return FHIRAllTypes.ENROLLMENTRESPONSE
			if ("EpisodeOfCare" == codeString) return FHIRAllTypes.EPISODEOFCARE
			if ("EventDefinition" == codeString) return FHIRAllTypes.EVENTDEFINITION
			if ("Evidence" == codeString) return FHIRAllTypes.EVIDENCE
			if ("EvidenceReport" == codeString) return FHIRAllTypes.EVIDENCEREPORT
			if ("EvidenceVariable" == codeString) return FHIRAllTypes.EVIDENCEVARIABLE
			if ("ExampleScenario" == codeString) return FHIRAllTypes.EXAMPLESCENARIO
			if ("ExplanationOfBenefit" == codeString) return FHIRAllTypes.EXPLANATIONOFBENEFIT
			if ("FamilyMemberHistory" == codeString) return FHIRAllTypes.FAMILYMEMBERHISTORY
			if ("Flag" == codeString) return FHIRAllTypes.FLAG
			if ("Goal" == codeString) return FHIRAllTypes.GOAL
			if ("GraphDefinition" == codeString) return FHIRAllTypes.GRAPHDEFINITION
			if ("Group" == codeString) return FHIRAllTypes.GROUP
			if ("GuidanceResponse" == codeString) return FHIRAllTypes.GUIDANCERESPONSE
			if ("HealthcareService" == codeString) return FHIRAllTypes.HEALTHCARESERVICE
			if ("ImagingStudy" == codeString) return FHIRAllTypes.IMAGINGSTUDY
			if ("Immunization" == codeString) return FHIRAllTypes.IMMUNIZATION
			if ("ImmunizationEvaluation" == codeString) return FHIRAllTypes.IMMUNIZATIONEVALUATION
			if ("ImmunizationRecommendation" == codeString) return FHIRAllTypes.IMMUNIZATIONRECOMMENDATION
			if ("ImplementationGuide" == codeString) return FHIRAllTypes.IMPLEMENTATIONGUIDE
			if ("Ingredient" == codeString) return FHIRAllTypes.INGREDIENT
			if ("InsurancePlan" == codeString) return FHIRAllTypes.INSURANCEPLAN
			if ("Invoice" == codeString) return FHIRAllTypes.INVOICE
			if ("Library" == codeString) return FHIRAllTypes.LIBRARY
			if ("Linkage" == codeString) return FHIRAllTypes.LINKAGE
			if ("List" == codeString) return FHIRAllTypes.LIST
			if ("Location" == codeString) return FHIRAllTypes.LOCATION
			if ("ManufacturedItemDefinition" == codeString) return FHIRAllTypes.MANUFACTUREDITEMDEFINITION
			if ("Measure" == codeString) return FHIRAllTypes.MEASURE
			if ("MeasureReport" == codeString) return FHIRAllTypes.MEASUREREPORT
			if ("Medication" == codeString) return FHIRAllTypes.MEDICATION
			if ("MedicationAdministration" == codeString) return FHIRAllTypes.MEDICATIONADMINISTRATION
			if ("MedicationDispense" == codeString) return FHIRAllTypes.MEDICATIONDISPENSE
			if ("MedicationKnowledge" == codeString) return FHIRAllTypes.MEDICATIONKNOWLEDGE
			if ("MedicationRequest" == codeString) return FHIRAllTypes.MEDICATIONREQUEST
			if ("MedicationUsage" == codeString) return FHIRAllTypes.MEDICATIONUSAGE
			if ("MedicinalProductDefinition" == codeString) return FHIRAllTypes.MEDICINALPRODUCTDEFINITION
			if ("MessageDefinition" == codeString) return FHIRAllTypes.MESSAGEDEFINITION
			if ("MessageHeader" == codeString) return FHIRAllTypes.MESSAGEHEADER
			if ("MolecularSequence" == codeString) return FHIRAllTypes.MOLECULARSEQUENCE
			if ("NamingSystem" == codeString) return FHIRAllTypes.NAMINGSYSTEM
			if ("NutritionIntake" == codeString) return FHIRAllTypes.NUTRITIONINTAKE
			if ("NutritionOrder" == codeString) return FHIRAllTypes.NUTRITIONORDER
			if ("NutritionProduct" == codeString) return FHIRAllTypes.NUTRITIONPRODUCT
			if ("Observation" == codeString) return FHIRAllTypes.OBSERVATION
			if ("ObservationDefinition" == codeString) return FHIRAllTypes.OBSERVATIONDEFINITION
			if ("OperationDefinition" == codeString) return FHIRAllTypes.OPERATIONDEFINITION
			if ("OperationOutcome" == codeString) return FHIRAllTypes.OPERATIONOUTCOME
			if ("Organization" == codeString) return FHIRAllTypes.ORGANIZATION
			if ("OrganizationAffiliation" == codeString) return FHIRAllTypes.ORGANIZATIONAFFILIATION
			if ("PackagedProductDefinition" == codeString) return FHIRAllTypes.PACKAGEDPRODUCTDEFINITION
			if ("Parameters" == codeString) return FHIRAllTypes.PARAMETERS
			if ("Patient" == codeString) return FHIRAllTypes.PATIENT
			if ("PaymentNotice" == codeString) return FHIRAllTypes.PAYMENTNOTICE
			if ("PaymentReconciliation" == codeString) return FHIRAllTypes.PAYMENTRECONCILIATION
			if ("Permission" == codeString) return FHIRAllTypes.PERMISSION
			if ("Person" == codeString) return FHIRAllTypes.PERSON
			if ("PlanDefinition" == codeString) return FHIRAllTypes.PLANDEFINITION
			if ("Practitioner" == codeString) return FHIRAllTypes.PRACTITIONER
			if ("PractitionerRole" == codeString) return FHIRAllTypes.PRACTITIONERROLE
			if ("Procedure" == codeString) return FHIRAllTypes.PROCEDURE
			if ("Provenance" == codeString) return FHIRAllTypes.PROVENANCE
			if ("Questionnaire" == codeString) return FHIRAllTypes.QUESTIONNAIRE
			if ("QuestionnaireResponse" == codeString) return FHIRAllTypes.QUESTIONNAIRERESPONSE
			if ("RegulatedAuthorization" == codeString) return FHIRAllTypes.REGULATEDAUTHORIZATION
			if ("RelatedPerson" == codeString) return FHIRAllTypes.RELATEDPERSON
			if ("RequestGroup" == codeString) return FHIRAllTypes.REQUESTGROUP
			if ("ResearchStudy" == codeString) return FHIRAllTypes.RESEARCHSTUDY
			if ("ResearchSubject" == codeString) return FHIRAllTypes.RESEARCHSUBJECT
			if ("Resource" == codeString) return FHIRAllTypes.RESOURCE
			if ("RiskAssessment" == codeString) return FHIRAllTypes.RISKASSESSMENT
			if ("Schedule" == codeString) return FHIRAllTypes.SCHEDULE
			if ("SearchParameter" == codeString) return FHIRAllTypes.SEARCHPARAMETER
			if ("ServiceRequest" == codeString) return FHIRAllTypes.SERVICEREQUEST
			if ("Slot" == codeString) return FHIRAllTypes.SLOT
			if ("Specimen" == codeString) return FHIRAllTypes.SPECIMEN
			if ("SpecimenDefinition" == codeString) return FHIRAllTypes.SPECIMENDEFINITION
			if ("StructureDefinition" == codeString) return FHIRAllTypes.STRUCTUREDEFINITION
			if ("StructureMap" == codeString) return FHIRAllTypes.STRUCTUREMAP
			if ("Subscription" == codeString) return FHIRAllTypes.SUBSCRIPTION
			if ("SubscriptionStatus" == codeString) return FHIRAllTypes.SUBSCRIPTIONSTATUS
			if ("SubscriptionTopic" == codeString) return FHIRAllTypes.SUBSCRIPTIONTOPIC
			if ("Substance" == codeString) return FHIRAllTypes.SUBSTANCE
			if ("SubstanceDefinition" == codeString) return FHIRAllTypes.SUBSTANCEDEFINITION
			if ("SubstanceNucleicAcid" == codeString) return FHIRAllTypes.SUBSTANCENUCLEICACID
			if ("SubstancePolymer" == codeString) return FHIRAllTypes.SUBSTANCEPOLYMER
			if ("SubstanceProtein" == codeString) return FHIRAllTypes.SUBSTANCEPROTEIN
			if ("SubstanceReferenceInformation" == codeString) return FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION
			if ("SubstanceSourceMaterial" == codeString) return FHIRAllTypes.SUBSTANCESOURCEMATERIAL
			if ("SupplyDelivery" == codeString) return FHIRAllTypes.SUPPLYDELIVERY
			if ("SupplyRequest" == codeString) return FHIRAllTypes.SUPPLYREQUEST
			if ("Task" == codeString) return FHIRAllTypes.TASK
			if ("TerminologyCapabilities" == codeString) return FHIRAllTypes.TERMINOLOGYCAPABILITIES
			if ("TestReport" == codeString) return FHIRAllTypes.TESTREPORT
			if ("TestScript" == codeString) return FHIRAllTypes.TESTSCRIPT
			if ("ValueSet" == codeString) return FHIRAllTypes.VALUESET
			if ("VerificationResult" == codeString) return FHIRAllTypes.VERIFICATIONRESULT
			if ("VisionPrescription" == codeString) return FHIRAllTypes.VISIONPRESCRIPTION
			if ("Type" == codeString) return FHIRAllTypes.TYPE
			if ("Any" == codeString) return FHIRAllTypes.ANY
			throw IllegalArgumentException("Unknown FHIRAllTypes code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<FHIRAllTypes>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("Address" == codeString) return new Enumeration(this, FHIRAllTypes.ADDRESS)
			if ("Age" == codeString) return new Enumeration(this, FHIRAllTypes.AGE)
			if ("Annotation" == codeString) return new Enumeration(this, FHIRAllTypes.ANNOTATION)
			if ("Attachment" == codeString) return new Enumeration(this, FHIRAllTypes.ATTACHMENT)
			if ("BackboneElement" == codeString) return new Enumeration(this, FHIRAllTypes.BACKBONEELEMENT)
			if ("BackboneType" == codeString) return new Enumeration(this, FHIRAllTypes.BACKBONETYPE)
			if ("Base" == codeString) return new Enumeration(this, FHIRAllTypes.BASE)
			if ("CodeableConcept" == codeString) return new Enumeration(this, FHIRAllTypes.CODEABLECONCEPT)
			if ("CodeableReference" == codeString) return new Enumeration(this, FHIRAllTypes.CODEABLEREFERENCE)
			if ("Coding" == codeString) return new Enumeration(this, FHIRAllTypes.CODING)
			if ("ContactDetail" == codeString) return new Enumeration(this, FHIRAllTypes.CONTACTDETAIL)
			if ("ContactPoint" == codeString) return new Enumeration(this, FHIRAllTypes.CONTACTPOINT)
			if ("Contributor" == codeString) return new Enumeration(this, FHIRAllTypes.CONTRIBUTOR)
			if ("Count" == codeString) return new Enumeration(this, FHIRAllTypes.COUNT)
			if ("DataRequirement" == codeString) return new Enumeration(this, FHIRAllTypes.DATAREQUIREMENT)
			if ("DataType" == codeString) return new Enumeration(this, FHIRAllTypes.DATATYPE)
			if ("Distance" == codeString) return new Enumeration(this, FHIRAllTypes.DISTANCE)
			if ("Dosage" == codeString) return new Enumeration(this, FHIRAllTypes.DOSAGE)
			if ("Duration" == codeString) return new Enumeration(this, FHIRAllTypes.DURATION)
			if ("Element" == codeString) return new Enumeration(this, FHIRAllTypes.ELEMENT)
			if ("ElementDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.ELEMENTDEFINITION)
			if ("Expression" == codeString) return new Enumeration(this, FHIRAllTypes.EXPRESSION)
			if ("Extension" == codeString) return new Enumeration(this, FHIRAllTypes.EXTENSION)
			if ("HumanName" == codeString) return new Enumeration(this, FHIRAllTypes.HUMANNAME)
			if ("Identifier" == codeString) return new Enumeration(this, FHIRAllTypes.IDENTIFIER)
			if ("MarketingStatus" == codeString) return new Enumeration(this, FHIRAllTypes.MARKETINGSTATUS)
			if ("Meta" == codeString) return new Enumeration(this, FHIRAllTypes.META)
			if ("Money" == codeString) return new Enumeration(this, FHIRAllTypes.MONEY)
			if ("MoneyQuantity" == codeString) return new Enumeration(this, FHIRAllTypes.MONEYQUANTITY)
			if ("Narrative" == codeString) return new Enumeration(this, FHIRAllTypes.NARRATIVE)
			if ("OrderedDistribution" == codeString) return new Enumeration(this, FHIRAllTypes.ORDEREDDISTRIBUTION)
			if ("ParameterDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.PARAMETERDEFINITION)
			if ("Period" == codeString) return new Enumeration(this, FHIRAllTypes.PERIOD)
			if ("Population" == codeString) return new Enumeration(this, FHIRAllTypes.POPULATION)
			if ("PrimitiveType" == codeString) return new Enumeration(this, FHIRAllTypes.PRIMITIVETYPE)
			if ("ProdCharacteristic" == codeString) return new Enumeration(this, FHIRAllTypes.PRODCHARACTERISTIC)
			if ("ProductShelfLife" == codeString) return new Enumeration(this, FHIRAllTypes.PRODUCTSHELFLIFE)
			if ("Quantity" == codeString) return new Enumeration(this, FHIRAllTypes.QUANTITY)
			if ("Range" == codeString) return new Enumeration(this, FHIRAllTypes.RANGE)
			if ("Ratio" == codeString) return new Enumeration(this, FHIRAllTypes.RATIO)
			if ("Reference" == codeString) return new Enumeration(this, FHIRAllTypes.REFERENCE)
			if ("RelatedArtifact" == codeString) return new Enumeration(this, FHIRAllTypes.RELATEDARTIFACT)
			if ("SampledData" == codeString) return new Enumeration(this, FHIRAllTypes.SAMPLEDDATA)
			if ("Signature" == codeString) return new Enumeration(this, FHIRAllTypes.SIGNATURE)
			if ("SimpleQuantity" == codeString) return new Enumeration(this, FHIRAllTypes.SIMPLEQUANTITY)
			if ("Statistic" == codeString) return new Enumeration(this, FHIRAllTypes.STATISTIC)
			if ("Timing" == codeString) return new Enumeration(this, FHIRAllTypes.TIMING)
			if ("TriggerDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.TRIGGERDEFINITION)
			if ("UsageContext" == codeString) return new Enumeration(this, FHIRAllTypes.USAGECONTEXT)
			if ("base64Binary" == codeString) return new Enumeration(this, FHIRAllTypes.BASE64BINARY)
			if ("boolean" == codeString) return new Enumeration(this, FHIRAllTypes.BOOLEAN)
			if ("canonical" == codeString) return new Enumeration(this, FHIRAllTypes.CANONICAL)
			if ("code" == codeString) return new Enumeration(this, FHIRAllTypes.CODE)
			if ("date" == codeString) return new Enumeration(this, FHIRAllTypes.DATE)
			if ("dateTime" == codeString) return new Enumeration(this, FHIRAllTypes.DATETIME)
			if ("decimal" == codeString) return new Enumeration(this, FHIRAllTypes.DECIMAL)
			if ("id" == codeString) return new Enumeration(this, FHIRAllTypes.ID)
			if ("instant" == codeString) return new Enumeration(this, FHIRAllTypes.INSTANT)
			if ("integer" == codeString) return new Enumeration(this, FHIRAllTypes.INTEGER)
			if ("integer64" == codeString) return new Enumeration(this, FHIRAllTypes.INTEGER64)
			if ("markdown" == codeString) return new Enumeration(this, FHIRAllTypes.MARKDOWN)
			if ("oid" == codeString) return new Enumeration(this, FHIRAllTypes.OID)
			if ("positiveInt" == codeString) return new Enumeration(this, FHIRAllTypes.POSITIVEINT)
			if ("string" == codeString) return new Enumeration(this, FHIRAllTypes.STRING)
			if ("time" == codeString) return new Enumeration(this, FHIRAllTypes.TIME)
			if ("unsignedInt" == codeString) return new Enumeration(this, FHIRAllTypes.UNSIGNEDINT)
			if ("uri" == codeString) return new Enumeration(this, FHIRAllTypes.URI)
			if ("url" == codeString) return new Enumeration(this, FHIRAllTypes.URL)
			if ("uuid" == codeString) return new Enumeration(this, FHIRAllTypes.UUID)
			if ("xhtml" == codeString) return new Enumeration(this, FHIRAllTypes.XHTML)
			if ("Account" == codeString) return new Enumeration(this, FHIRAllTypes.ACCOUNT)
			if ("ActivityDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.ACTIVITYDEFINITION)
			if ("AdministrableProductDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.ADMINISTRABLEPRODUCTDEFINITION)
			if ("AdverseEvent" == codeString) return new Enumeration(this, FHIRAllTypes.ADVERSEEVENT)
			if ("AllergyIntolerance" == codeString) return new Enumeration(this, FHIRAllTypes.ALLERGYINTOLERANCE)
			if ("Appointment" == codeString) return new Enumeration(this, FHIRAllTypes.APPOINTMENT)
			if ("AppointmentResponse" == codeString) return new Enumeration(this, FHIRAllTypes.APPOINTMENTRESPONSE)
			if ("AuditEvent" == codeString) return new Enumeration(this, FHIRAllTypes.AUDITEVENT)
			if ("Basic" == codeString) return new Enumeration(this, FHIRAllTypes.BASIC)
			if ("Binary" == codeString) return new Enumeration(this, FHIRAllTypes.BINARY)
			if ("BiologicallyDerivedProduct" == codeString) return new Enumeration(this, FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT)
			if ("BodyStructure" == codeString) return new Enumeration(this, FHIRAllTypes.BODYSTRUCTURE)
			if ("Bundle" == codeString) return new Enumeration(this, FHIRAllTypes.BUNDLE)
			if ("CapabilityStatement" == codeString) return new Enumeration(this, FHIRAllTypes.CAPABILITYSTATEMENT)
			if ("CapabilityStatement2" == codeString) return new Enumeration(this, FHIRAllTypes.CAPABILITYSTATEMENT2)
			if ("CarePlan" == codeString) return new Enumeration(this, FHIRAllTypes.CAREPLAN)
			if ("CareTeam" == codeString) return new Enumeration(this, FHIRAllTypes.CARETEAM)
			if ("CatalogEntry" == codeString) return new Enumeration(this, FHIRAllTypes.CATALOGENTRY)
			if ("ChargeItem" == codeString) return new Enumeration(this, FHIRAllTypes.CHARGEITEM)
			if ("ChargeItemDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.CHARGEITEMDEFINITION)
			if ("Citation" == codeString) return new Enumeration(this, FHIRAllTypes.CITATION)
			if ("Claim" == codeString) return new Enumeration(this, FHIRAllTypes.CLAIM)
			if ("ClaimResponse" == codeString) return new Enumeration(this, FHIRAllTypes.CLAIMRESPONSE)
			if ("ClinicalImpression" == codeString) return new Enumeration(this, FHIRAllTypes.CLINICALIMPRESSION)
			if ("ClinicalUseIssue" == codeString) return new Enumeration(this, FHIRAllTypes.CLINICALUSEISSUE)
			if ("CodeSystem" == codeString) return new Enumeration(this, FHIRAllTypes.CODESYSTEM)
			if ("Communication" == codeString) return new Enumeration(this, FHIRAllTypes.COMMUNICATION)
			if ("CommunicationRequest" == codeString) return new Enumeration(this, FHIRAllTypes.COMMUNICATIONREQUEST)
			if ("CompartmentDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.COMPARTMENTDEFINITION)
			if ("Composition" == codeString) return new Enumeration(this, FHIRAllTypes.COMPOSITION)
			if ("ConceptMap" == codeString) return new Enumeration(this, FHIRAllTypes.CONCEPTMAP)
			if ("Condition" == codeString) return new Enumeration(this, FHIRAllTypes.CONDITION)
			if ("ConditionDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.CONDITIONDEFINITION)
			if ("Consent" == codeString) return new Enumeration(this, FHIRAllTypes.CONSENT)
			if ("Contract" == codeString) return new Enumeration(this, FHIRAllTypes.CONTRACT)
			if ("Coverage" == codeString) return new Enumeration(this, FHIRAllTypes.COVERAGE)
			if ("CoverageEligibilityRequest" == codeString) return new Enumeration(this, FHIRAllTypes.COVERAGEELIGIBILITYREQUEST)
			if ("CoverageEligibilityResponse" == codeString) return new Enumeration(this, FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE)
			if ("DetectedIssue" == codeString) return new Enumeration(this, FHIRAllTypes.DETECTEDISSUE)
			if ("Device" == codeString) return new Enumeration(this, FHIRAllTypes.DEVICE)
			if ("DeviceDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.DEVICEDEFINITION)
			if ("DeviceMetric" == codeString) return new Enumeration(this, FHIRAllTypes.DEVICEMETRIC)
			if ("DeviceRequest" == codeString) return new Enumeration(this, FHIRAllTypes.DEVICEREQUEST)
			if ("DeviceUseStatement" == codeString) return new Enumeration(this, FHIRAllTypes.DEVICEUSESTATEMENT)
			if ("DiagnosticReport" == codeString) return new Enumeration(this, FHIRAllTypes.DIAGNOSTICREPORT)
			if ("DocumentManifest" == codeString) return new Enumeration(this, FHIRAllTypes.DOCUMENTMANIFEST)
			if ("DocumentReference" == codeString) return new Enumeration(this, FHIRAllTypes.DOCUMENTREFERENCE)
			if ("DomainResource" == codeString) return new Enumeration(this, FHIRAllTypes.DOMAINRESOURCE)
			if ("Encounter" == codeString) return new Enumeration(this, FHIRAllTypes.ENCOUNTER)
			if ("Endpoint" == codeString) return new Enumeration(this, FHIRAllTypes.ENDPOINT)
			if ("EnrollmentRequest" == codeString) return new Enumeration(this, FHIRAllTypes.ENROLLMENTREQUEST)
			if ("EnrollmentResponse" == codeString) return new Enumeration(this, FHIRAllTypes.ENROLLMENTRESPONSE)
			if ("EpisodeOfCare" == codeString) return new Enumeration(this, FHIRAllTypes.EPISODEOFCARE)
			if ("EventDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.EVENTDEFINITION)
			if ("Evidence" == codeString) return new Enumeration(this, FHIRAllTypes.EVIDENCE)
			if ("EvidenceReport" == codeString) return new Enumeration(this, FHIRAllTypes.EVIDENCEREPORT)
			if ("EvidenceVariable" == codeString) return new Enumeration(this, FHIRAllTypes.EVIDENCEVARIABLE)
			if ("ExampleScenario" == codeString) return new Enumeration(this, FHIRAllTypes.EXAMPLESCENARIO)
			if ("ExplanationOfBenefit" == codeString) return new Enumeration(this, FHIRAllTypes.EXPLANATIONOFBENEFIT)
			if ("FamilyMemberHistory" == codeString) return new Enumeration(this, FHIRAllTypes.FAMILYMEMBERHISTORY)
			if ("Flag" == codeString) return new Enumeration(this, FHIRAllTypes.FLAG)
			if ("Goal" == codeString) return new Enumeration(this, FHIRAllTypes.GOAL)
			if ("GraphDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.GRAPHDEFINITION)
			if ("Group" == codeString) return new Enumeration(this, FHIRAllTypes.GROUP)
			if ("GuidanceResponse" == codeString) return new Enumeration(this, FHIRAllTypes.GUIDANCERESPONSE)
			if ("HealthcareService" == codeString) return new Enumeration(this, FHIRAllTypes.HEALTHCARESERVICE)
			if ("ImagingStudy" == codeString) return new Enumeration(this, FHIRAllTypes.IMAGINGSTUDY)
			if ("Immunization" == codeString) return new Enumeration(this, FHIRAllTypes.IMMUNIZATION)
			if ("ImmunizationEvaluation" == codeString) return new Enumeration(this, FHIRAllTypes.IMMUNIZATIONEVALUATION)
			if ("ImmunizationRecommendation" == codeString) return new Enumeration(this, FHIRAllTypes.IMMUNIZATIONRECOMMENDATION)
			if ("ImplementationGuide" == codeString) return new Enumeration(this, FHIRAllTypes.IMPLEMENTATIONGUIDE)
			if ("Ingredient" == codeString) return new Enumeration(this, FHIRAllTypes.INGREDIENT)
			if ("InsurancePlan" == codeString) return new Enumeration(this, FHIRAllTypes.INSURANCEPLAN)
			if ("Invoice" == codeString) return new Enumeration(this, FHIRAllTypes.INVOICE)
			if ("Library" == codeString) return new Enumeration(this, FHIRAllTypes.LIBRARY)
			if ("Linkage" == codeString) return new Enumeration(this, FHIRAllTypes.LINKAGE)
			if ("List" == codeString) return new Enumeration(this, FHIRAllTypes.LIST)
			if ("Location" == codeString) return new Enumeration(this, FHIRAllTypes.LOCATION)
			if ("ManufacturedItemDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.MANUFACTUREDITEMDEFINITION)
			if ("Measure" == codeString) return new Enumeration(this, FHIRAllTypes.MEASURE)
			if ("MeasureReport" == codeString) return new Enumeration(this, FHIRAllTypes.MEASUREREPORT)
			if ("Medication" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATION)
			if ("MedicationAdministration" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATIONADMINISTRATION)
			if ("MedicationDispense" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATIONDISPENSE)
			if ("MedicationKnowledge" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATIONKNOWLEDGE)
			if ("MedicationRequest" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATIONREQUEST)
			if ("MedicationUsage" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICATIONUSAGE)
			if ("MedicinalProductDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.MEDICINALPRODUCTDEFINITION)
			if ("MessageDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.MESSAGEDEFINITION)
			if ("MessageHeader" == codeString) return new Enumeration(this, FHIRAllTypes.MESSAGEHEADER)
			if ("MolecularSequence" == codeString) return new Enumeration(this, FHIRAllTypes.MOLECULARSEQUENCE)
			if ("NamingSystem" == codeString) return new Enumeration(this, FHIRAllTypes.NAMINGSYSTEM)
			if ("NutritionIntake" == codeString) return new Enumeration(this, FHIRAllTypes.NUTRITIONINTAKE)
			if ("NutritionOrder" == codeString) return new Enumeration(this, FHIRAllTypes.NUTRITIONORDER)
			if ("NutritionProduct" == codeString) return new Enumeration(this, FHIRAllTypes.NUTRITIONPRODUCT)
			if ("Observation" == codeString) return new Enumeration(this, FHIRAllTypes.OBSERVATION)
			if ("ObservationDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.OBSERVATIONDEFINITION)
			if ("OperationDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.OPERATIONDEFINITION)
			if ("OperationOutcome" == codeString) return new Enumeration(this, FHIRAllTypes.OPERATIONOUTCOME)
			if ("Organization" == codeString) return new Enumeration(this, FHIRAllTypes.ORGANIZATION)
			if ("OrganizationAffiliation" == codeString) return new Enumeration(this, FHIRAllTypes.ORGANIZATIONAFFILIATION)
			if ("PackagedProductDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.PACKAGEDPRODUCTDEFINITION)
			if ("Parameters" == codeString) return new Enumeration(this, FHIRAllTypes.PARAMETERS)
			if ("Patient" == codeString) return new Enumeration(this, FHIRAllTypes.PATIENT)
			if ("PaymentNotice" == codeString) return new Enumeration(this, FHIRAllTypes.PAYMENTNOTICE)
			if ("PaymentReconciliation" == codeString) return new Enumeration(this, FHIRAllTypes.PAYMENTRECONCILIATION)
			if ("Permission" == codeString) return new Enumeration(this, FHIRAllTypes.PERMISSION)
			if ("Person" == codeString) return new Enumeration(this, FHIRAllTypes.PERSON)
			if ("PlanDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.PLANDEFINITION)
			if ("Practitioner" == codeString) return new Enumeration(this, FHIRAllTypes.PRACTITIONER)
			if ("PractitionerRole" == codeString) return new Enumeration(this, FHIRAllTypes.PRACTITIONERROLE)
			if ("Procedure" == codeString) return new Enumeration(this, FHIRAllTypes.PROCEDURE)
			if ("Provenance" == codeString) return new Enumeration(this, FHIRAllTypes.PROVENANCE)
			if ("Questionnaire" == codeString) return new Enumeration(this, FHIRAllTypes.QUESTIONNAIRE)
			if ("QuestionnaireResponse" == codeString) return new Enumeration(this, FHIRAllTypes.QUESTIONNAIRERESPONSE)
			if ("RegulatedAuthorization" == codeString) return new Enumeration(this, FHIRAllTypes.REGULATEDAUTHORIZATION)
			if ("RelatedPerson" == codeString) return new Enumeration(this, FHIRAllTypes.RELATEDPERSON)
			if ("RequestGroup" == codeString) return new Enumeration(this, FHIRAllTypes.REQUESTGROUP)
			if ("ResearchStudy" == codeString) return new Enumeration(this, FHIRAllTypes.RESEARCHSTUDY)
			if ("ResearchSubject" == codeString) return new Enumeration(this, FHIRAllTypes.RESEARCHSUBJECT)
			if ("Resource" == codeString) return new Enumeration(this, FHIRAllTypes.RESOURCE)
			if ("RiskAssessment" == codeString) return new Enumeration(this, FHIRAllTypes.RISKASSESSMENT)
			if ("Schedule" == codeString) return new Enumeration(this, FHIRAllTypes.SCHEDULE)
			if ("SearchParameter" == codeString) return new Enumeration(this, FHIRAllTypes.SEARCHPARAMETER)
			if ("ServiceRequest" == codeString) return new Enumeration(this, FHIRAllTypes.SERVICEREQUEST)
			if ("Slot" == codeString) return new Enumeration(this, FHIRAllTypes.SLOT)
			if ("Specimen" == codeString) return new Enumeration(this, FHIRAllTypes.SPECIMEN)
			if ("SpecimenDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.SPECIMENDEFINITION)
			if ("StructureDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.STRUCTUREDEFINITION)
			if ("StructureMap" == codeString) return new Enumeration(this, FHIRAllTypes.STRUCTUREMAP)
			if ("Subscription" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSCRIPTION)
			if ("SubscriptionStatus" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSCRIPTIONSTATUS)
			if ("SubscriptionTopic" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSCRIPTIONTOPIC)
			if ("Substance" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCE)
			if ("SubstanceDefinition" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCEDEFINITION)
			if ("SubstanceNucleicAcid" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCENUCLEICACID)
			if ("SubstancePolymer" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCEPOLYMER)
			if ("SubstanceProtein" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCEPROTEIN)
			if ("SubstanceReferenceInformation" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION)
			if ("SubstanceSourceMaterial" == codeString) return new Enumeration(this, FHIRAllTypes.SUBSTANCESOURCEMATERIAL)
			if ("SupplyDelivery" == codeString) return new Enumeration(this, FHIRAllTypes.SUPPLYDELIVERY)
			if ("SupplyRequest" == codeString) return new Enumeration(this, FHIRAllTypes.SUPPLYREQUEST)
			if ("Task" == codeString) return new Enumeration(this, FHIRAllTypes.TASK)
			if ("TerminologyCapabilities" == codeString) return new Enumeration(this, FHIRAllTypes.TERMINOLOGYCAPABILITIES)
			if ("TestReport" == codeString) return new Enumeration(this, FHIRAllTypes.TESTREPORT)
			if ("TestScript" == codeString) return new Enumeration(this, FHIRAllTypes.TESTSCRIPT)
			if ("ValueSet" == codeString) return new Enumeration(this, FHIRAllTypes.VALUESET)
			if ("VerificationResult" == codeString) return new Enumeration(this, FHIRAllTypes.VERIFICATIONRESULT)
			if ("VisionPrescription" == codeString) return new Enumeration(this, FHIRAllTypes.VISIONPRESCRIPTION)
			if ("Type" == codeString) return new Enumeration(this, FHIRAllTypes.TYPE)
			if ("Any" == codeString) return new Enumeration(this, FHIRAllTypes.ANY)
			throw FHIRException("Unknown FHIRAllTypes code '$codeString'")
		}
		override fun toCode(code: FHIRAllTypes): String? {
			return when (code) {
				FHIRAllTypes.ADDRESS -> "Address"
				FHIRAllTypes.AGE -> "Age"
				FHIRAllTypes.ANNOTATION -> "Annotation"
				FHIRAllTypes.ATTACHMENT -> "Attachment"
				FHIRAllTypes.BACKBONEELEMENT -> "BackboneElement"
				FHIRAllTypes.BACKBONETYPE -> "BackboneType"
				FHIRAllTypes.BASE -> "Base"
				FHIRAllTypes.CODEABLECONCEPT -> "CodeableConcept"
				FHIRAllTypes.CODEABLEREFERENCE -> "CodeableReference"
				FHIRAllTypes.CODING -> "Coding"
				FHIRAllTypes.CONTACTDETAIL -> "ContactDetail"
				FHIRAllTypes.CONTACTPOINT -> "ContactPoint"
				FHIRAllTypes.CONTRIBUTOR -> "Contributor"
				FHIRAllTypes.COUNT -> "Count"
				FHIRAllTypes.DATAREQUIREMENT -> "DataRequirement"
				FHIRAllTypes.DATATYPE -> "DataType"
				FHIRAllTypes.DISTANCE -> "Distance"
				FHIRAllTypes.DOSAGE -> "Dosage"
				FHIRAllTypes.DURATION -> "Duration"
				FHIRAllTypes.ELEMENT -> "Element"
				FHIRAllTypes.ELEMENTDEFINITION -> "ElementDefinition"
				FHIRAllTypes.EXPRESSION -> "Expression"
				FHIRAllTypes.EXTENSION -> "Extension"
				FHIRAllTypes.HUMANNAME -> "HumanName"
				FHIRAllTypes.IDENTIFIER -> "Identifier"
				FHIRAllTypes.MARKETINGSTATUS -> "MarketingStatus"
				FHIRAllTypes.META -> "Meta"
				FHIRAllTypes.MONEY -> "Money"
				FHIRAllTypes.MONEYQUANTITY -> "MoneyQuantity"
				FHIRAllTypes.NARRATIVE -> "Narrative"
				FHIRAllTypes.ORDEREDDISTRIBUTION -> "OrderedDistribution"
				FHIRAllTypes.PARAMETERDEFINITION -> "ParameterDefinition"
				FHIRAllTypes.PERIOD -> "Period"
				FHIRAllTypes.POPULATION -> "Population"
				FHIRAllTypes.PRIMITIVETYPE -> "PrimitiveType"
				FHIRAllTypes.PRODCHARACTERISTIC -> "ProdCharacteristic"
				FHIRAllTypes.PRODUCTSHELFLIFE -> "ProductShelfLife"
				FHIRAllTypes.QUANTITY -> "Quantity"
				FHIRAllTypes.RANGE -> "Range"
				FHIRAllTypes.RATIO -> "Ratio"
				FHIRAllTypes.REFERENCE -> "Reference"
				FHIRAllTypes.RELATEDARTIFACT -> "RelatedArtifact"
				FHIRAllTypes.SAMPLEDDATA -> "SampledData"
				FHIRAllTypes.SIGNATURE -> "Signature"
				FHIRAllTypes.SIMPLEQUANTITY -> "SimpleQuantity"
				FHIRAllTypes.STATISTIC -> "Statistic"
				FHIRAllTypes.TIMING -> "Timing"
				FHIRAllTypes.TRIGGERDEFINITION -> "TriggerDefinition"
				FHIRAllTypes.USAGECONTEXT -> "UsageContext"
				FHIRAllTypes.BASE64BINARY -> "base64Binary"
				FHIRAllTypes.BOOLEAN -> "boolean"
				FHIRAllTypes.CANONICAL -> "canonical"
				FHIRAllTypes.CODE -> "code"
				FHIRAllTypes.DATE -> "date"
				FHIRAllTypes.DATETIME -> "dateTime"
				FHIRAllTypes.DECIMAL -> "decimal"
				FHIRAllTypes.ID -> "id"
				FHIRAllTypes.INSTANT -> "instant"
				FHIRAllTypes.INTEGER -> "integer"
				FHIRAllTypes.INTEGER64 -> "integer64"
				FHIRAllTypes.MARKDOWN -> "markdown"
				FHIRAllTypes.OID -> "oid"
				FHIRAllTypes.POSITIVEINT -> "positiveInt"
				FHIRAllTypes.STRING -> "string"
				FHIRAllTypes.TIME -> "time"
				FHIRAllTypes.UNSIGNEDINT -> "unsignedInt"
				FHIRAllTypes.URI -> "uri"
				FHIRAllTypes.URL -> "url"
				FHIRAllTypes.UUID -> "uuid"
				FHIRAllTypes.XHTML -> "xhtml"
				FHIRAllTypes.ACCOUNT -> "Account"
				FHIRAllTypes.ACTIVITYDEFINITION -> "ActivityDefinition"
				FHIRAllTypes.ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition"
				FHIRAllTypes.ADVERSEEVENT -> "AdverseEvent"
				FHIRAllTypes.ALLERGYINTOLERANCE -> "AllergyIntolerance"
				FHIRAllTypes.APPOINTMENT -> "Appointment"
				FHIRAllTypes.APPOINTMENTRESPONSE -> "AppointmentResponse"
				FHIRAllTypes.AUDITEVENT -> "AuditEvent"
				FHIRAllTypes.BASIC -> "Basic"
				FHIRAllTypes.BINARY -> "Binary"
				FHIRAllTypes.BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct"
				FHIRAllTypes.BODYSTRUCTURE -> "BodyStructure"
				FHIRAllTypes.BUNDLE -> "Bundle"
				FHIRAllTypes.CAPABILITYSTATEMENT -> "CapabilityStatement"
				FHIRAllTypes.CAPABILITYSTATEMENT2 -> "CapabilityStatement2"
				FHIRAllTypes.CAREPLAN -> "CarePlan"
				FHIRAllTypes.CARETEAM -> "CareTeam"
				FHIRAllTypes.CATALOGENTRY -> "CatalogEntry"
				FHIRAllTypes.CHARGEITEM -> "ChargeItem"
				FHIRAllTypes.CHARGEITEMDEFINITION -> "ChargeItemDefinition"
				FHIRAllTypes.CITATION -> "Citation"
				FHIRAllTypes.CLAIM -> "Claim"
				FHIRAllTypes.CLAIMRESPONSE -> "ClaimResponse"
				FHIRAllTypes.CLINICALIMPRESSION -> "ClinicalImpression"
				FHIRAllTypes.CLINICALUSEISSUE -> "ClinicalUseIssue"
				FHIRAllTypes.CODESYSTEM -> "CodeSystem"
				FHIRAllTypes.COMMUNICATION -> "Communication"
				FHIRAllTypes.COMMUNICATIONREQUEST -> "CommunicationRequest"
				FHIRAllTypes.COMPARTMENTDEFINITION -> "CompartmentDefinition"
				FHIRAllTypes.COMPOSITION -> "Composition"
				FHIRAllTypes.CONCEPTMAP -> "ConceptMap"
				FHIRAllTypes.CONDITION -> "Condition"
				FHIRAllTypes.CONDITIONDEFINITION -> "ConditionDefinition"
				FHIRAllTypes.CONSENT -> "Consent"
				FHIRAllTypes.CONTRACT -> "Contract"
				FHIRAllTypes.COVERAGE -> "Coverage"
				FHIRAllTypes.COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest"
				FHIRAllTypes.COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse"
				FHIRAllTypes.DETECTEDISSUE -> "DetectedIssue"
				FHIRAllTypes.DEVICE -> "Device"
				FHIRAllTypes.DEVICEDEFINITION -> "DeviceDefinition"
				FHIRAllTypes.DEVICEMETRIC -> "DeviceMetric"
				FHIRAllTypes.DEVICEREQUEST -> "DeviceRequest"
				FHIRAllTypes.DEVICEUSESTATEMENT -> "DeviceUseStatement"
				FHIRAllTypes.DIAGNOSTICREPORT -> "DiagnosticReport"
				FHIRAllTypes.DOCUMENTMANIFEST -> "DocumentManifest"
				FHIRAllTypes.DOCUMENTREFERENCE -> "DocumentReference"
				FHIRAllTypes.DOMAINRESOURCE -> "DomainResource"
				FHIRAllTypes.ENCOUNTER -> "Encounter"
				FHIRAllTypes.ENDPOINT -> "Endpoint"
				FHIRAllTypes.ENROLLMENTREQUEST -> "EnrollmentRequest"
				FHIRAllTypes.ENROLLMENTRESPONSE -> "EnrollmentResponse"
				FHIRAllTypes.EPISODEOFCARE -> "EpisodeOfCare"
				FHIRAllTypes.EVENTDEFINITION -> "EventDefinition"
				FHIRAllTypes.EVIDENCE -> "Evidence"
				FHIRAllTypes.EVIDENCEREPORT -> "EvidenceReport"
				FHIRAllTypes.EVIDENCEVARIABLE -> "EvidenceVariable"
				FHIRAllTypes.EXAMPLESCENARIO -> "ExampleScenario"
				FHIRAllTypes.EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit"
				FHIRAllTypes.FAMILYMEMBERHISTORY -> "FamilyMemberHistory"
				FHIRAllTypes.FLAG -> "Flag"
				FHIRAllTypes.GOAL -> "Goal"
				FHIRAllTypes.GRAPHDEFINITION -> "GraphDefinition"
				FHIRAllTypes.GROUP -> "Group"
				FHIRAllTypes.GUIDANCERESPONSE -> "GuidanceResponse"
				FHIRAllTypes.HEALTHCARESERVICE -> "HealthcareService"
				FHIRAllTypes.IMAGINGSTUDY -> "ImagingStudy"
				FHIRAllTypes.IMMUNIZATION -> "Immunization"
				FHIRAllTypes.IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation"
				FHIRAllTypes.IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation"
				FHIRAllTypes.IMPLEMENTATIONGUIDE -> "ImplementationGuide"
				FHIRAllTypes.INGREDIENT -> "Ingredient"
				FHIRAllTypes.INSURANCEPLAN -> "InsurancePlan"
				FHIRAllTypes.INVOICE -> "Invoice"
				FHIRAllTypes.LIBRARY -> "Library"
				FHIRAllTypes.LINKAGE -> "Linkage"
				FHIRAllTypes.LIST -> "List"
				FHIRAllTypes.LOCATION -> "Location"
				FHIRAllTypes.MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition"
				FHIRAllTypes.MEASURE -> "Measure"
				FHIRAllTypes.MEASUREREPORT -> "MeasureReport"
				FHIRAllTypes.MEDICATION -> "Medication"
				FHIRAllTypes.MEDICATIONADMINISTRATION -> "MedicationAdministration"
				FHIRAllTypes.MEDICATIONDISPENSE -> "MedicationDispense"
				FHIRAllTypes.MEDICATIONKNOWLEDGE -> "MedicationKnowledge"
				FHIRAllTypes.MEDICATIONREQUEST -> "MedicationRequest"
				FHIRAllTypes.MEDICATIONUSAGE -> "MedicationUsage"
				FHIRAllTypes.MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition"
				FHIRAllTypes.MESSAGEDEFINITION -> "MessageDefinition"
				FHIRAllTypes.MESSAGEHEADER -> "MessageHeader"
				FHIRAllTypes.MOLECULARSEQUENCE -> "MolecularSequence"
				FHIRAllTypes.NAMINGSYSTEM -> "NamingSystem"
				FHIRAllTypes.NUTRITIONINTAKE -> "NutritionIntake"
				FHIRAllTypes.NUTRITIONORDER -> "NutritionOrder"
				FHIRAllTypes.NUTRITIONPRODUCT -> "NutritionProduct"
				FHIRAllTypes.OBSERVATION -> "Observation"
				FHIRAllTypes.OBSERVATIONDEFINITION -> "ObservationDefinition"
				FHIRAllTypes.OPERATIONDEFINITION -> "OperationDefinition"
				FHIRAllTypes.OPERATIONOUTCOME -> "OperationOutcome"
				FHIRAllTypes.ORGANIZATION -> "Organization"
				FHIRAllTypes.ORGANIZATIONAFFILIATION -> "OrganizationAffiliation"
				FHIRAllTypes.PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition"
				FHIRAllTypes.PARAMETERS -> "Parameters"
				FHIRAllTypes.PATIENT -> "Patient"
				FHIRAllTypes.PAYMENTNOTICE -> "PaymentNotice"
				FHIRAllTypes.PAYMENTRECONCILIATION -> "PaymentReconciliation"
				FHIRAllTypes.PERMISSION -> "Permission"
				FHIRAllTypes.PERSON -> "Person"
				FHIRAllTypes.PLANDEFINITION -> "PlanDefinition"
				FHIRAllTypes.PRACTITIONER -> "Practitioner"
				FHIRAllTypes.PRACTITIONERROLE -> "PractitionerRole"
				FHIRAllTypes.PROCEDURE -> "Procedure"
				FHIRAllTypes.PROVENANCE -> "Provenance"
				FHIRAllTypes.QUESTIONNAIRE -> "Questionnaire"
				FHIRAllTypes.QUESTIONNAIRERESPONSE -> "QuestionnaireResponse"
				FHIRAllTypes.REGULATEDAUTHORIZATION -> "RegulatedAuthorization"
				FHIRAllTypes.RELATEDPERSON -> "RelatedPerson"
				FHIRAllTypes.REQUESTGROUP -> "RequestGroup"
				FHIRAllTypes.RESEARCHSTUDY -> "ResearchStudy"
				FHIRAllTypes.RESEARCHSUBJECT -> "ResearchSubject"
				FHIRAllTypes.RESOURCE -> "Resource"
				FHIRAllTypes.RISKASSESSMENT -> "RiskAssessment"
				FHIRAllTypes.SCHEDULE -> "Schedule"
				FHIRAllTypes.SEARCHPARAMETER -> "SearchParameter"
				FHIRAllTypes.SERVICEREQUEST -> "ServiceRequest"
				FHIRAllTypes.SLOT -> "Slot"
				FHIRAllTypes.SPECIMEN -> "Specimen"
				FHIRAllTypes.SPECIMENDEFINITION -> "SpecimenDefinition"
				FHIRAllTypes.STRUCTUREDEFINITION -> "StructureDefinition"
				FHIRAllTypes.STRUCTUREMAP -> "StructureMap"
				FHIRAllTypes.SUBSCRIPTION -> "Subscription"
				FHIRAllTypes.SUBSCRIPTIONSTATUS -> "SubscriptionStatus"
				FHIRAllTypes.SUBSCRIPTIONTOPIC -> "SubscriptionTopic"
				FHIRAllTypes.SUBSTANCE -> "Substance"
				FHIRAllTypes.SUBSTANCEDEFINITION -> "SubstanceDefinition"
				FHIRAllTypes.SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid"
				FHIRAllTypes.SUBSTANCEPOLYMER -> "SubstancePolymer"
				FHIRAllTypes.SUBSTANCEPROTEIN -> "SubstanceProtein"
				FHIRAllTypes.SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation"
				FHIRAllTypes.SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial"
				FHIRAllTypes.SUPPLYDELIVERY -> "SupplyDelivery"
				FHIRAllTypes.SUPPLYREQUEST -> "SupplyRequest"
				FHIRAllTypes.TASK -> "Task"
				FHIRAllTypes.TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities"
				FHIRAllTypes.TESTREPORT -> "TestReport"
				FHIRAllTypes.TESTSCRIPT -> "TestScript"
				FHIRAllTypes.VALUESET -> "ValueSet"
				FHIRAllTypes.VERIFICATIONRESULT -> "VerificationResult"
				FHIRAllTypes.VISIONPRESCRIPTION -> "VisionPrescription"
				FHIRAllTypes.TYPE -> "Type"
				FHIRAllTypes.ANY -> "Any"
				NULL -> null
			}
		}
		override fun toSystem(code: FHIRAllTypes): String? {
			return code.system
		}
    }

	enum class FHIRVersion {
		/**
		* Oldest archived version of FHIR.
		*/
		_0_01, 
		/**
		* 1st Draft for Comment (Sept 2012 Ballot).
		*/
		_0_05, 
		/**
		* 2nd Draft for Comment (January 2013 Ballot).
		*/
		_0_06, 
		/**
		* DSTU 1 Ballot version.
		*/
		_0_11, 
		/**
		* DSTU 1 Official version.
		*/
		_0_0_80, 
		/**
		* DSTU 1 Official version Technical Errata #1.
		*/
		_0_0_81, 
		/**
		* DSTU 1 Official version Technical Errata #2.
		*/
		_0_0_82, 
		/**
		* Draft For Comment (January 2015 Ballot).
		*/
		_0_4_0, 
		/**
		* DSTU 2 Ballot version (May 2015 Ballot).
		*/
		_0_5_0, 
		/**
		* DSTU 2 QA Preview + CQIF Ballot (Sep 2015).
		*/
		_1_0_0, 
		/**
		* DSTU 2 (Official version).
		*/
		_1_0_1, 
		/**
		* DSTU 2 (Official version) with 1 technical errata.
		*/
		_1_0_2, 
		/**
		* GAO Ballot + draft changes to main FHIR standard.
		*/
		_1_1_0, 
		/**
		* CQF on FHIR Ballot + Connectathon 12 (Montreal).
		*/
		_1_4_0, 
		/**
		* FHIR STU3 Ballot + Connectathon 13 (Baltimore).
		*/
		_1_6_0, 
		/**
		* FHIR STU3 Candidate + Connectathon 14 (San Antonio).
		*/
		_1_8_0, 
		/**
		* FHIR Release 3 (STU).
		*/
		_3_0_0, 
		/**
		* FHIR Release 3 (STU) with 1 technical errata.
		*/
		_3_0_1, 
		/**
		* FHIR Release 3 (STU) with 2 technical errata.
		*/
		_3_0_2, 
		/**
		* R4 Ballot #1.
		*/
		_3_3_0, 
		/**
		* R4 Ballot #2.
		*/
		_3_5_0, 
		/**
		* FHIR Release 4 (Normative + STU).
		*/
		_4_0_0, 
		/**
		* FHIR Release 4 (Normative + STU) with 1 technical errata.
		*/
		_4_0_1, 
		/**
		* Interim Version.
		*/
		_4_1_0, 
		/**
		* R5 Preview #1.
		*/
		_4_2_0, 
		/**
		* R5 Preview #2.
		*/
		_4_4_0, 
		/**
		* R5 Preview #3.
		*/
		_4_5_0, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				_0_01 -> "0.01"
				_0_05 -> "0.05"
				_0_06 -> "0.06"
				_0_11 -> "0.11"
				_0_0_80 -> "0.0.80"
				_0_0_81 -> "0.0.81"
				_0_0_82 -> "0.0.82"
				_0_4_0 -> "0.4.0"
				_0_5_0 -> "0.5.0"
				_1_0_0 -> "1.0.0"
				_1_0_1 -> "1.0.1"
				_1_0_2 -> "1.0.2"
				_1_1_0 -> "1.1.0"
				_1_4_0 -> "1.4.0"
				_1_6_0 -> "1.6.0"
				_1_8_0 -> "1.8.0"
				_3_0_0 -> "3.0.0"
				_3_0_1 -> "3.0.1"
				_3_0_2 -> "3.0.2"
				_3_3_0 -> "3.3.0"
				_3_5_0 -> "3.5.0"
				_4_0_0 -> "4.0.0"
				_4_0_1 -> "4.0.1"
				_4_1_0 -> "4.1.0"
				_4_2_0 -> "4.2.0"
				_4_4_0 -> "4.4.0"
				_4_5_0 -> "4.5.0"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				_0_01 -> "http://hl7.org/fhir/FHIR-version"
				_0_05 -> "http://hl7.org/fhir/FHIR-version"
				_0_06 -> "http://hl7.org/fhir/FHIR-version"
				_0_11 -> "http://hl7.org/fhir/FHIR-version"
				_0_0_80 -> "http://hl7.org/fhir/FHIR-version"
				_0_0_81 -> "http://hl7.org/fhir/FHIR-version"
				_0_0_82 -> "http://hl7.org/fhir/FHIR-version"
				_0_4_0 -> "http://hl7.org/fhir/FHIR-version"
				_0_5_0 -> "http://hl7.org/fhir/FHIR-version"
				_1_0_0 -> "http://hl7.org/fhir/FHIR-version"
				_1_0_1 -> "http://hl7.org/fhir/FHIR-version"
				_1_0_2 -> "http://hl7.org/fhir/FHIR-version"
				_1_1_0 -> "http://hl7.org/fhir/FHIR-version"
				_1_4_0 -> "http://hl7.org/fhir/FHIR-version"
				_1_6_0 -> "http://hl7.org/fhir/FHIR-version"
				_1_8_0 -> "http://hl7.org/fhir/FHIR-version"
				_3_0_0 -> "http://hl7.org/fhir/FHIR-version"
				_3_0_1 -> "http://hl7.org/fhir/FHIR-version"
				_3_0_2 -> "http://hl7.org/fhir/FHIR-version"
				_3_3_0 -> "http://hl7.org/fhir/FHIR-version"
				_3_5_0 -> "http://hl7.org/fhir/FHIR-version"
				_4_0_0 -> "http://hl7.org/fhir/FHIR-version"
				_4_0_1 -> "http://hl7.org/fhir/FHIR-version"
				_4_1_0 -> "http://hl7.org/fhir/FHIR-version"
				_4_2_0 -> "http://hl7.org/fhir/FHIR-version"
				_4_4_0 -> "http://hl7.org/fhir/FHIR-version"
				_4_5_0 -> "http://hl7.org/fhir/FHIR-version"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				_0_01 -> "Oldest archived version of FHIR."
				_0_05 -> "1st Draft for Comment (Sept 2012 Ballot)."
				_0_06 -> "2nd Draft for Comment (January 2013 Ballot)."
				_0_11 -> "DSTU 1 Ballot version."
				_0_0_80 -> "DSTU 1 Official version."
				_0_0_81 -> "DSTU 1 Official version Technical Errata #1."
				_0_0_82 -> "DSTU 1 Official version Technical Errata #2."
				_0_4_0 -> "Draft For Comment (January 2015 Ballot)."
				_0_5_0 -> "DSTU 2 Ballot version (May 2015 Ballot)."
				_1_0_0 -> "DSTU 2 QA Preview + CQIF Ballot (Sep 2015)."
				_1_0_1 -> "DSTU 2 (Official version)."
				_1_0_2 -> "DSTU 2 (Official version) with 1 technical errata."
				_1_1_0 -> "GAO Ballot + draft changes to main FHIR standard."
				_1_4_0 -> "CQF on FHIR Ballot + Connectathon 12 (Montreal)."
				_1_6_0 -> "FHIR STU3 Ballot + Connectathon 13 (Baltimore)."
				_1_8_0 -> "FHIR STU3 Candidate + Connectathon 14 (San Antonio)."
				_3_0_0 -> "FHIR Release 3 (STU)."
				_3_0_1 -> "FHIR Release 3 (STU) with 1 technical errata."
				_3_0_2 -> "FHIR Release 3 (STU) with 2 technical errata."
				_3_3_0 -> "R4 Ballot #1."
				_3_5_0 -> "R4 Ballot #2."
				_4_0_0 -> "FHIR Release 4 (Normative + STU)."
				_4_0_1 -> "FHIR Release 4 (Normative + STU) with 1 technical errata."
				_4_1_0 -> "Interim Version."
				_4_2_0 -> "R5 Preview #1."
				_4_4_0 -> "R5 Preview #2."
				_4_5_0 -> "R5 Preview #3."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				_0_01 -> "0.01";
				_0_05 -> "0.05";
				_0_06 -> "0.06";
				_0_11 -> "0.11";
				_0_0_80 -> "0.0.80";
				_0_0_81 -> "0.0.81";
				_0_0_82 -> "0.0.82";
				_0_4_0 -> "0.4.0";
				_0_5_0 -> "0.5.0";
				_1_0_0 -> "1.0.0";
				_1_0_1 -> "1.0.1";
				_1_0_2 -> "1.0.2";
				_1_1_0 -> "1.1.0";
				_1_4_0 -> "1.4.0";
				_1_6_0 -> "1.6.0";
				_1_8_0 -> "1.8.0";
				_3_0_0 -> "3.0.0";
				_3_0_1 -> "3.0.1";
				_3_0_2 -> "3.0.2";
				_3_3_0 -> "3.3.0";
				_3_5_0 -> "3.5.0";
				_4_0_0 -> "4.0.0";
				_4_0_1 -> "4.0.1";
				_4_1_0 -> "4.1.0";
				_4_2_0 -> "4.2.0";
				_4_4_0 -> "4.4.0";
				_4_5_0 -> "4.5.0";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): FHIRVersion? {
				if (codeString == null || "" == codeString) return null
				if ("0.01" == codeString) return _0_01
				if ("0.05" == codeString) return _0_05
				if ("0.06" == codeString) return _0_06
				if ("0.11" == codeString) return _0_11
				if ("0.0.80" == codeString) return _0_0_80
				if ("0.0.81" == codeString) return _0_0_81
				if ("0.0.82" == codeString) return _0_0_82
				if ("0.4.0" == codeString) return _0_4_0
				if ("0.5.0" == codeString) return _0_5_0
				if ("1.0.0" == codeString) return _1_0_0
				if ("1.0.1" == codeString) return _1_0_1
				if ("1.0.2" == codeString) return _1_0_2
				if ("1.1.0" == codeString) return _1_1_0
				if ("1.4.0" == codeString) return _1_4_0
				if ("1.6.0" == codeString) return _1_6_0
				if ("1.8.0" == codeString) return _1_8_0
				if ("3.0.0" == codeString) return _3_0_0
				if ("3.0.1" == codeString) return _3_0_1
				if ("3.0.2" == codeString) return _3_0_2
				if ("3.3.0" == codeString) return _3_3_0
				if ("3.5.0" == codeString) return _3_5_0
				if ("4.0.0" == codeString) return _4_0_0
				if ("4.0.1" == codeString) return _4_0_1
				if ("4.1.0" == codeString) return _4_1_0
				if ("4.2.0" == codeString) return _4_2_0
				if ("4.4.0" == codeString) return _4_4_0
				if ("4.5.0" == codeString) return _4_5_0
				throw FHIRException("Unknown FHIRVersion code '"$codeString"'")
			}
		}
// manual code from configuration.txt:
public String toCode(int len) {
          return toCode().substring(0, len);
        }

        public static boolean isR4Plus(String version) {
           return version != null && (version.startsWith("4.") || version.startsWith("5.") || "current".equals(version));
        }
        
       public static boolean isValidCode(String codeString) {
          if (codeString == null || "".equals(codeString))
              return false;
      if ("0.01".equals(codeString))
        return true;
      if ("0.05".equals(codeString))
        return true;
      if ("0.06".equals(codeString))
        return true;
      if ("0.11".equals(codeString))
        return true;
      if ("0.0.80".equals(codeString))
        return true;
      if ("0.0.81".equals(codeString))
        return true;
      if ("0.0.82".equals(codeString))
        return true;
      if ("0.4.0".equals(codeString))
        return true;
      if ("0.5.0".equals(codeString))
        return true;
      if ("1.0.0".equals(codeString))
        return true;
      if ("1.0.1".equals(codeString))
        return true;
      if ("1.0.2".equals(codeString))
        return true;
      if ("1.1.0".equals(codeString))
        return true;
      if ("1.4.0".equals(codeString))
        return true;
      if ("1.6.0".equals(codeString))
        return true;
      if ("1.8.0".equals(codeString))
        return true;
      if ("3.0.0".equals(codeString))
        return true;
      if ("3.0.1".equals(codeString))
        return true;
      if ("3.3.0".equals(codeString))
        return true;
      if ("3.5.0".equals(codeString))
        return true;
      if ("4.0.0".equals(codeString))
        return true;
      if ("4.2.0".equals(codeString))
        return true;
      return false;
      }

        @Override
        public String toString() {
          return toCode();
        }

    public boolean isR4B() {
        return toCode().startsWith("4.1");
    }

// end addition
	}

	class FHIRVersionEnumFactory : EnumFactory<FHIRVersion> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): FHIRVersion? {
			if (codeString == null || "" == codeString) return null
			if ("0.01" == codeString) return FHIRVersion._0_01
			if ("0.05" == codeString) return FHIRVersion._0_05
			if ("0.06" == codeString) return FHIRVersion._0_06
			if ("0.11" == codeString) return FHIRVersion._0_11
			if ("0.0.80" == codeString) return FHIRVersion._0_0_80
			if ("0.0.81" == codeString) return FHIRVersion._0_0_81
			if ("0.0.82" == codeString) return FHIRVersion._0_0_82
			if ("0.4.0" == codeString) return FHIRVersion._0_4_0
			if ("0.5.0" == codeString) return FHIRVersion._0_5_0
			if ("1.0.0" == codeString) return FHIRVersion._1_0_0
			if ("1.0.1" == codeString) return FHIRVersion._1_0_1
			if ("1.0.2" == codeString) return FHIRVersion._1_0_2
			if ("1.1.0" == codeString) return FHIRVersion._1_1_0
			if ("1.4.0" == codeString) return FHIRVersion._1_4_0
			if ("1.6.0" == codeString) return FHIRVersion._1_6_0
			if ("1.8.0" == codeString) return FHIRVersion._1_8_0
			if ("3.0.0" == codeString) return FHIRVersion._3_0_0
			if ("3.0.1" == codeString) return FHIRVersion._3_0_1
			if ("3.0.2" == codeString) return FHIRVersion._3_0_2
			if ("3.3.0" == codeString) return FHIRVersion._3_3_0
			if ("3.5.0" == codeString) return FHIRVersion._3_5_0
			if ("4.0.0" == codeString) return FHIRVersion._4_0_0
			if ("4.0.1" == codeString) return FHIRVersion._4_0_1
			if ("4.1.0" == codeString) return FHIRVersion._4_1_0
			if ("4.2.0" == codeString) return FHIRVersion._4_2_0
			if ("4.4.0" == codeString) return FHIRVersion._4_4_0
			if ("4.5.0" == codeString) return FHIRVersion._4_5_0
			throw IllegalArgumentException("Unknown FHIRVersion code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<FHIRVersion>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("0.01" == codeString) return new Enumeration(this, FHIRVersion._0_01)
			if ("0.05" == codeString) return new Enumeration(this, FHIRVersion._0_05)
			if ("0.06" == codeString) return new Enumeration(this, FHIRVersion._0_06)
			if ("0.11" == codeString) return new Enumeration(this, FHIRVersion._0_11)
			if ("0.0.80" == codeString) return new Enumeration(this, FHIRVersion._0_0_80)
			if ("0.0.81" == codeString) return new Enumeration(this, FHIRVersion._0_0_81)
			if ("0.0.82" == codeString) return new Enumeration(this, FHIRVersion._0_0_82)
			if ("0.4.0" == codeString) return new Enumeration(this, FHIRVersion._0_4_0)
			if ("0.5.0" == codeString) return new Enumeration(this, FHIRVersion._0_5_0)
			if ("1.0.0" == codeString) return new Enumeration(this, FHIRVersion._1_0_0)
			if ("1.0.1" == codeString) return new Enumeration(this, FHIRVersion._1_0_1)
			if ("1.0.2" == codeString) return new Enumeration(this, FHIRVersion._1_0_2)
			if ("1.1.0" == codeString) return new Enumeration(this, FHIRVersion._1_1_0)
			if ("1.4.0" == codeString) return new Enumeration(this, FHIRVersion._1_4_0)
			if ("1.6.0" == codeString) return new Enumeration(this, FHIRVersion._1_6_0)
			if ("1.8.0" == codeString) return new Enumeration(this, FHIRVersion._1_8_0)
			if ("3.0.0" == codeString) return new Enumeration(this, FHIRVersion._3_0_0)
			if ("3.0.1" == codeString) return new Enumeration(this, FHIRVersion._3_0_1)
			if ("3.0.2" == codeString) return new Enumeration(this, FHIRVersion._3_0_2)
			if ("3.3.0" == codeString) return new Enumeration(this, FHIRVersion._3_3_0)
			if ("3.5.0" == codeString) return new Enumeration(this, FHIRVersion._3_5_0)
			if ("4.0.0" == codeString) return new Enumeration(this, FHIRVersion._4_0_0)
			if ("4.0.1" == codeString) return new Enumeration(this, FHIRVersion._4_0_1)
			if ("4.1.0" == codeString) return new Enumeration(this, FHIRVersion._4_1_0)
			if ("4.2.0" == codeString) return new Enumeration(this, FHIRVersion._4_2_0)
			if ("4.4.0" == codeString) return new Enumeration(this, FHIRVersion._4_4_0)
			if ("4.5.0" == codeString) return new Enumeration(this, FHIRVersion._4_5_0)
			throw FHIRException("Unknown FHIRVersion code '$codeString'")
		}
		override fun toCode(code: FHIRVersion): String? {
			return when (code) {
				FHIRVersion._0_01 -> "0.01"
				FHIRVersion._0_05 -> "0.05"
				FHIRVersion._0_06 -> "0.06"
				FHIRVersion._0_11 -> "0.11"
				FHIRVersion._0_0_80 -> "0.0.80"
				FHIRVersion._0_0_81 -> "0.0.81"
				FHIRVersion._0_0_82 -> "0.0.82"
				FHIRVersion._0_4_0 -> "0.4.0"
				FHIRVersion._0_5_0 -> "0.5.0"
				FHIRVersion._1_0_0 -> "1.0.0"
				FHIRVersion._1_0_1 -> "1.0.1"
				FHIRVersion._1_0_2 -> "1.0.2"
				FHIRVersion._1_1_0 -> "1.1.0"
				FHIRVersion._1_4_0 -> "1.4.0"
				FHIRVersion._1_6_0 -> "1.6.0"
				FHIRVersion._1_8_0 -> "1.8.0"
				FHIRVersion._3_0_0 -> "3.0.0"
				FHIRVersion._3_0_1 -> "3.0.1"
				FHIRVersion._3_0_2 -> "3.0.2"
				FHIRVersion._3_3_0 -> "3.3.0"
				FHIRVersion._3_5_0 -> "3.5.0"
				FHIRVersion._4_0_0 -> "4.0.0"
				FHIRVersion._4_0_1 -> "4.0.1"
				FHIRVersion._4_1_0 -> "4.1.0"
				FHIRVersion._4_2_0 -> "4.2.0"
				FHIRVersion._4_4_0 -> "4.4.0"
				FHIRVersion._4_5_0 -> "4.5.0"
				NULL -> null
			}
		}
		override fun toSystem(code: FHIRVersion): String? {
			return code.system
		}
    }

	enum class FilterOperator {
		/**
		* The specified property of the code equals the provided value.
		*/
		EQUAL, 
		/**
		* Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).
		*/
		ISA, 
		/**
		* Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only).
		*/
		DESCENDENTOF, 
		/**
		* The specified property of the code does not have an is-a relationship with the provided value.
		*/
		ISNOTA, 
		/**
		* The specified property of the code  matches the regex specified in the provided value.
		*/
		REGEX, 
		/**
		* The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
		*/
		IN, 
		/**
		* The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
		*/
		NOTIN, 
		/**
		* Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).
		*/
		GENERALIZES, 
		/**
		* The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).
		*/
		EXISTS, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				EQUAL -> "="
				ISA -> "is-a"
				DESCENDENTOF -> "descendent-of"
				ISNOTA -> "is-not-a"
				REGEX -> "regex"
				IN -> "in"
				NOTIN -> "not-in"
				GENERALIZES -> "generalizes"
				EXISTS -> "exists"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				EQUAL -> "http://hl7.org/fhir/filter-operator"
				ISA -> "http://hl7.org/fhir/filter-operator"
				DESCENDENTOF -> "http://hl7.org/fhir/filter-operator"
				ISNOTA -> "http://hl7.org/fhir/filter-operator"
				REGEX -> "http://hl7.org/fhir/filter-operator"
				IN -> "http://hl7.org/fhir/filter-operator"
				NOTIN -> "http://hl7.org/fhir/filter-operator"
				GENERALIZES -> "http://hl7.org/fhir/filter-operator"
				EXISTS -> "http://hl7.org/fhir/filter-operator"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				EQUAL -> "The specified property of the code equals the provided value."
				ISA -> "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self)."
				DESCENDENTOF -> "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself i.e. include descendant codes only)."
				ISNOTA -> "The specified property of the code does not have an is-a relationship with the provided value."
				REGEX -> "The specified property of the code  matches the regex specified in the provided value."
				IN -> "The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list)."
				NOTIN -> "The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list)."
				GENERALIZES -> "Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self)."
				EXISTS -> "The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values)."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				EQUAL -> "Equals";
				ISA -> "Is A (by subsumption)";
				DESCENDENTOF -> "Descendent Of (by subsumption)";
				ISNOTA -> "Not (Is A) (by subsumption)";
				REGEX -> "Regular Expression";
				IN -> "In Set";
				NOTIN -> "Not in Set";
				GENERALIZES -> "Generalizes (by Subsumption)";
				EXISTS -> "Exists";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): FilterOperator? {
				if (codeString == null || "" == codeString) return null
				if ("=" == codeString) return EQUAL
				if ("is-a" == codeString) return ISA
				if ("descendent-of" == codeString) return DESCENDENTOF
				if ("is-not-a" == codeString) return ISNOTA
				if ("regex" == codeString) return REGEX
				if ("in" == codeString) return IN
				if ("not-in" == codeString) return NOTIN
				if ("generalizes" == codeString) return GENERALIZES
				if ("exists" == codeString) return EXISTS
				throw FHIRException("Unknown FilterOperator code '"$codeString"'")
			}
		}
	}

	class FilterOperatorEnumFactory : EnumFactory<FilterOperator> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): FilterOperator? {
			if (codeString == null || "" == codeString) return null
			if ("=" == codeString) return FilterOperator.EQUAL
			if ("is-a" == codeString) return FilterOperator.ISA
			if ("descendent-of" == codeString) return FilterOperator.DESCENDENTOF
			if ("is-not-a" == codeString) return FilterOperator.ISNOTA
			if ("regex" == codeString) return FilterOperator.REGEX
			if ("in" == codeString) return FilterOperator.IN
			if ("not-in" == codeString) return FilterOperator.NOTIN
			if ("generalizes" == codeString) return FilterOperator.GENERALIZES
			if ("exists" == codeString) return FilterOperator.EXISTS
			throw IllegalArgumentException("Unknown FilterOperator code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<FilterOperator>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("=" == codeString) return new Enumeration(this, FilterOperator.EQUAL)
			if ("is-a" == codeString) return new Enumeration(this, FilterOperator.ISA)
			if ("descendent-of" == codeString) return new Enumeration(this, FilterOperator.DESCENDENTOF)
			if ("is-not-a" == codeString) return new Enumeration(this, FilterOperator.ISNOTA)
			if ("regex" == codeString) return new Enumeration(this, FilterOperator.REGEX)
			if ("in" == codeString) return new Enumeration(this, FilterOperator.IN)
			if ("not-in" == codeString) return new Enumeration(this, FilterOperator.NOTIN)
			if ("generalizes" == codeString) return new Enumeration(this, FilterOperator.GENERALIZES)
			if ("exists" == codeString) return new Enumeration(this, FilterOperator.EXISTS)
			throw FHIRException("Unknown FilterOperator code '$codeString'")
		}
		override fun toCode(code: FilterOperator): String? {
			return when (code) {
				FilterOperator.EQUAL -> "="
				FilterOperator.ISA -> "is-a"
				FilterOperator.DESCENDENTOF -> "descendent-of"
				FilterOperator.ISNOTA -> "is-not-a"
				FilterOperator.REGEX -> "regex"
				FilterOperator.IN -> "in"
				FilterOperator.NOTIN -> "not-in"
				FilterOperator.GENERALIZES -> "generalizes"
				FilterOperator.EXISTS -> "exists"
				NULL -> null
			}
		}
		override fun toSystem(code: FilterOperator): String? {
			return code.system
		}
    }

	enum class FinancialResourceStatusCodes {
		/**
		* The instance is currently in-force.
		*/
		ACTIVE, 
		/**
		* The instance is withdrawn, rescinded or reversed.
		*/
		CANCELLED, 
		/**
		* A new instance the contents of which is not complete.
		*/
		DRAFT, 
		/**
		* The instance was entered in error.
		*/
		ENTEREDINERROR, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ACTIVE -> "active"
				CANCELLED -> "cancelled"
				DRAFT -> "draft"
				ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ACTIVE -> "http://hl7.org/fhir/fm-status"
				CANCELLED -> "http://hl7.org/fhir/fm-status"
				DRAFT -> "http://hl7.org/fhir/fm-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/fm-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ACTIVE -> "The instance is currently in-force."
				CANCELLED -> "The instance is withdrawn, rescinded or reversed."
				DRAFT -> "A new instance the contents of which is not complete."
				ENTEREDINERROR -> "The instance was entered in error."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ACTIVE -> "Active";
				CANCELLED -> "Cancelled";
				DRAFT -> "Draft";
				ENTEREDINERROR -> "Entered in Error";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): FinancialResourceStatusCodes? {
				if (codeString == null || "" == codeString) return null
				if ("active" == codeString) return ACTIVE
				if ("cancelled" == codeString) return CANCELLED
				if ("draft" == codeString) return DRAFT
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				throw FHIRException("Unknown FinancialResourceStatusCodes code '"$codeString"'")
			}
		}
	}

	class FinancialResourceStatusCodesEnumFactory : EnumFactory<FinancialResourceStatusCodes> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): FinancialResourceStatusCodes? {
			if (codeString == null || "" == codeString) return null
			if ("active" == codeString) return FinancialResourceStatusCodes.ACTIVE
			if ("cancelled" == codeString) return FinancialResourceStatusCodes.CANCELLED
			if ("draft" == codeString) return FinancialResourceStatusCodes.DRAFT
			if ("entered-in-error" == codeString) return FinancialResourceStatusCodes.ENTEREDINERROR
			throw IllegalArgumentException("Unknown FinancialResourceStatusCodes code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<FinancialResourceStatusCodes>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("active" == codeString) return new Enumeration(this, FinancialResourceStatusCodes.ACTIVE)
			if ("cancelled" == codeString) return new Enumeration(this, FinancialResourceStatusCodes.CANCELLED)
			if ("draft" == codeString) return new Enumeration(this, FinancialResourceStatusCodes.DRAFT)
			if ("entered-in-error" == codeString) return new Enumeration(this, FinancialResourceStatusCodes.ENTEREDINERROR)
			throw FHIRException("Unknown FinancialResourceStatusCodes code '$codeString'")
		}
		override fun toCode(code: FinancialResourceStatusCodes): String? {
			return when (code) {
				FinancialResourceStatusCodes.ACTIVE -> "active"
				FinancialResourceStatusCodes.CANCELLED -> "cancelled"
				FinancialResourceStatusCodes.DRAFT -> "draft"
				FinancialResourceStatusCodes.ENTEREDINERROR -> "entered-in-error"
				NULL -> null
			}
		}
		override fun toSystem(code: FinancialResourceStatusCodes): String? {
			return code.system
		}
    }

	enum class InvoicePriceComponentType {
		/**
		* the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.
		*/
		BASE, 
		/**
		* the amount is a surcharge applied on the base price.
		*/
		SURCHARGE, 
		/**
		* the amount is a deduction applied on the base price.
		*/
		DEDUCTION, 
		/**
		* the amount is a discount applied on the base price.
		*/
		DISCOUNT, 
		/**
		* the amount is the tax component of the total price.
		*/
		TAX, 
		/**
		* the amount is of informational character, it has not been applied in the calculation of the total price.
		*/
		INFORMATIONAL, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				BASE -> "base"
				SURCHARGE -> "surcharge"
				DEDUCTION -> "deduction"
				DISCOUNT -> "discount"
				TAX -> "tax"
				INFORMATIONAL -> "informational"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				BASE -> "http://hl7.org/fhir/invoice-priceComponentType"
				SURCHARGE -> "http://hl7.org/fhir/invoice-priceComponentType"
				DEDUCTION -> "http://hl7.org/fhir/invoice-priceComponentType"
				DISCOUNT -> "http://hl7.org/fhir/invoice-priceComponentType"
				TAX -> "http://hl7.org/fhir/invoice-priceComponentType"
				INFORMATIONAL -> "http://hl7.org/fhir/invoice-priceComponentType"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				BASE -> "the amount is the base price used for calculating the total price before applying surcharges, discount or taxes."
				SURCHARGE -> "the amount is a surcharge applied on the base price."
				DEDUCTION -> "the amount is a deduction applied on the base price."
				DISCOUNT -> "the amount is a discount applied on the base price."
				TAX -> "the amount is the tax component of the total price."
				INFORMATIONAL -> "the amount is of informational character, it has not been applied in the calculation of the total price."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				BASE -> "base price";
				SURCHARGE -> "surcharge";
				DEDUCTION -> "deduction";
				DISCOUNT -> "discount";
				TAX -> "tax";
				INFORMATIONAL -> "informational";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): InvoicePriceComponentType? {
				if (codeString == null || "" == codeString) return null
				if ("base" == codeString) return BASE
				if ("surcharge" == codeString) return SURCHARGE
				if ("deduction" == codeString) return DEDUCTION
				if ("discount" == codeString) return DISCOUNT
				if ("tax" == codeString) return TAX
				if ("informational" == codeString) return INFORMATIONAL
				throw FHIRException("Unknown InvoicePriceComponentType code '"$codeString"'")
			}
		}
	}

	class InvoicePriceComponentTypeEnumFactory : EnumFactory<InvoicePriceComponentType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): InvoicePriceComponentType? {
			if (codeString == null || "" == codeString) return null
			if ("base" == codeString) return InvoicePriceComponentType.BASE
			if ("surcharge" == codeString) return InvoicePriceComponentType.SURCHARGE
			if ("deduction" == codeString) return InvoicePriceComponentType.DEDUCTION
			if ("discount" == codeString) return InvoicePriceComponentType.DISCOUNT
			if ("tax" == codeString) return InvoicePriceComponentType.TAX
			if ("informational" == codeString) return InvoicePriceComponentType.INFORMATIONAL
			throw IllegalArgumentException("Unknown InvoicePriceComponentType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<InvoicePriceComponentType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("base" == codeString) return new Enumeration(this, InvoicePriceComponentType.BASE)
			if ("surcharge" == codeString) return new Enumeration(this, InvoicePriceComponentType.SURCHARGE)
			if ("deduction" == codeString) return new Enumeration(this, InvoicePriceComponentType.DEDUCTION)
			if ("discount" == codeString) return new Enumeration(this, InvoicePriceComponentType.DISCOUNT)
			if ("tax" == codeString) return new Enumeration(this, InvoicePriceComponentType.TAX)
			if ("informational" == codeString) return new Enumeration(this, InvoicePriceComponentType.INFORMATIONAL)
			throw FHIRException("Unknown InvoicePriceComponentType code '$codeString'")
		}
		override fun toCode(code: InvoicePriceComponentType): String? {
			return when (code) {
				InvoicePriceComponentType.BASE -> "base"
				InvoicePriceComponentType.SURCHARGE -> "surcharge"
				InvoicePriceComponentType.DEDUCTION -> "deduction"
				InvoicePriceComponentType.DISCOUNT -> "discount"
				InvoicePriceComponentType.TAX -> "tax"
				InvoicePriceComponentType.INFORMATIONAL -> "informational"
				NULL -> null
			}
		}
		override fun toSystem(code: InvoicePriceComponentType): String? {
			return code.system
		}
    }

	enum class ListMode {
		/**
		* This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes.
		*/
		WORKING, 
		/**
		* This list was prepared as a snapshot. It should not be assumed to be current.
		*/
		SNAPSHOT, 
		/**
		* A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter.
		*/
		CHANGES, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				WORKING -> "working"
				SNAPSHOT -> "snapshot"
				CHANGES -> "changes"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				WORKING -> "http://hl7.org/fhir/list-mode"
				SNAPSHOT -> "http://hl7.org/fhir/list-mode"
				CHANGES -> "http://hl7.org/fhir/list-mode"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				WORKING -> "This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes."
				SNAPSHOT -> "This list was prepared as a snapshot. It should not be assumed to be current."
				CHANGES -> "A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				WORKING -> "Working List";
				SNAPSHOT -> "Snapshot List";
				CHANGES -> "Change List";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ListMode? {
				if (codeString == null || "" == codeString) return null
				if ("working" == codeString) return WORKING
				if ("snapshot" == codeString) return SNAPSHOT
				if ("changes" == codeString) return CHANGES
				throw FHIRException("Unknown ListMode code '"$codeString"'")
			}
		}
	}

	class ListModeEnumFactory : EnumFactory<ListMode> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ListMode? {
			if (codeString == null || "" == codeString) return null
			if ("working" == codeString) return ListMode.WORKING
			if ("snapshot" == codeString) return ListMode.SNAPSHOT
			if ("changes" == codeString) return ListMode.CHANGES
			throw IllegalArgumentException("Unknown ListMode code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ListMode>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("working" == codeString) return new Enumeration(this, ListMode.WORKING)
			if ("snapshot" == codeString) return new Enumeration(this, ListMode.SNAPSHOT)
			if ("changes" == codeString) return new Enumeration(this, ListMode.CHANGES)
			throw FHIRException("Unknown ListMode code '$codeString'")
		}
		override fun toCode(code: ListMode): String? {
			return when (code) {
				ListMode.WORKING -> "working"
				ListMode.SNAPSHOT -> "snapshot"
				ListMode.CHANGES -> "changes"
				NULL -> null
			}
		}
		override fun toSystem(code: ListMode): String? {
			return code.system
		}
    }

	enum class MeasureImprovementNotation {
		/**
		* Improvement is indicated as an increase in the score or measurement (e.g. Higher score indicates better quality).
		*/
		INCREASE, 
		/**
		* Improvement is indicated as a decrease in the score or measurement (e.g. Lower score indicates better quality).
		*/
		DECREASE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				INCREASE -> "increase"
				DECREASE -> "decrease"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				INCREASE -> "http://terminology.hl7.org/CodeSystem/measure-improvement-notation"
				DECREASE -> "http://terminology.hl7.org/CodeSystem/measure-improvement-notation"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				INCREASE -> "Improvement is indicated as an increase in the score or measurement (e.g. Higher score indicates better quality)."
				DECREASE -> "Improvement is indicated as a decrease in the score or measurement (e.g. Lower score indicates better quality)."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				INCREASE -> "Increased score indicates improvement";
				DECREASE -> "Decreased score indicates improvement";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): MeasureImprovementNotation? {
				if (codeString == null || "" == codeString) return null
				if ("increase" == codeString) return INCREASE
				if ("decrease" == codeString) return DECREASE
				throw FHIRException("Unknown MeasureImprovementNotation code '"$codeString"'")
			}
		}
	}

	class MeasureImprovementNotationEnumFactory : EnumFactory<MeasureImprovementNotation> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): MeasureImprovementNotation? {
			if (codeString == null || "" == codeString) return null
			if ("increase" == codeString) return MeasureImprovementNotation.INCREASE
			if ("decrease" == codeString) return MeasureImprovementNotation.DECREASE
			throw IllegalArgumentException("Unknown MeasureImprovementNotation code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<MeasureImprovementNotation>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("increase" == codeString) return new Enumeration(this, MeasureImprovementNotation.INCREASE)
			if ("decrease" == codeString) return new Enumeration(this, MeasureImprovementNotation.DECREASE)
			throw FHIRException("Unknown MeasureImprovementNotation code '$codeString'")
		}
		override fun toCode(code: MeasureImprovementNotation): String? {
			return when (code) {
				MeasureImprovementNotation.INCREASE -> "increase"
				MeasureImprovementNotation.DECREASE -> "decrease"
				NULL -> null
			}
		}
		override fun toSystem(code: MeasureImprovementNotation): String? {
			return code.system
		}
    }

	enum class MimeTypes {
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): MimeTypes? {
				if (codeString == null || "" == codeString) return null
				throw FHIRException("Unknown MimeTypes code '"$codeString"'")
			}
		}
	}

	class MimeTypesEnumFactory : EnumFactory<MimeTypes> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): MimeTypes? {
			if (codeString == null || "" == codeString) return null
			throw IllegalArgumentException("Unknown MimeTypes code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<MimeTypes>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			throw FHIRException("Unknown MimeTypes code '$codeString'")
		}
		override fun toCode(code: MimeTypes): String? {
			return when (code) {
				NULL -> null
			}
		}
		override fun toSystem(code: MimeTypes): String? {
			return code.system
		}
    }

	enum class NoteType {
		/**
		* Display the note.
		*/
		DISPLAY, 
		/**
		* Print the note on the form.
		*/
		PRINT, 
		/**
		* Print the note for the operator.
		*/
		PRINTOPER, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				DISPLAY -> "display"
				PRINT -> "print"
				PRINTOPER -> "printoper"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				DISPLAY -> "http://hl7.org/fhir/note-type"
				PRINT -> "http://hl7.org/fhir/note-type"
				PRINTOPER -> "http://hl7.org/fhir/note-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				DISPLAY -> "Display the note."
				PRINT -> "Print the note on the form."
				PRINTOPER -> "Print the note for the operator."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				DISPLAY -> "Display";
				PRINT -> "Print (Form)";
				PRINTOPER -> "Print (Operator)";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): NoteType? {
				if (codeString == null || "" == codeString) return null
				if ("display" == codeString) return DISPLAY
				if ("print" == codeString) return PRINT
				if ("printoper" == codeString) return PRINTOPER
				throw FHIRException("Unknown NoteType code '"$codeString"'")
			}
		}
	}

	class NoteTypeEnumFactory : EnumFactory<NoteType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): NoteType? {
			if (codeString == null || "" == codeString) return null
			if ("display" == codeString) return NoteType.DISPLAY
			if ("print" == codeString) return NoteType.PRINT
			if ("printoper" == codeString) return NoteType.PRINTOPER
			throw IllegalArgumentException("Unknown NoteType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<NoteType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("display" == codeString) return new Enumeration(this, NoteType.DISPLAY)
			if ("print" == codeString) return new Enumeration(this, NoteType.PRINT)
			if ("printoper" == codeString) return new Enumeration(this, NoteType.PRINTOPER)
			throw FHIRException("Unknown NoteType code '$codeString'")
		}
		override fun toCode(code: NoteType): String? {
			return when (code) {
				NoteType.DISPLAY -> "display"
				NoteType.PRINT -> "print"
				NoteType.PRINTOPER -> "printoper"
				NULL -> null
			}
		}
		override fun toSystem(code: NoteType): String? {
			return code.system
		}
    }

	enum class ObservationStatus {
		/**
		* The existence of the observation is registered, but there is no result yet available.
		*/
		REGISTERED, 
		/**
		* This is an initial or interim observation: data may be incomplete or unverified.
		*/
		PRELIMINARY, 
		/**
		* The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.
		*/
		FINAL, 
		/**
		* Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
		*/
		AMENDED, 
		/**
		* Subsequent to being Final, the observation has been modified to correct an error in the test result.
		*/
		CORRECTED, 
		/**
		* The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
		*/
		CANCELLED, 
		/**
		* The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
		*/
		ENTEREDINERROR, 
		/**
		* The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
		*/
		UNKNOWN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				REGISTERED -> "registered"
				PRELIMINARY -> "preliminary"
				FINAL -> "final"
				AMENDED -> "amended"
				CORRECTED -> "corrected"
				CANCELLED -> "cancelled"
				ENTEREDINERROR -> "entered-in-error"
				UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				REGISTERED -> "http://hl7.org/fhir/observation-status"
				PRELIMINARY -> "http://hl7.org/fhir/observation-status"
				FINAL -> "http://hl7.org/fhir/observation-status"
				AMENDED -> "http://hl7.org/fhir/observation-status"
				CORRECTED -> "http://hl7.org/fhir/observation-status"
				CANCELLED -> "http://hl7.org/fhir/observation-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/observation-status"
				UNKNOWN -> "http://hl7.org/fhir/observation-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				REGISTERED -> "The existence of the observation is registered, but there is no result yet available."
				PRELIMINARY -> "This is an initial or interim observation: data may be incomplete or unverified."
				FINAL -> "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied."
				AMENDED -> "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections."
				CORRECTED -> "Subsequent to being Final, the observation has been modified to correct an error in the test result."
				CANCELLED -> "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\")."
				ENTEREDINERROR -> "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".)."
				UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				REGISTERED -> "Registered";
				PRELIMINARY -> "Preliminary";
				FINAL -> "Final";
				AMENDED -> "Amended";
				CORRECTED -> "Corrected";
				CANCELLED -> "Cancelled";
				ENTEREDINERROR -> "Entered in Error";
				UNKNOWN -> "Unknown";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ObservationStatus? {
				if (codeString == null || "" == codeString) return null
				if ("registered" == codeString) return REGISTERED
				if ("preliminary" == codeString) return PRELIMINARY
				if ("final" == codeString) return FINAL
				if ("amended" == codeString) return AMENDED
				if ("corrected" == codeString) return CORRECTED
				if ("cancelled" == codeString) return CANCELLED
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				if ("unknown" == codeString) return UNKNOWN
				throw FHIRException("Unknown ObservationStatus code '"$codeString"'")
			}
		}
	}

	class ObservationStatusEnumFactory : EnumFactory<ObservationStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ObservationStatus? {
			if (codeString == null || "" == codeString) return null
			if ("registered" == codeString) return ObservationStatus.REGISTERED
			if ("preliminary" == codeString) return ObservationStatus.PRELIMINARY
			if ("final" == codeString) return ObservationStatus.FINAL
			if ("amended" == codeString) return ObservationStatus.AMENDED
			if ("corrected" == codeString) return ObservationStatus.CORRECTED
			if ("cancelled" == codeString) return ObservationStatus.CANCELLED
			if ("entered-in-error" == codeString) return ObservationStatus.ENTEREDINERROR
			if ("unknown" == codeString) return ObservationStatus.UNKNOWN
			throw IllegalArgumentException("Unknown ObservationStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ObservationStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("registered" == codeString) return new Enumeration(this, ObservationStatus.REGISTERED)
			if ("preliminary" == codeString) return new Enumeration(this, ObservationStatus.PRELIMINARY)
			if ("final" == codeString) return new Enumeration(this, ObservationStatus.FINAL)
			if ("amended" == codeString) return new Enumeration(this, ObservationStatus.AMENDED)
			if ("corrected" == codeString) return new Enumeration(this, ObservationStatus.CORRECTED)
			if ("cancelled" == codeString) return new Enumeration(this, ObservationStatus.CANCELLED)
			if ("entered-in-error" == codeString) return new Enumeration(this, ObservationStatus.ENTEREDINERROR)
			if ("unknown" == codeString) return new Enumeration(this, ObservationStatus.UNKNOWN)
			throw FHIRException("Unknown ObservationStatus code '$codeString'")
		}
		override fun toCode(code: ObservationStatus): String? {
			return when (code) {
				ObservationStatus.REGISTERED -> "registered"
				ObservationStatus.PRELIMINARY -> "preliminary"
				ObservationStatus.FINAL -> "final"
				ObservationStatus.AMENDED -> "amended"
				ObservationStatus.CORRECTED -> "corrected"
				ObservationStatus.CANCELLED -> "cancelled"
				ObservationStatus.ENTEREDINERROR -> "entered-in-error"
				ObservationStatus.UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		override fun toSystem(code: ObservationStatus): String? {
			return code.system
		}
    }

	enum class OperationParameterUse {
		/**
		* This is an input parameter.
		*/
		IN, 
		/**
		* This is an output parameter.
		*/
		OUT, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				IN -> "in"
				OUT -> "out"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				IN -> "http://hl7.org/fhir/operation-parameter-use"
				OUT -> "http://hl7.org/fhir/operation-parameter-use"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				IN -> "This is an input parameter."
				OUT -> "This is an output parameter."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				IN -> "In";
				OUT -> "Out";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): OperationParameterUse? {
				if (codeString == null || "" == codeString) return null
				if ("in" == codeString) return IN
				if ("out" == codeString) return OUT
				throw FHIRException("Unknown OperationParameterUse code '"$codeString"'")
			}
		}
	}

	class OperationParameterUseEnumFactory : EnumFactory<OperationParameterUse> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): OperationParameterUse? {
			if (codeString == null || "" == codeString) return null
			if ("in" == codeString) return OperationParameterUse.IN
			if ("out" == codeString) return OperationParameterUse.OUT
			throw IllegalArgumentException("Unknown OperationParameterUse code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<OperationParameterUse>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("in" == codeString) return new Enumeration(this, OperationParameterUse.IN)
			if ("out" == codeString) return new Enumeration(this, OperationParameterUse.OUT)
			throw FHIRException("Unknown OperationParameterUse code '$codeString'")
		}
		override fun toCode(code: OperationParameterUse): String? {
			return when (code) {
				OperationParameterUse.IN -> "in"
				OperationParameterUse.OUT -> "out"
				NULL -> null
			}
		}
		override fun toSystem(code: OperationParameterUse): String? {
			return code.system
		}
    }

	enum class ParticipationStatus {
		/**
		* The participant has accepted the appointment.
		*/
		ACCEPTED, 
		/**
		* The participant has declined the appointment and will not participate in the appointment.
		*/
		DECLINED, 
		/**
		* The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
		*/
		TENTATIVE, 
		/**
		* The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
		*/
		NEEDSACTION, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ACCEPTED -> "accepted"
				DECLINED -> "declined"
				TENTATIVE -> "tentative"
				NEEDSACTION -> "needs-action"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ACCEPTED -> "http://hl7.org/fhir/participationstatus"
				DECLINED -> "http://hl7.org/fhir/participationstatus"
				TENTATIVE -> "http://hl7.org/fhir/participationstatus"
				NEEDSACTION -> "http://hl7.org/fhir/participationstatus"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ACCEPTED -> "The participant has accepted the appointment."
				DECLINED -> "The participant has declined the appointment and will not participate in the appointment."
				TENTATIVE -> "The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur."
				NEEDSACTION -> "The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ACCEPTED -> "Accepted";
				DECLINED -> "Declined";
				TENTATIVE -> "Tentative";
				NEEDSACTION -> "Needs Action";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ParticipationStatus? {
				if (codeString == null || "" == codeString) return null
				if ("accepted" == codeString) return ACCEPTED
				if ("declined" == codeString) return DECLINED
				if ("tentative" == codeString) return TENTATIVE
				if ("needs-action" == codeString) return NEEDSACTION
				throw FHIRException("Unknown ParticipationStatus code '"$codeString"'")
			}
		}
	}

	class ParticipationStatusEnumFactory : EnumFactory<ParticipationStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ParticipationStatus? {
			if (codeString == null || "" == codeString) return null
			if ("accepted" == codeString) return ParticipationStatus.ACCEPTED
			if ("declined" == codeString) return ParticipationStatus.DECLINED
			if ("tentative" == codeString) return ParticipationStatus.TENTATIVE
			if ("needs-action" == codeString) return ParticipationStatus.NEEDSACTION
			throw IllegalArgumentException("Unknown ParticipationStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ParticipationStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("accepted" == codeString) return new Enumeration(this, ParticipationStatus.ACCEPTED)
			if ("declined" == codeString) return new Enumeration(this, ParticipationStatus.DECLINED)
			if ("tentative" == codeString) return new Enumeration(this, ParticipationStatus.TENTATIVE)
			if ("needs-action" == codeString) return new Enumeration(this, ParticipationStatus.NEEDSACTION)
			throw FHIRException("Unknown ParticipationStatus code '$codeString'")
		}
		override fun toCode(code: ParticipationStatus): String? {
			return when (code) {
				ParticipationStatus.ACCEPTED -> "accepted"
				ParticipationStatus.DECLINED -> "declined"
				ParticipationStatus.TENTATIVE -> "tentative"
				ParticipationStatus.NEEDSACTION -> "needs-action"
				NULL -> null
			}
		}
		override fun toSystem(code: ParticipationStatus): String? {
			return code.system
		}
    }

	enum class PublicationStatus {
		/**
		* This resource is still under development and is not yet considered to be ready for normal use.
		*/
		DRAFT, 
		/**
		* This resource is ready for normal use.
		*/
		ACTIVE, 
		/**
		* This resource has been withdrawn or superseded and should no longer be used.
		*/
		RETIRED, 
		/**
		* The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
		*/
		UNKNOWN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				DRAFT -> "draft"
				ACTIVE -> "active"
				RETIRED -> "retired"
				UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				DRAFT -> "http://hl7.org/fhir/publication-status"
				ACTIVE -> "http://hl7.org/fhir/publication-status"
				RETIRED -> "http://hl7.org/fhir/publication-status"
				UNKNOWN -> "http://hl7.org/fhir/publication-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				DRAFT -> "This resource is still under development and is not yet considered to be ready for normal use."
				ACTIVE -> "This resource is ready for normal use."
				RETIRED -> "This resource has been withdrawn or superseded and should no longer be used."
				UNKNOWN -> "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				DRAFT -> "Draft";
				ACTIVE -> "Active";
				RETIRED -> "Retired";
				UNKNOWN -> "Unknown";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): PublicationStatus? {
				if (codeString == null || "" == codeString) return null
				if ("draft" == codeString) return DRAFT
				if ("active" == codeString) return ACTIVE
				if ("retired" == codeString) return RETIRED
				if ("unknown" == codeString) return UNKNOWN
				throw FHIRException("Unknown PublicationStatus code '"$codeString"'")
			}
		}
	}

	class PublicationStatusEnumFactory : EnumFactory<PublicationStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): PublicationStatus? {
			if (codeString == null || "" == codeString) return null
			if ("draft" == codeString) return PublicationStatus.DRAFT
			if ("active" == codeString) return PublicationStatus.ACTIVE
			if ("retired" == codeString) return PublicationStatus.RETIRED
			if ("unknown" == codeString) return PublicationStatus.UNKNOWN
			throw IllegalArgumentException("Unknown PublicationStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<PublicationStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("draft" == codeString) return new Enumeration(this, PublicationStatus.DRAFT)
			if ("active" == codeString) return new Enumeration(this, PublicationStatus.ACTIVE)
			if ("retired" == codeString) return new Enumeration(this, PublicationStatus.RETIRED)
			if ("unknown" == codeString) return new Enumeration(this, PublicationStatus.UNKNOWN)
			throw FHIRException("Unknown PublicationStatus code '$codeString'")
		}
		override fun toCode(code: PublicationStatus): String? {
			return when (code) {
				PublicationStatus.DRAFT -> "draft"
				PublicationStatus.ACTIVE -> "active"
				PublicationStatus.RETIRED -> "retired"
				PublicationStatus.UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		override fun toSystem(code: PublicationStatus): String? {
			return code.system
		}
    }

	enum class QuantityComparator {
		/**
		* The actual value is less than the given value.
		*/
		LESS_THAN, 
		/**
		* The actual value is less than or equal to the given value.
		*/
		LESS_OR_EQUAL, 
		/**
		* The actual value is greater than or equal to the given value.
		*/
		GREATER_OR_EQUAL, 
		/**
		* The actual value is greater than the given value.
		*/
		GREATER_THAN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				LESS_THAN -> "<"
				LESS_OR_EQUAL -> "<="
				GREATER_OR_EQUAL -> ">="
				GREATER_THAN -> ">"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				LESS_THAN -> "http://hl7.org/fhir/quantity-comparator"
				LESS_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
				GREATER_OR_EQUAL -> "http://hl7.org/fhir/quantity-comparator"
				GREATER_THAN -> "http://hl7.org/fhir/quantity-comparator"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				LESS_THAN -> "The actual value is less than the given value."
				LESS_OR_EQUAL -> "The actual value is less than or equal to the given value."
				GREATER_OR_EQUAL -> "The actual value is greater than or equal to the given value."
				GREATER_THAN -> "The actual value is greater than the given value."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				LESS_THAN -> "Less than";
				LESS_OR_EQUAL -> "Less or Equal to";
				GREATER_OR_EQUAL -> "Greater or Equal to";
				GREATER_THAN -> "Greater than";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): QuantityComparator? {
				if (codeString == null || "" == codeString) return null
				if ("<" == codeString) return LESS_THAN
				if ("<=" == codeString) return LESS_OR_EQUAL
				if (">=" == codeString) return GREATER_OR_EQUAL
				if (">" == codeString) return GREATER_THAN
				throw FHIRException("Unknown QuantityComparator code '"$codeString"'")
			}
		}
	}

	class QuantityComparatorEnumFactory : EnumFactory<QuantityComparator> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): QuantityComparator? {
			if (codeString == null || "" == codeString) return null
			if ("<" == codeString) return QuantityComparator.LESS_THAN
			if ("<=" == codeString) return QuantityComparator.LESS_OR_EQUAL
			if (">=" == codeString) return QuantityComparator.GREATER_OR_EQUAL
			if (">" == codeString) return QuantityComparator.GREATER_THAN
			throw IllegalArgumentException("Unknown QuantityComparator code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<QuantityComparator>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("<" == codeString) return new Enumeration(this, QuantityComparator.LESS_THAN)
			if ("<=" == codeString) return new Enumeration(this, QuantityComparator.LESS_OR_EQUAL)
			if (">=" == codeString) return new Enumeration(this, QuantityComparator.GREATER_OR_EQUAL)
			if (">" == codeString) return new Enumeration(this, QuantityComparator.GREATER_THAN)
			throw FHIRException("Unknown QuantityComparator code '$codeString'")
		}
		override fun toCode(code: QuantityComparator): String? {
			return when (code) {
				QuantityComparator.LESS_THAN -> "<"
				QuantityComparator.LESS_OR_EQUAL -> "<="
				QuantityComparator.GREATER_OR_EQUAL -> ">="
				QuantityComparator.GREATER_THAN -> ">"
				NULL -> null
			}
		}
		override fun toSystem(code: QuantityComparator): String? {
			return code.system
		}
    }

	enum class RequestIntent {
		/**
		* The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.
		*/
		PROPOSAL, 
		/**
		* The request represents an intention to ensure something occurs without providing an authorization for others to act.
		*/
		PLAN, 
		/**
		* The request represents a legally binding instruction authored by a Patient or RelatedPerson.
		*/
		DIRECTIVE, 
		/**
		* The request represents a request/demand and authorization for action by a Practitioner.
		*/
		ORDER, 
		/**
		* The request represents an original authorization for action.
		*/
		ORIGINALORDER, 
		/**
		* The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization.
		*/
		REFLEXORDER, 
		/**
		* The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
		*/
		FILLERORDER, 
		/**
		* An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
		*/
		INSTANCEORDER, 
		/**
		* The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used.
		*/
		OPTION, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				PROPOSAL -> "proposal"
				PLAN -> "plan"
				DIRECTIVE -> "directive"
				ORDER -> "order"
				ORIGINALORDER -> "original-order"
				REFLEXORDER -> "reflex-order"
				FILLERORDER -> "filler-order"
				INSTANCEORDER -> "instance-order"
				OPTION -> "option"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				PROPOSAL -> "http://hl7.org/fhir/request-intent"
				PLAN -> "http://hl7.org/fhir/request-intent"
				DIRECTIVE -> "http://hl7.org/fhir/request-intent"
				ORDER -> "http://hl7.org/fhir/request-intent"
				ORIGINALORDER -> "http://hl7.org/fhir/request-intent"
				REFLEXORDER -> "http://hl7.org/fhir/request-intent"
				FILLERORDER -> "http://hl7.org/fhir/request-intent"
				INSTANCEORDER -> "http://hl7.org/fhir/request-intent"
				OPTION -> "http://hl7.org/fhir/request-intent"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				PROPOSAL -> "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act."
				PLAN -> "The request represents an intention to ensure something occurs without providing an authorization for others to act."
				DIRECTIVE -> "The request represents a legally binding instruction authored by a Patient or RelatedPerson."
				ORDER -> "The request represents a request/demand and authorization for action by a Practitioner."
				ORIGINALORDER -> "The request represents an original authorization for action."
				REFLEXORDER -> "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization."
				FILLERORDER -> "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order."
				INSTANCEORDER -> "An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug."
				OPTION -> "The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestGroup]]] for additional information on how this status is used."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				PROPOSAL -> "Proposal";
				PLAN -> "Plan";
				DIRECTIVE -> "Directive";
				ORDER -> "Order";
				ORIGINALORDER -> "Original Order";
				REFLEXORDER -> "Reflex Order";
				FILLERORDER -> "Filler Order";
				INSTANCEORDER -> "Instance Order";
				OPTION -> "Option";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): RequestIntent? {
				if (codeString == null || "" == codeString) return null
				if ("proposal" == codeString) return PROPOSAL
				if ("plan" == codeString) return PLAN
				if ("directive" == codeString) return DIRECTIVE
				if ("order" == codeString) return ORDER
				if ("original-order" == codeString) return ORIGINALORDER
				if ("reflex-order" == codeString) return REFLEXORDER
				if ("filler-order" == codeString) return FILLERORDER
				if ("instance-order" == codeString) return INSTANCEORDER
				if ("option" == codeString) return OPTION
				throw FHIRException("Unknown RequestIntent code '"$codeString"'")
			}
		}
	}

	class RequestIntentEnumFactory : EnumFactory<RequestIntent> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): RequestIntent? {
			if (codeString == null || "" == codeString) return null
			if ("proposal" == codeString) return RequestIntent.PROPOSAL
			if ("plan" == codeString) return RequestIntent.PLAN
			if ("directive" == codeString) return RequestIntent.DIRECTIVE
			if ("order" == codeString) return RequestIntent.ORDER
			if ("original-order" == codeString) return RequestIntent.ORIGINALORDER
			if ("reflex-order" == codeString) return RequestIntent.REFLEXORDER
			if ("filler-order" == codeString) return RequestIntent.FILLERORDER
			if ("instance-order" == codeString) return RequestIntent.INSTANCEORDER
			if ("option" == codeString) return RequestIntent.OPTION
			throw IllegalArgumentException("Unknown RequestIntent code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<RequestIntent>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("proposal" == codeString) return new Enumeration(this, RequestIntent.PROPOSAL)
			if ("plan" == codeString) return new Enumeration(this, RequestIntent.PLAN)
			if ("directive" == codeString) return new Enumeration(this, RequestIntent.DIRECTIVE)
			if ("order" == codeString) return new Enumeration(this, RequestIntent.ORDER)
			if ("original-order" == codeString) return new Enumeration(this, RequestIntent.ORIGINALORDER)
			if ("reflex-order" == codeString) return new Enumeration(this, RequestIntent.REFLEXORDER)
			if ("filler-order" == codeString) return new Enumeration(this, RequestIntent.FILLERORDER)
			if ("instance-order" == codeString) return new Enumeration(this, RequestIntent.INSTANCEORDER)
			if ("option" == codeString) return new Enumeration(this, RequestIntent.OPTION)
			throw FHIRException("Unknown RequestIntent code '$codeString'")
		}
		override fun toCode(code: RequestIntent): String? {
			return when (code) {
				RequestIntent.PROPOSAL -> "proposal"
				RequestIntent.PLAN -> "plan"
				RequestIntent.DIRECTIVE -> "directive"
				RequestIntent.ORDER -> "order"
				RequestIntent.ORIGINALORDER -> "original-order"
				RequestIntent.REFLEXORDER -> "reflex-order"
				RequestIntent.FILLERORDER -> "filler-order"
				RequestIntent.INSTANCEORDER -> "instance-order"
				RequestIntent.OPTION -> "option"
				NULL -> null
			}
		}
		override fun toSystem(code: RequestIntent): String? {
			return code.system
		}
    }

	enum class RequestPriority {
		/**
		* The request has normal priority.
		*/
		ROUTINE, 
		/**
		* The request should be actioned promptly - higher priority than routine.
		*/
		URGENT, 
		/**
		* The request should be actioned as soon as possible - higher priority than urgent.
		*/
		ASAP, 
		/**
		* The request should be actioned immediately - highest possible priority.  E.g. an emergency.
		*/
		STAT, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ROUTINE -> "routine"
				URGENT -> "urgent"
				ASAP -> "asap"
				STAT -> "stat"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ROUTINE -> "http://hl7.org/fhir/request-priority"
				URGENT -> "http://hl7.org/fhir/request-priority"
				ASAP -> "http://hl7.org/fhir/request-priority"
				STAT -> "http://hl7.org/fhir/request-priority"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ROUTINE -> "The request has normal priority."
				URGENT -> "The request should be actioned promptly - higher priority than routine."
				ASAP -> "The request should be actioned as soon as possible - higher priority than urgent."
				STAT -> "The request should be actioned immediately - highest possible priority.  E.g. an emergency."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ROUTINE -> "Routine";
				URGENT -> "Urgent";
				ASAP -> "ASAP";
				STAT -> "STAT";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): RequestPriority? {
				if (codeString == null || "" == codeString) return null
				if ("routine" == codeString) return ROUTINE
				if ("urgent" == codeString) return URGENT
				if ("asap" == codeString) return ASAP
				if ("stat" == codeString) return STAT
				throw FHIRException("Unknown RequestPriority code '"$codeString"'")
			}
		}
	}

	class RequestPriorityEnumFactory : EnumFactory<RequestPriority> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): RequestPriority? {
			if (codeString == null || "" == codeString) return null
			if ("routine" == codeString) return RequestPriority.ROUTINE
			if ("urgent" == codeString) return RequestPriority.URGENT
			if ("asap" == codeString) return RequestPriority.ASAP
			if ("stat" == codeString) return RequestPriority.STAT
			throw IllegalArgumentException("Unknown RequestPriority code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<RequestPriority>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("routine" == codeString) return new Enumeration(this, RequestPriority.ROUTINE)
			if ("urgent" == codeString) return new Enumeration(this, RequestPriority.URGENT)
			if ("asap" == codeString) return new Enumeration(this, RequestPriority.ASAP)
			if ("stat" == codeString) return new Enumeration(this, RequestPriority.STAT)
			throw FHIRException("Unknown RequestPriority code '$codeString'")
		}
		override fun toCode(code: RequestPriority): String? {
			return when (code) {
				RequestPriority.ROUTINE -> "routine"
				RequestPriority.URGENT -> "urgent"
				RequestPriority.ASAP -> "asap"
				RequestPriority.STAT -> "stat"
				NULL -> null
			}
		}
		override fun toSystem(code: RequestPriority): String? {
			return code.system
		}
    }

	enum class RequestStatus {
		/**
		* The request has been created but is not yet complete or ready for action.
		*/
		DRAFT, 
		/**
		* The request is in force and ready to be acted upon.
		*/
		ACTIVE, 
		/**
		* The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.
		*/
		ONHOLD, 
		/**
		* The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur.
		*/
		REVOKED, 
		/**
		* The activity described by the request has been fully performed.  No further activity will occur.
		*/
		COMPLETED, 
		/**
		* This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
		*/
		ENTEREDINERROR, 
		/**
		* The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
		*/
		UNKNOWN, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				DRAFT -> "draft"
				ACTIVE -> "active"
				ONHOLD -> "on-hold"
				REVOKED -> "revoked"
				COMPLETED -> "completed"
				ENTEREDINERROR -> "entered-in-error"
				UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				DRAFT -> "http://hl7.org/fhir/request-status"
				ACTIVE -> "http://hl7.org/fhir/request-status"
				ONHOLD -> "http://hl7.org/fhir/request-status"
				REVOKED -> "http://hl7.org/fhir/request-status"
				COMPLETED -> "http://hl7.org/fhir/request-status"
				ENTEREDINERROR -> "http://hl7.org/fhir/request-status"
				UNKNOWN -> "http://hl7.org/fhir/request-status"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				DRAFT -> "The request has been created but is not yet complete or ready for action."
				ACTIVE -> "The request is in force and ready to be acted upon."
				ONHOLD -> "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future."
				REVOKED -> "The request (and any implicit authorization to act) has been terminated prior to the known full completion of the intended actions.  No further activity should occur."
				COMPLETED -> "The activity described by the request has been fully performed.  No further activity will occur."
				ENTEREDINERROR -> "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".)."
				UNKNOWN -> "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				DRAFT -> "Draft";
				ACTIVE -> "Active";
				ONHOLD -> "On Hold";
				REVOKED -> "Revoked";
				COMPLETED -> "Completed";
				ENTEREDINERROR -> "Entered in Error";
				UNKNOWN -> "Unknown";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): RequestStatus? {
				if (codeString == null || "" == codeString) return null
				if ("draft" == codeString) return DRAFT
				if ("active" == codeString) return ACTIVE
				if ("on-hold" == codeString) return ONHOLD
				if ("revoked" == codeString) return REVOKED
				if ("completed" == codeString) return COMPLETED
				if ("entered-in-error" == codeString) return ENTEREDINERROR
				if ("unknown" == codeString) return UNKNOWN
				throw FHIRException("Unknown RequestStatus code '"$codeString"'")
			}
		}
	}

	class RequestStatusEnumFactory : EnumFactory<RequestStatus> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): RequestStatus? {
			if (codeString == null || "" == codeString) return null
			if ("draft" == codeString) return RequestStatus.DRAFT
			if ("active" == codeString) return RequestStatus.ACTIVE
			if ("on-hold" == codeString) return RequestStatus.ONHOLD
			if ("revoked" == codeString) return RequestStatus.REVOKED
			if ("completed" == codeString) return RequestStatus.COMPLETED
			if ("entered-in-error" == codeString) return RequestStatus.ENTEREDINERROR
			if ("unknown" == codeString) return RequestStatus.UNKNOWN
			throw IllegalArgumentException("Unknown RequestStatus code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<RequestStatus>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("draft" == codeString) return new Enumeration(this, RequestStatus.DRAFT)
			if ("active" == codeString) return new Enumeration(this, RequestStatus.ACTIVE)
			if ("on-hold" == codeString) return new Enumeration(this, RequestStatus.ONHOLD)
			if ("revoked" == codeString) return new Enumeration(this, RequestStatus.REVOKED)
			if ("completed" == codeString) return new Enumeration(this, RequestStatus.COMPLETED)
			if ("entered-in-error" == codeString) return new Enumeration(this, RequestStatus.ENTEREDINERROR)
			if ("unknown" == codeString) return new Enumeration(this, RequestStatus.UNKNOWN)
			throw FHIRException("Unknown RequestStatus code '$codeString'")
		}
		override fun toCode(code: RequestStatus): String? {
			return when (code) {
				RequestStatus.DRAFT -> "draft"
				RequestStatus.ACTIVE -> "active"
				RequestStatus.ONHOLD -> "on-hold"
				RequestStatus.REVOKED -> "revoked"
				RequestStatus.COMPLETED -> "completed"
				RequestStatus.ENTEREDINERROR -> "entered-in-error"
				RequestStatus.UNKNOWN -> "unknown"
				NULL -> null
			}
		}
		override fun toSystem(code: RequestStatus): String? {
			return code.system
		}
    }

	enum class ResourceTypeEnum {
		/**
		* A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
		*/
		ACCOUNT, 
		/**
		* This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
		*/
		ACTIVITYDEFINITION, 
		/**
		* A pharmaceutical product described in terms of its composition and dose form.
		*/
		ADMINISTRABLEPRODUCTDEFINITION, 
		/**
		* An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research subject.  The unintended effects may require additional monitoring, treatment or hospitalization or may result in death.  The AdverseEvent resource also extends to potential or avoided events that could have had such effects.
		*/
		ADVERSEEVENT, 
		/**
		* Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
		*/
		ALLERGYINTOLERANCE, 
		/**
		* A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
		*/
		APPOINTMENT, 
		/**
		* A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
		*/
		APPOINTMENTRESPONSE, 
		/**
		* A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
		*/
		AUDITEVENT, 
		/**
		* Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
		*/
		BASIC, 
		/**
		* A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
		*/
		BINARY, 
		/**
		* A material substance originating from a biological entity intended to be transplanted or infused
into another (possibly the same) biological entity.
		*/
		BIOLOGICALLYDERIVEDPRODUCT, 
		/**
		* Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
		*/
		BODYSTRUCTURE, 
		/**
		* A container for a collection of resources.
		*/
		BUNDLE, 
		/**
		* A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		CAPABILITYSTATEMENT, 
		/**
		* A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		CAPABILITYSTATEMENT2, 
		/**
		* Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
		*/
		CAREPLAN, 
		/**
		* The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.
		*/
		CARETEAM, 
		/**
		* Catalog entries are wrappers that contextualize items included in a catalog.
		*/
		CATALOGENTRY, 
		/**
		* The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
		*/
		CHARGEITEM, 
		/**
		* The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
		*/
		CHARGEITEMDEFINITION, 
		/**
		* The Citation.
		*/
		CITATION, 
		/**
		* A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
		*/
		CLAIM, 
		/**
		* This resource provides the adjudication details from the processing of a Claim resource.
		*/
		CLAIMRESPONSE, 
		/**
		* A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
		*/
		CLINICALIMPRESSION, 
		/**
		* A single usage issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.
		*/
		CLINICALUSEISSUE, 
		/**
		* The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
		*/
		CODESYSTEM, 
		/**
		* A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
		*/
		COMMUNICATION, 
		/**
		* A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
		*/
		COMMUNICATIONREQUEST, 
		/**
		* A compartment definition that defines how resources are accessed on a server.
		*/
		COMPARTMENTDEFINITION, 
		/**
		* A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
		*/
		COMPOSITION, 
		/**
		* A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
		*/
		CONCEPTMAP, 
		/**
		* A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
		*/
		CONDITION, 
		/**
		* A definition of a condition and information relevant to managing it.
		*/
		CONDITIONDEFINITION, 
		/**
		* A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
		*/
		CONSENT, 
		/**
		* Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
		*/
		CONTRACT, 
		/**
		* Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
		*/
		COVERAGE, 
		/**
		* The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
		*/
		COVERAGEELIGIBILITYREQUEST, 
		/**
		* This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
		*/
		COVERAGEELIGIBILITYRESPONSE, 
		/**
		* Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
		*/
		DETECTEDISSUE, 
		/**
		* A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
		*/
		DEVICE, 
		/**
		* The characteristics, operational status and capabilities of a medical-related component of a medical device.
		*/
		DEVICEDEFINITION, 
		/**
		* Describes a measurement, calculation or setting capability of a medical device.
		*/
		DEVICEMETRIC, 
		/**
		* Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
		*/
		DEVICEREQUEST, 
		/**
		* A record of a device being used by a patient where the record is the result of a report from the patient or a clinician.
		*/
		DEVICEUSESTATEMENT, 
		/**
		* The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
		*/
		DIAGNOSTICREPORT, 
		/**
		* A collection of documents compiled for a purpose together with metadata that applies to the collection.
		*/
		DOCUMENTMANIFEST, 
		/**
		* A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this "document" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
		*/
		DOCUMENTREFERENCE, 
		/**
		* A resource that includes narrative, extensions, and contained resources.
		*/
		DOMAINRESOURCE, 
		/**
		* An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
		*/
		ENCOUNTER, 
		/**
		* The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
		*/
		ENDPOINT, 
		/**
		* This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
		*/
		ENROLLMENTREQUEST, 
		/**
		* This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
		*/
		ENROLLMENTRESPONSE, 
		/**
		* An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
		*/
		EPISODEOFCARE, 
		/**
		* The EventDefinition resource provides a reusable description of when a particular event can occur.
		*/
		EVENTDEFINITION, 
		/**
		* This represents statistics, certainty, both the intended and actual population, and evidence variables.
		*/
		EVIDENCE, 
		/**
		* The EvidenceReport.
		*/
		EVIDENCEREPORT, 
		/**
		* The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
		*/
		EVIDENCEVARIABLE, 
		/**
		* Example of workflow instance.
		*/
		EXAMPLESCENARIO, 
		/**
		* This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
		*/
		EXPLANATIONOFBENEFIT, 
		/**
		* Significant health conditions for a person related to the patient relevant in the context of care for the patient.
		*/
		FAMILYMEMBERHISTORY, 
		/**
		* Prospective warnings of potential issues when providing care to the patient.
		*/
		FLAG, 
		/**
		* Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
		*/
		GOAL, 
		/**
		* A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
		*/
		GRAPHDEFINITION, 
		/**
		* Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
		*/
		GROUP, 
		/**
		* A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
		*/
		GUIDANCERESPONSE, 
		/**
		* The details of a healthcare service available at a location.
		*/
		HEALTHCARESERVICE, 
		/**
		* Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
		*/
		IMAGINGSTUDY, 
		/**
		* Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
		*/
		IMMUNIZATION, 
		/**
		* Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
		*/
		IMMUNIZATIONEVALUATION, 
		/**
		* A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
		*/
		IMMUNIZATIONRECOMMENDATION, 
		/**
		* A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
		*/
		IMPLEMENTATIONGUIDE, 
		/**
		* An ingredient of a manufactured item or pharmaceutical product.
		*/
		INGREDIENT, 
		/**
		* Details of a Health Insurance product/plan provided by an organization.
		*/
		INSURANCEPLAN, 
		/**
		* Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
		*/
		INVOICE, 
		/**
		* The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
		*/
		LIBRARY, 
		/**
		* Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
		*/
		LINKAGE, 
		/**
		* A list is a curated collection of resources.
		*/
		LIST, 
		/**
		* Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
		*/
		LOCATION, 
		/**
		* The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
		*/
		MANUFACTUREDITEMDEFINITION, 
		/**
		* The Measure resource provides the definition of a quality measure.
		*/
		MEASURE, 
		/**
		* The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
		*/
		MEASUREREPORT, 
		/**
		* This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
		*/
		MEDICATION, 
		/**
		* Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
		*/
		MEDICATIONADMINISTRATION, 
		/**
		* Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
		*/
		MEDICATIONDISPENSE, 
		/**
		* Information about a medication that is used to support knowledge.
		*/
		MEDICATIONKNOWLEDGE, 
		/**
		* An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
		*/
		MEDICATIONREQUEST, 
		/**
		* A record of a medication that is being consumed by a patient.   A MedicationUsage may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 

The primary difference between a medicationusage and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationusage is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Usage information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
		*/
		MEDICATIONUSAGE, 
		/**
		* Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
		*/
		MEDICINALPRODUCTDEFINITION, 
		/**
		* Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
		*/
		MESSAGEDEFINITION, 
		/**
		* The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
		*/
		MESSAGEHEADER, 
		/**
		* Raw data describing a biological sequence.
		*/
		MOLECULARSEQUENCE, 
		/**
		* A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
		*/
		NAMINGSYSTEM, 
		/**
		* A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.
		*/
		NUTRITIONINTAKE, 
		/**
		* A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
		*/
		NUTRITIONORDER, 
		/**
		* A food or fluid product that is consumed by patients.
		*/
		NUTRITIONPRODUCT, 
		/**
		* Measurements and simple assertions made about a patient, device or other subject.
		*/
		OBSERVATION, 
		/**
		* Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
		*/
		OBSERVATIONDEFINITION, 
		/**
		* A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
		*/
		OPERATIONDEFINITION, 
		/**
		* A collection of error, warning, or information messages that result from a system action.
		*/
		OPERATIONOUTCOME, 
		/**
		* A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
		*/
		ORGANIZATION, 
		/**
		* Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
		*/
		ORGANIZATIONAFFILIATION, 
		/**
		* A medically related item or items, in a container or package.
		*/
		PACKAGEDPRODUCTDEFINITION, 
		/**
		* This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.
		*/
		PARAMETERS, 
		/**
		* Demographics and other administrative information about an individual or animal receiving care or other health-related services.
		*/
		PATIENT, 
		/**
		* This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
		*/
		PAYMENTNOTICE, 
		/**
		* This resource provides the details including amount of a payment and allocates the payment items being paid.
		*/
		PAYMENTRECONCILIATION, 
		/**
		* Permission.
		*/
		PERMISSION, 
		/**
		* Demographics and administrative information about a person independent of a specific health-related context.
		*/
		PERSON, 
		/**
		* This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
		*/
		PLANDEFINITION, 
		/**
		* A person who is directly or indirectly involved in the provisioning of healthcare.
		*/
		PRACTITIONER, 
		/**
		* A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
		*/
		PRACTITIONERROLE, 
		/**
		* An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
		*/
		PROCEDURE, 
		/**
		* Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
		*/
		PROVENANCE, 
		/**
		* A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
		*/
		QUESTIONNAIRE, 
		/**
		* A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
		*/
		QUESTIONNAIRERESPONSE, 
		/**
		* The regulatory authorization of a medicinal product, device or process.
		*/
		REGULATEDAUTHORIZATION, 
		/**
		* Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
		*/
		RELATEDPERSON, 
		/**
		* A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
		*/
		REQUESTGROUP, 
		/**
		* A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
		*/
		RESEARCHSTUDY, 
		/**
		* A physical entity which is the primary unit of operational and/or administrative interest in a study.
		*/
		RESEARCHSUBJECT, 
		/**
		* This is the base resource type for everything.
		*/
		RESOURCE, 
		/**
		* An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
		*/
		RISKASSESSMENT, 
		/**
		* A container for slots of time that may be available for booking appointments.
		*/
		SCHEDULE, 
		/**
		* A search parameter that defines a named search item that can be used to search/filter on a resource.
		*/
		SEARCHPARAMETER, 
		/**
		* A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
		*/
		SERVICEREQUEST, 
		/**
		* A slot of time on a schedule that may be available for booking appointments.
		*/
		SLOT, 
		/**
		* A sample to be used for analysis.
		*/
		SPECIMEN, 
		/**
		* A kind of specimen with associated set of requirements.
		*/
		SPECIMENDEFINITION, 
		/**
		* A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
		*/
		STRUCTUREDEFINITION, 
		/**
		* A Map of relationships between 2 structures that can be used to transform data.
		*/
		STRUCTUREMAP, 
		/**
		* The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
		*/
		SUBSCRIPTION, 
		/**
		* The SubscriptionStatus resource describes the state of a Subscription during notifications.
		*/
		SUBSCRIPTIONSTATUS, 
		/**
		* Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.
		*/
		SUBSCRIPTIONTOPIC, 
		/**
		* A homogeneous material with a definite composition.
		*/
		SUBSTANCE, 
		/**
		* The detailed description of a substance, typically at a level beyond what is used for prescribing.
		*/
		SUBSTANCEDEFINITION, 
		/**
		* Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
		*/
		SUBSTANCENUCLEICACID, 
		/**
		* Properties of a substance specific to it being a polymer.
		*/
		SUBSTANCEPOLYMER, 
		/**
		* A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
		*/
		SUBSTANCEPROTEIN, 
		/**
		* Todo.
		*/
		SUBSTANCEREFERENCEINFORMATION, 
		/**
		* Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
		*/
		SUBSTANCESOURCEMATERIAL, 
		/**
		* Record of delivery of what is supplied.
		*/
		SUPPLYDELIVERY, 
		/**
		* A record of a request for a medication, substance or device used in the healthcare setting.
		*/
		SUPPLYREQUEST, 
		/**
		* A task to be performed.
		*/
		TASK, 
		/**
		* A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
		*/
		TERMINOLOGYCAPABILITIES, 
		/**
		* A summary of information based on the results of executing a TestScript.
		*/
		TESTREPORT, 
		/**
		* A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
		*/
		TESTSCRIPT, 
		/**
		* A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
		*/
		VALUESET, 
		/**
		* Describes validation requirements, source(s), status and dates for one or more elements.
		*/
		VERIFICATIONRESULT, 
		/**
		* An authorization for the provision of glasses and/or contact lenses to a patient.
		*/
		VISIONPRESCRIPTION, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				ACCOUNT -> "Account"
				ACTIVITYDEFINITION -> "ActivityDefinition"
				ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition"
				ADVERSEEVENT -> "AdverseEvent"
				ALLERGYINTOLERANCE -> "AllergyIntolerance"
				APPOINTMENT -> "Appointment"
				APPOINTMENTRESPONSE -> "AppointmentResponse"
				AUDITEVENT -> "AuditEvent"
				BASIC -> "Basic"
				BINARY -> "Binary"
				BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct"
				BODYSTRUCTURE -> "BodyStructure"
				BUNDLE -> "Bundle"
				CAPABILITYSTATEMENT -> "CapabilityStatement"
				CAPABILITYSTATEMENT2 -> "CapabilityStatement2"
				CAREPLAN -> "CarePlan"
				CARETEAM -> "CareTeam"
				CATALOGENTRY -> "CatalogEntry"
				CHARGEITEM -> "ChargeItem"
				CHARGEITEMDEFINITION -> "ChargeItemDefinition"
				CITATION -> "Citation"
				CLAIM -> "Claim"
				CLAIMRESPONSE -> "ClaimResponse"
				CLINICALIMPRESSION -> "ClinicalImpression"
				CLINICALUSEISSUE -> "ClinicalUseIssue"
				CODESYSTEM -> "CodeSystem"
				COMMUNICATION -> "Communication"
				COMMUNICATIONREQUEST -> "CommunicationRequest"
				COMPARTMENTDEFINITION -> "CompartmentDefinition"
				COMPOSITION -> "Composition"
				CONCEPTMAP -> "ConceptMap"
				CONDITION -> "Condition"
				CONDITIONDEFINITION -> "ConditionDefinition"
				CONSENT -> "Consent"
				CONTRACT -> "Contract"
				COVERAGE -> "Coverage"
				COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest"
				COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse"
				DETECTEDISSUE -> "DetectedIssue"
				DEVICE -> "Device"
				DEVICEDEFINITION -> "DeviceDefinition"
				DEVICEMETRIC -> "DeviceMetric"
				DEVICEREQUEST -> "DeviceRequest"
				DEVICEUSESTATEMENT -> "DeviceUseStatement"
				DIAGNOSTICREPORT -> "DiagnosticReport"
				DOCUMENTMANIFEST -> "DocumentManifest"
				DOCUMENTREFERENCE -> "DocumentReference"
				DOMAINRESOURCE -> "DomainResource"
				ENCOUNTER -> "Encounter"
				ENDPOINT -> "Endpoint"
				ENROLLMENTREQUEST -> "EnrollmentRequest"
				ENROLLMENTRESPONSE -> "EnrollmentResponse"
				EPISODEOFCARE -> "EpisodeOfCare"
				EVENTDEFINITION -> "EventDefinition"
				EVIDENCE -> "Evidence"
				EVIDENCEREPORT -> "EvidenceReport"
				EVIDENCEVARIABLE -> "EvidenceVariable"
				EXAMPLESCENARIO -> "ExampleScenario"
				EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit"
				FAMILYMEMBERHISTORY -> "FamilyMemberHistory"
				FLAG -> "Flag"
				GOAL -> "Goal"
				GRAPHDEFINITION -> "GraphDefinition"
				GROUP -> "Group"
				GUIDANCERESPONSE -> "GuidanceResponse"
				HEALTHCARESERVICE -> "HealthcareService"
				IMAGINGSTUDY -> "ImagingStudy"
				IMMUNIZATION -> "Immunization"
				IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation"
				IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation"
				IMPLEMENTATIONGUIDE -> "ImplementationGuide"
				INGREDIENT -> "Ingredient"
				INSURANCEPLAN -> "InsurancePlan"
				INVOICE -> "Invoice"
				LIBRARY -> "Library"
				LINKAGE -> "Linkage"
				LIST -> "List"
				LOCATION -> "Location"
				MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition"
				MEASURE -> "Measure"
				MEASUREREPORT -> "MeasureReport"
				MEDICATION -> "Medication"
				MEDICATIONADMINISTRATION -> "MedicationAdministration"
				MEDICATIONDISPENSE -> "MedicationDispense"
				MEDICATIONKNOWLEDGE -> "MedicationKnowledge"
				MEDICATIONREQUEST -> "MedicationRequest"
				MEDICATIONUSAGE -> "MedicationUsage"
				MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition"
				MESSAGEDEFINITION -> "MessageDefinition"
				MESSAGEHEADER -> "MessageHeader"
				MOLECULARSEQUENCE -> "MolecularSequence"
				NAMINGSYSTEM -> "NamingSystem"
				NUTRITIONINTAKE -> "NutritionIntake"
				NUTRITIONORDER -> "NutritionOrder"
				NUTRITIONPRODUCT -> "NutritionProduct"
				OBSERVATION -> "Observation"
				OBSERVATIONDEFINITION -> "ObservationDefinition"
				OPERATIONDEFINITION -> "OperationDefinition"
				OPERATIONOUTCOME -> "OperationOutcome"
				ORGANIZATION -> "Organization"
				ORGANIZATIONAFFILIATION -> "OrganizationAffiliation"
				PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition"
				PARAMETERS -> "Parameters"
				PATIENT -> "Patient"
				PAYMENTNOTICE -> "PaymentNotice"
				PAYMENTRECONCILIATION -> "PaymentReconciliation"
				PERMISSION -> "Permission"
				PERSON -> "Person"
				PLANDEFINITION -> "PlanDefinition"
				PRACTITIONER -> "Practitioner"
				PRACTITIONERROLE -> "PractitionerRole"
				PROCEDURE -> "Procedure"
				PROVENANCE -> "Provenance"
				QUESTIONNAIRE -> "Questionnaire"
				QUESTIONNAIRERESPONSE -> "QuestionnaireResponse"
				REGULATEDAUTHORIZATION -> "RegulatedAuthorization"
				RELATEDPERSON -> "RelatedPerson"
				REQUESTGROUP -> "RequestGroup"
				RESEARCHSTUDY -> "ResearchStudy"
				RESEARCHSUBJECT -> "ResearchSubject"
				RESOURCE -> "Resource"
				RISKASSESSMENT -> "RiskAssessment"
				SCHEDULE -> "Schedule"
				SEARCHPARAMETER -> "SearchParameter"
				SERVICEREQUEST -> "ServiceRequest"
				SLOT -> "Slot"
				SPECIMEN -> "Specimen"
				SPECIMENDEFINITION -> "SpecimenDefinition"
				STRUCTUREDEFINITION -> "StructureDefinition"
				STRUCTUREMAP -> "StructureMap"
				SUBSCRIPTION -> "Subscription"
				SUBSCRIPTIONSTATUS -> "SubscriptionStatus"
				SUBSCRIPTIONTOPIC -> "SubscriptionTopic"
				SUBSTANCE -> "Substance"
				SUBSTANCEDEFINITION -> "SubstanceDefinition"
				SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid"
				SUBSTANCEPOLYMER -> "SubstancePolymer"
				SUBSTANCEPROTEIN -> "SubstanceProtein"
				SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation"
				SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial"
				SUPPLYDELIVERY -> "SupplyDelivery"
				SUPPLYREQUEST -> "SupplyRequest"
				TASK -> "Task"
				TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities"
				TESTREPORT -> "TestReport"
				TESTSCRIPT -> "TestScript"
				VALUESET -> "ValueSet"
				VERIFICATIONRESULT -> "VerificationResult"
				VISIONPRESCRIPTION -> "VisionPrescription"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				ACCOUNT -> "http://hl7.org/fhir/resource-types"
				ACTIVITYDEFINITION -> "http://hl7.org/fhir/resource-types"
				ADMINISTRABLEPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				ADVERSEEVENT -> "http://hl7.org/fhir/resource-types"
				ALLERGYINTOLERANCE -> "http://hl7.org/fhir/resource-types"
				APPOINTMENT -> "http://hl7.org/fhir/resource-types"
				APPOINTMENTRESPONSE -> "http://hl7.org/fhir/resource-types"
				AUDITEVENT -> "http://hl7.org/fhir/resource-types"
				BASIC -> "http://hl7.org/fhir/resource-types"
				BINARY -> "http://hl7.org/fhir/resource-types"
				BIOLOGICALLYDERIVEDPRODUCT -> "http://hl7.org/fhir/resource-types"
				BODYSTRUCTURE -> "http://hl7.org/fhir/resource-types"
				BUNDLE -> "http://hl7.org/fhir/resource-types"
				CAPABILITYSTATEMENT -> "http://hl7.org/fhir/resource-types"
				CAPABILITYSTATEMENT2 -> "http://hl7.org/fhir/resource-types"
				CAREPLAN -> "http://hl7.org/fhir/resource-types"
				CARETEAM -> "http://hl7.org/fhir/resource-types"
				CATALOGENTRY -> "http://hl7.org/fhir/resource-types"
				CHARGEITEM -> "http://hl7.org/fhir/resource-types"
				CHARGEITEMDEFINITION -> "http://hl7.org/fhir/resource-types"
				CITATION -> "http://hl7.org/fhir/resource-types"
				CLAIM -> "http://hl7.org/fhir/resource-types"
				CLAIMRESPONSE -> "http://hl7.org/fhir/resource-types"
				CLINICALIMPRESSION -> "http://hl7.org/fhir/resource-types"
				CLINICALUSEISSUE -> "http://hl7.org/fhir/resource-types"
				CODESYSTEM -> "http://hl7.org/fhir/resource-types"
				COMMUNICATION -> "http://hl7.org/fhir/resource-types"
				COMMUNICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
				COMPARTMENTDEFINITION -> "http://hl7.org/fhir/resource-types"
				COMPOSITION -> "http://hl7.org/fhir/resource-types"
				CONCEPTMAP -> "http://hl7.org/fhir/resource-types"
				CONDITION -> "http://hl7.org/fhir/resource-types"
				CONDITIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				CONSENT -> "http://hl7.org/fhir/resource-types"
				CONTRACT -> "http://hl7.org/fhir/resource-types"
				COVERAGE -> "http://hl7.org/fhir/resource-types"
				COVERAGEELIGIBILITYREQUEST -> "http://hl7.org/fhir/resource-types"
				COVERAGEELIGIBILITYRESPONSE -> "http://hl7.org/fhir/resource-types"
				DETECTEDISSUE -> "http://hl7.org/fhir/resource-types"
				DEVICE -> "http://hl7.org/fhir/resource-types"
				DEVICEDEFINITION -> "http://hl7.org/fhir/resource-types"
				DEVICEMETRIC -> "http://hl7.org/fhir/resource-types"
				DEVICEREQUEST -> "http://hl7.org/fhir/resource-types"
				DEVICEUSESTATEMENT -> "http://hl7.org/fhir/resource-types"
				DIAGNOSTICREPORT -> "http://hl7.org/fhir/resource-types"
				DOCUMENTMANIFEST -> "http://hl7.org/fhir/resource-types"
				DOCUMENTREFERENCE -> "http://hl7.org/fhir/resource-types"
				DOMAINRESOURCE -> "http://hl7.org/fhir/resource-types"
				ENCOUNTER -> "http://hl7.org/fhir/resource-types"
				ENDPOINT -> "http://hl7.org/fhir/resource-types"
				ENROLLMENTREQUEST -> "http://hl7.org/fhir/resource-types"
				ENROLLMENTRESPONSE -> "http://hl7.org/fhir/resource-types"
				EPISODEOFCARE -> "http://hl7.org/fhir/resource-types"
				EVENTDEFINITION -> "http://hl7.org/fhir/resource-types"
				EVIDENCE -> "http://hl7.org/fhir/resource-types"
				EVIDENCEREPORT -> "http://hl7.org/fhir/resource-types"
				EVIDENCEVARIABLE -> "http://hl7.org/fhir/resource-types"
				EXAMPLESCENARIO -> "http://hl7.org/fhir/resource-types"
				EXPLANATIONOFBENEFIT -> "http://hl7.org/fhir/resource-types"
				FAMILYMEMBERHISTORY -> "http://hl7.org/fhir/resource-types"
				FLAG -> "http://hl7.org/fhir/resource-types"
				GOAL -> "http://hl7.org/fhir/resource-types"
				GRAPHDEFINITION -> "http://hl7.org/fhir/resource-types"
				GROUP -> "http://hl7.org/fhir/resource-types"
				GUIDANCERESPONSE -> "http://hl7.org/fhir/resource-types"
				HEALTHCARESERVICE -> "http://hl7.org/fhir/resource-types"
				IMAGINGSTUDY -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATION -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATIONEVALUATION -> "http://hl7.org/fhir/resource-types"
				IMMUNIZATIONRECOMMENDATION -> "http://hl7.org/fhir/resource-types"
				IMPLEMENTATIONGUIDE -> "http://hl7.org/fhir/resource-types"
				INGREDIENT -> "http://hl7.org/fhir/resource-types"
				INSURANCEPLAN -> "http://hl7.org/fhir/resource-types"
				INVOICE -> "http://hl7.org/fhir/resource-types"
				LIBRARY -> "http://hl7.org/fhir/resource-types"
				LINKAGE -> "http://hl7.org/fhir/resource-types"
				LIST -> "http://hl7.org/fhir/resource-types"
				LOCATION -> "http://hl7.org/fhir/resource-types"
				MANUFACTUREDITEMDEFINITION -> "http://hl7.org/fhir/resource-types"
				MEASURE -> "http://hl7.org/fhir/resource-types"
				MEASUREREPORT -> "http://hl7.org/fhir/resource-types"
				MEDICATION -> "http://hl7.org/fhir/resource-types"
				MEDICATIONADMINISTRATION -> "http://hl7.org/fhir/resource-types"
				MEDICATIONDISPENSE -> "http://hl7.org/fhir/resource-types"
				MEDICATIONKNOWLEDGE -> "http://hl7.org/fhir/resource-types"
				MEDICATIONREQUEST -> "http://hl7.org/fhir/resource-types"
				MEDICATIONUSAGE -> "http://hl7.org/fhir/resource-types"
				MEDICINALPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				MESSAGEDEFINITION -> "http://hl7.org/fhir/resource-types"
				MESSAGEHEADER -> "http://hl7.org/fhir/resource-types"
				MOLECULARSEQUENCE -> "http://hl7.org/fhir/resource-types"
				NAMINGSYSTEM -> "http://hl7.org/fhir/resource-types"
				NUTRITIONINTAKE -> "http://hl7.org/fhir/resource-types"
				NUTRITIONORDER -> "http://hl7.org/fhir/resource-types"
				NUTRITIONPRODUCT -> "http://hl7.org/fhir/resource-types"
				OBSERVATION -> "http://hl7.org/fhir/resource-types"
				OBSERVATIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				OPERATIONDEFINITION -> "http://hl7.org/fhir/resource-types"
				OPERATIONOUTCOME -> "http://hl7.org/fhir/resource-types"
				ORGANIZATION -> "http://hl7.org/fhir/resource-types"
				ORGANIZATIONAFFILIATION -> "http://hl7.org/fhir/resource-types"
				PACKAGEDPRODUCTDEFINITION -> "http://hl7.org/fhir/resource-types"
				PARAMETERS -> "http://hl7.org/fhir/resource-types"
				PATIENT -> "http://hl7.org/fhir/resource-types"
				PAYMENTNOTICE -> "http://hl7.org/fhir/resource-types"
				PAYMENTRECONCILIATION -> "http://hl7.org/fhir/resource-types"
				PERMISSION -> "http://hl7.org/fhir/resource-types"
				PERSON -> "http://hl7.org/fhir/resource-types"
				PLANDEFINITION -> "http://hl7.org/fhir/resource-types"
				PRACTITIONER -> "http://hl7.org/fhir/resource-types"
				PRACTITIONERROLE -> "http://hl7.org/fhir/resource-types"
				PROCEDURE -> "http://hl7.org/fhir/resource-types"
				PROVENANCE -> "http://hl7.org/fhir/resource-types"
				QUESTIONNAIRE -> "http://hl7.org/fhir/resource-types"
				QUESTIONNAIRERESPONSE -> "http://hl7.org/fhir/resource-types"
				REGULATEDAUTHORIZATION -> "http://hl7.org/fhir/resource-types"
				RELATEDPERSON -> "http://hl7.org/fhir/resource-types"
				REQUESTGROUP -> "http://hl7.org/fhir/resource-types"
				RESEARCHSTUDY -> "http://hl7.org/fhir/resource-types"
				RESEARCHSUBJECT -> "http://hl7.org/fhir/resource-types"
				RESOURCE -> "http://hl7.org/fhir/resource-types"
				RISKASSESSMENT -> "http://hl7.org/fhir/resource-types"
				SCHEDULE -> "http://hl7.org/fhir/resource-types"
				SEARCHPARAMETER -> "http://hl7.org/fhir/resource-types"
				SERVICEREQUEST -> "http://hl7.org/fhir/resource-types"
				SLOT -> "http://hl7.org/fhir/resource-types"
				SPECIMEN -> "http://hl7.org/fhir/resource-types"
				SPECIMENDEFINITION -> "http://hl7.org/fhir/resource-types"
				STRUCTUREDEFINITION -> "http://hl7.org/fhir/resource-types"
				STRUCTUREMAP -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTION -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTIONSTATUS -> "http://hl7.org/fhir/resource-types"
				SUBSCRIPTIONTOPIC -> "http://hl7.org/fhir/resource-types"
				SUBSTANCE -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEDEFINITION -> "http://hl7.org/fhir/resource-types"
				SUBSTANCENUCLEICACID -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEPOLYMER -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEPROTEIN -> "http://hl7.org/fhir/resource-types"
				SUBSTANCEREFERENCEINFORMATION -> "http://hl7.org/fhir/resource-types"
				SUBSTANCESOURCEMATERIAL -> "http://hl7.org/fhir/resource-types"
				SUPPLYDELIVERY -> "http://hl7.org/fhir/resource-types"
				SUPPLYREQUEST -> "http://hl7.org/fhir/resource-types"
				TASK -> "http://hl7.org/fhir/resource-types"
				TERMINOLOGYCAPABILITIES -> "http://hl7.org/fhir/resource-types"
				TESTREPORT -> "http://hl7.org/fhir/resource-types"
				TESTSCRIPT -> "http://hl7.org/fhir/resource-types"
				VALUESET -> "http://hl7.org/fhir/resource-types"
				VERIFICATIONRESULT -> "http://hl7.org/fhir/resource-types"
				VISIONPRESCRIPTION -> "http://hl7.org/fhir/resource-types"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				ACCOUNT -> "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
				ACTIVITYDEFINITION -> "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
				ADMINISTRABLEPRODUCTDEFINITION -> "A pharmaceutical product described in terms of its composition and dose form."
				ADVERSEEVENT -> "An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research subject.  The unintended effects may require additional monitoring, treatment or hospitalization or may result in death.  The AdverseEvent resource also extends to potential or avoided events that could have had such effects."
				ALLERGYINTOLERANCE -> "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
				APPOINTMENT -> "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
				APPOINTMENTRESPONSE -> "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection."
				AUDITEVENT -> "A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis."
				BASIC -> "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification."
				BINARY -> "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc."
				BIOLOGICALLYDERIVEDPRODUCT -> "A material substance originating from a biological entity intended to be transplanted or infused\ninto another (possibly the same) biological entity."
				BODYSTRUCTURE -> "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case."
				BUNDLE -> "A container for a collection of resources."
				CAPABILITYSTATEMENT -> "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				CAPABILITYSTATEMENT2 -> "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				CAREPLAN -> "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
				CARETEAM -> "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care."
				CATALOGENTRY -> "Catalog entries are wrappers that contextualize items included in a catalog."
				CHARGEITEM -> "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
				CHARGEITEMDEFINITION -> "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system."
				CITATION -> "The Citation."
				CLAIM -> "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement."
				CLAIMRESPONSE -> "This resource provides the adjudication details from the processing of a Claim resource."
				CLINICALIMPRESSION -> "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
				CLINICALUSEISSUE -> "A single usage issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure."
				CODESYSTEM -> "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content."
				COMMUNICATION -> "A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition."
				COMMUNICATIONREQUEST -> "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
				COMPARTMENTDEFINITION -> "A compartment definition that defines how resources are accessed on a server."
				COMPOSITION -> "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.)."
				CONCEPTMAP -> "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models."
				CONDITION -> "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
				CONDITIONDEFINITION -> "A definition of a condition and information relevant to managing it."
				CONSENT -> "A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
				CONTRACT -> "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement."
				COVERAGE -> "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment."
				COVERAGEELIGIBILITYREQUEST -> "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
				COVERAGEELIGIBILITYRESPONSE -> "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource."
				DETECTEDISSUE -> "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
				DEVICE -> "A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device."
				DEVICEDEFINITION -> "The characteristics, operational status and capabilities of a medical-related component of a medical device."
				DEVICEMETRIC -> "Describes a measurement, calculation or setting capability of a medical device."
				DEVICEREQUEST -> "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker."
				DEVICEUSESTATEMENT -> "A record of a device being used by a patient where the record is the result of a report from the patient or a clinician."
				DIAGNOSTICREPORT -> "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
				DOCUMENTMANIFEST -> "A collection of documents compiled for a purpose together with metadata that applies to the collection."
				DOCUMENTREFERENCE -> "A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this \"document\" encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference."
				DOMAINRESOURCE -> "A resource that includes narrative, extensions, and contained resources."
				ENCOUNTER -> "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
				ENDPOINT -> "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
				ENROLLMENTREQUEST -> "This resource provides the insurance enrollment details to the insurer regarding a specified coverage."
				ENROLLMENTRESPONSE -> "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource."
				EPISODEOFCARE -> "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
				EVENTDEFINITION -> "The EventDefinition resource provides a reusable description of when a particular event can occur."
				EVIDENCE -> "This represents statistics, certainty, both the intended and actual population, and evidence variables."
				EVIDENCEREPORT -> "The EvidenceReport."
				EVIDENCEVARIABLE -> "The EvidenceVariable resource describes an element that knowledge (Evidence) is about."
				EXAMPLESCENARIO -> "Example of workflow instance."
				EXPLANATIONOFBENEFIT -> "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
				FAMILYMEMBERHISTORY -> "Significant health conditions for a person related to the patient relevant in the context of care for the patient."
				FLAG -> "Prospective warnings of potential issues when providing care to the patient."
				GOAL -> "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
				GRAPHDEFINITION -> "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
				GROUP -> "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
				GUIDANCERESPONSE -> "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken."
				HEALTHCARESERVICE -> "The details of a healthcare service available at a location."
				IMAGINGSTUDY -> "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
				IMMUNIZATION -> "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party."
				IMMUNIZATIONEVALUATION -> "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations."
				IMMUNIZATIONRECOMMENDATION -> "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification."
				IMPLEMENTATIONGUIDE -> "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
				INGREDIENT -> "An ingredient of a manufactured item or pharmaceutical product."
				INSURANCEPLAN -> "Details of a Health Insurance product/plan provided by an organization."
				INVOICE -> "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose."
				LIBRARY -> "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets."
				LINKAGE -> "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\"."
				LIST -> "A list is a curated collection of resources."
				LOCATION -> "Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated."
				MANUFACTUREDITEMDEFINITION -> "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product."
				MEASURE -> "The Measure resource provides the definition of a quality measure."
				MEASUREREPORT -> "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation."
				MEDICATION -> "This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use."
				MEDICATIONADMINISTRATION -> "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
				MEDICATIONDISPENSE -> "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
				MEDICATIONKNOWLEDGE -> "Information about a medication that is used to support knowledge."
				MEDICATIONREQUEST -> "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
				MEDICATIONUSAGE -> "A record of a medication that is being consumed by a patient.   A MedicationUsage may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. \n\nThe primary difference between a medicationusage and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationusage is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Usage information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information."
				MEDICINALPRODUCTDEFINITION -> "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use)."
				MESSAGEDEFINITION -> "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
				MESSAGEHEADER -> "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
				MOLECULARSEQUENCE -> "Raw data describing a biological sequence."
				NAMINGSYSTEM -> "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types."
				NUTRITIONINTAKE -> "A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake."
				NUTRITIONORDER -> "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
				NUTRITIONPRODUCT -> "A food or fluid product that is consumed by patients."
				OBSERVATION -> "Measurements and simple assertions made about a patient, device or other subject."
				OBSERVATIONDEFINITION -> "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service."
				OPERATIONDEFINITION -> "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
				OPERATIONOUTCOME -> "A collection of error, warning, or information messages that result from a system action."
				ORGANIZATION -> "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc."
				ORGANIZATIONAFFILIATION -> "Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship."
				PACKAGEDPRODUCTDEFINITION -> "A medically related item or items, in a container or package."
				PARAMETERS -> "This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it."
				PATIENT -> "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
				PAYMENTNOTICE -> "This resource provides the status of the payment for goods and services rendered, and the request and response resource references."
				PAYMENTRECONCILIATION -> "This resource provides the details including amount of a payment and allocates the payment items being paid."
				PERMISSION -> "Permission."
				PERSON -> "Demographics and administrative information about a person independent of a specific health-related context."
				PLANDEFINITION -> "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
				PRACTITIONER -> "A person who is directly or indirectly involved in the provisioning of healthcare."
				PRACTITIONERROLE -> "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
				PROCEDURE -> "An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy."
				PROVENANCE -> "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
				QUESTIONNAIRE -> "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
				QUESTIONNAIRERESPONSE -> "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
				REGULATEDAUTHORIZATION -> "The regulatory authorization of a medicinal product, device or process."
				RELATEDPERSON -> "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process."
				REQUESTGROUP -> "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
				RESEARCHSTUDY -> "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
				RESEARCHSUBJECT -> "A physical entity which is the primary unit of operational and/or administrative interest in a study."
				RESOURCE -> "This is the base resource type for everything."
				RISKASSESSMENT -> "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
				SCHEDULE -> "A container for slots of time that may be available for booking appointments."
				SEARCHPARAMETER -> "A search parameter that defines a named search item that can be used to search/filter on a resource."
				SERVICEREQUEST -> "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed."
				SLOT -> "A slot of time on a schedule that may be available for booking appointments."
				SPECIMEN -> "A sample to be used for analysis."
				SPECIMENDEFINITION -> "A kind of specimen with associated set of requirements."
				STRUCTUREDEFINITION -> "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
				STRUCTUREMAP -> "A Map of relationships between 2 structures that can be used to transform data."
				SUBSCRIPTION -> "The subscription resource describes a particular client's request to be notified about a SubscriptionTopic."
				SUBSCRIPTIONSTATUS -> "The SubscriptionStatus resource describes the state of a Subscription during notifications."
				SUBSCRIPTIONTOPIC -> "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic."
				SUBSTANCE -> "A homogeneous material with a definite composition."
				SUBSTANCEDEFINITION -> "The detailed description of a substance, typically at a level beyond what is used for prescribing."
				SUBSTANCENUCLEICACID -> "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction."
				SUBSTANCEPOLYMER -> "Properties of a substance specific to it being a polymer."
				SUBSTANCEPROTEIN -> "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators."
				SUBSTANCEREFERENCEINFORMATION -> "Todo."
				SUBSTANCESOURCEMATERIAL -> "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex."
				SUPPLYDELIVERY -> "Record of delivery of what is supplied."
				SUPPLYREQUEST -> "A record of a request for a medication, substance or device used in the healthcare setting."
				TASK -> "A task to be performed."
				TERMINOLOGYCAPABILITIES -> "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
				TESTREPORT -> "A summary of information based on the results of executing a TestScript."
				TESTSCRIPT -> "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification."
				VALUESET -> "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html)."
				VERIFICATIONRESULT -> "Describes validation requirements, source(s), status and dates for one or more elements."
				VISIONPRESCRIPTION -> "An authorization for the provision of glasses and/or contact lenses to a patient."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				ACCOUNT -> "Account";
				ACTIVITYDEFINITION -> "ActivityDefinition";
				ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition";
				ADVERSEEVENT -> "AdverseEvent";
				ALLERGYINTOLERANCE -> "AllergyIntolerance";
				APPOINTMENT -> "Appointment";
				APPOINTMENTRESPONSE -> "AppointmentResponse";
				AUDITEVENT -> "AuditEvent";
				BASIC -> "Basic";
				BINARY -> "Binary";
				BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct";
				BODYSTRUCTURE -> "BodyStructure";
				BUNDLE -> "Bundle";
				CAPABILITYSTATEMENT -> "CapabilityStatement";
				CAPABILITYSTATEMENT2 -> "CapabilityStatement2";
				CAREPLAN -> "CarePlan";
				CARETEAM -> "CareTeam";
				CATALOGENTRY -> "CatalogEntry";
				CHARGEITEM -> "ChargeItem";
				CHARGEITEMDEFINITION -> "ChargeItemDefinition";
				CITATION -> "Citation";
				CLAIM -> "Claim";
				CLAIMRESPONSE -> "ClaimResponse";
				CLINICALIMPRESSION -> "ClinicalImpression";
				CLINICALUSEISSUE -> "ClinicalUseIssue";
				CODESYSTEM -> "CodeSystem";
				COMMUNICATION -> "Communication";
				COMMUNICATIONREQUEST -> "CommunicationRequest";
				COMPARTMENTDEFINITION -> "CompartmentDefinition";
				COMPOSITION -> "Composition";
				CONCEPTMAP -> "ConceptMap";
				CONDITION -> "Condition";
				CONDITIONDEFINITION -> "ConditionDefinition";
				CONSENT -> "Consent";
				CONTRACT -> "Contract";
				COVERAGE -> "Coverage";
				COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest";
				COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse";
				DETECTEDISSUE -> "DetectedIssue";
				DEVICE -> "Device";
				DEVICEDEFINITION -> "DeviceDefinition";
				DEVICEMETRIC -> "DeviceMetric";
				DEVICEREQUEST -> "DeviceRequest";
				DEVICEUSESTATEMENT -> "DeviceUseStatement";
				DIAGNOSTICREPORT -> "DiagnosticReport";
				DOCUMENTMANIFEST -> "DocumentManifest";
				DOCUMENTREFERENCE -> "DocumentReference";
				DOMAINRESOURCE -> "DomainResource";
				ENCOUNTER -> "Encounter";
				ENDPOINT -> "Endpoint";
				ENROLLMENTREQUEST -> "EnrollmentRequest";
				ENROLLMENTRESPONSE -> "EnrollmentResponse";
				EPISODEOFCARE -> "EpisodeOfCare";
				EVENTDEFINITION -> "EventDefinition";
				EVIDENCE -> "Evidence";
				EVIDENCEREPORT -> "EvidenceReport";
				EVIDENCEVARIABLE -> "EvidenceVariable";
				EXAMPLESCENARIO -> "ExampleScenario";
				EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit";
				FAMILYMEMBERHISTORY -> "FamilyMemberHistory";
				FLAG -> "Flag";
				GOAL -> "Goal";
				GRAPHDEFINITION -> "GraphDefinition";
				GROUP -> "Group";
				GUIDANCERESPONSE -> "GuidanceResponse";
				HEALTHCARESERVICE -> "HealthcareService";
				IMAGINGSTUDY -> "ImagingStudy";
				IMMUNIZATION -> "Immunization";
				IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation";
				IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation";
				IMPLEMENTATIONGUIDE -> "ImplementationGuide";
				INGREDIENT -> "Ingredient";
				INSURANCEPLAN -> "InsurancePlan";
				INVOICE -> "Invoice";
				LIBRARY -> "Library";
				LINKAGE -> "Linkage";
				LIST -> "List";
				LOCATION -> "Location";
				MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition";
				MEASURE -> "Measure";
				MEASUREREPORT -> "MeasureReport";
				MEDICATION -> "Medication";
				MEDICATIONADMINISTRATION -> "MedicationAdministration";
				MEDICATIONDISPENSE -> "MedicationDispense";
				MEDICATIONKNOWLEDGE -> "MedicationKnowledge";
				MEDICATIONREQUEST -> "MedicationRequest";
				MEDICATIONUSAGE -> "MedicationUsage";
				MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition";
				MESSAGEDEFINITION -> "MessageDefinition";
				MESSAGEHEADER -> "MessageHeader";
				MOLECULARSEQUENCE -> "MolecularSequence";
				NAMINGSYSTEM -> "NamingSystem";
				NUTRITIONINTAKE -> "NutritionIntake";
				NUTRITIONORDER -> "NutritionOrder";
				NUTRITIONPRODUCT -> "NutritionProduct";
				OBSERVATION -> "Observation";
				OBSERVATIONDEFINITION -> "ObservationDefinition";
				OPERATIONDEFINITION -> "OperationDefinition";
				OPERATIONOUTCOME -> "OperationOutcome";
				ORGANIZATION -> "Organization";
				ORGANIZATIONAFFILIATION -> "OrganizationAffiliation";
				PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition";
				PARAMETERS -> "Parameters";
				PATIENT -> "Patient";
				PAYMENTNOTICE -> "PaymentNotice";
				PAYMENTRECONCILIATION -> "PaymentReconciliation";
				PERMISSION -> "Permission";
				PERSON -> "Person";
				PLANDEFINITION -> "PlanDefinition";
				PRACTITIONER -> "Practitioner";
				PRACTITIONERROLE -> "PractitionerRole";
				PROCEDURE -> "Procedure";
				PROVENANCE -> "Provenance";
				QUESTIONNAIRE -> "Questionnaire";
				QUESTIONNAIRERESPONSE -> "QuestionnaireResponse";
				REGULATEDAUTHORIZATION -> "RegulatedAuthorization";
				RELATEDPERSON -> "RelatedPerson";
				REQUESTGROUP -> "RequestGroup";
				RESEARCHSTUDY -> "ResearchStudy";
				RESEARCHSUBJECT -> "ResearchSubject";
				RESOURCE -> "Resource";
				RISKASSESSMENT -> "RiskAssessment";
				SCHEDULE -> "Schedule";
				SEARCHPARAMETER -> "SearchParameter";
				SERVICEREQUEST -> "ServiceRequest";
				SLOT -> "Slot";
				SPECIMEN -> "Specimen";
				SPECIMENDEFINITION -> "SpecimenDefinition";
				STRUCTUREDEFINITION -> "StructureDefinition";
				STRUCTUREMAP -> "StructureMap";
				SUBSCRIPTION -> "Subscription";
				SUBSCRIPTIONSTATUS -> "SubscriptionStatus";
				SUBSCRIPTIONTOPIC -> "SubscriptionTopic";
				SUBSTANCE -> "Substance";
				SUBSTANCEDEFINITION -> "SubstanceDefinition";
				SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid";
				SUBSTANCEPOLYMER -> "SubstancePolymer";
				SUBSTANCEPROTEIN -> "SubstanceProtein";
				SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation";
				SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial";
				SUPPLYDELIVERY -> "SupplyDelivery";
				SUPPLYREQUEST -> "SupplyRequest";
				TASK -> "Task";
				TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities";
				TESTREPORT -> "TestReport";
				TESTSCRIPT -> "TestScript";
				VALUESET -> "ValueSet";
				VERIFICATIONRESULT -> "VerificationResult";
				VISIONPRESCRIPTION -> "VisionPrescription";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): ResourceTypeEnum? {
				if (codeString == null || "" == codeString) return null
				if ("Account" == codeString) return ACCOUNT
				if ("ActivityDefinition" == codeString) return ACTIVITYDEFINITION
				if ("AdministrableProductDefinition" == codeString) return ADMINISTRABLEPRODUCTDEFINITION
				if ("AdverseEvent" == codeString) return ADVERSEEVENT
				if ("AllergyIntolerance" == codeString) return ALLERGYINTOLERANCE
				if ("Appointment" == codeString) return APPOINTMENT
				if ("AppointmentResponse" == codeString) return APPOINTMENTRESPONSE
				if ("AuditEvent" == codeString) return AUDITEVENT
				if ("Basic" == codeString) return BASIC
				if ("Binary" == codeString) return BINARY
				if ("BiologicallyDerivedProduct" == codeString) return BIOLOGICALLYDERIVEDPRODUCT
				if ("BodyStructure" == codeString) return BODYSTRUCTURE
				if ("Bundle" == codeString) return BUNDLE
				if ("CapabilityStatement" == codeString) return CAPABILITYSTATEMENT
				if ("CapabilityStatement2" == codeString) return CAPABILITYSTATEMENT2
				if ("CarePlan" == codeString) return CAREPLAN
				if ("CareTeam" == codeString) return CARETEAM
				if ("CatalogEntry" == codeString) return CATALOGENTRY
				if ("ChargeItem" == codeString) return CHARGEITEM
				if ("ChargeItemDefinition" == codeString) return CHARGEITEMDEFINITION
				if ("Citation" == codeString) return CITATION
				if ("Claim" == codeString) return CLAIM
				if ("ClaimResponse" == codeString) return CLAIMRESPONSE
				if ("ClinicalImpression" == codeString) return CLINICALIMPRESSION
				if ("ClinicalUseIssue" == codeString) return CLINICALUSEISSUE
				if ("CodeSystem" == codeString) return CODESYSTEM
				if ("Communication" == codeString) return COMMUNICATION
				if ("CommunicationRequest" == codeString) return COMMUNICATIONREQUEST
				if ("CompartmentDefinition" == codeString) return COMPARTMENTDEFINITION
				if ("Composition" == codeString) return COMPOSITION
				if ("ConceptMap" == codeString) return CONCEPTMAP
				if ("Condition" == codeString) return CONDITION
				if ("ConditionDefinition" == codeString) return CONDITIONDEFINITION
				if ("Consent" == codeString) return CONSENT
				if ("Contract" == codeString) return CONTRACT
				if ("Coverage" == codeString) return COVERAGE
				if ("CoverageEligibilityRequest" == codeString) return COVERAGEELIGIBILITYREQUEST
				if ("CoverageEligibilityResponse" == codeString) return COVERAGEELIGIBILITYRESPONSE
				if ("DetectedIssue" == codeString) return DETECTEDISSUE
				if ("Device" == codeString) return DEVICE
				if ("DeviceDefinition" == codeString) return DEVICEDEFINITION
				if ("DeviceMetric" == codeString) return DEVICEMETRIC
				if ("DeviceRequest" == codeString) return DEVICEREQUEST
				if ("DeviceUseStatement" == codeString) return DEVICEUSESTATEMENT
				if ("DiagnosticReport" == codeString) return DIAGNOSTICREPORT
				if ("DocumentManifest" == codeString) return DOCUMENTMANIFEST
				if ("DocumentReference" == codeString) return DOCUMENTREFERENCE
				if ("DomainResource" == codeString) return DOMAINRESOURCE
				if ("Encounter" == codeString) return ENCOUNTER
				if ("Endpoint" == codeString) return ENDPOINT
				if ("EnrollmentRequest" == codeString) return ENROLLMENTREQUEST
				if ("EnrollmentResponse" == codeString) return ENROLLMENTRESPONSE
				if ("EpisodeOfCare" == codeString) return EPISODEOFCARE
				if ("EventDefinition" == codeString) return EVENTDEFINITION
				if ("Evidence" == codeString) return EVIDENCE
				if ("EvidenceReport" == codeString) return EVIDENCEREPORT
				if ("EvidenceVariable" == codeString) return EVIDENCEVARIABLE
				if ("ExampleScenario" == codeString) return EXAMPLESCENARIO
				if ("ExplanationOfBenefit" == codeString) return EXPLANATIONOFBENEFIT
				if ("FamilyMemberHistory" == codeString) return FAMILYMEMBERHISTORY
				if ("Flag" == codeString) return FLAG
				if ("Goal" == codeString) return GOAL
				if ("GraphDefinition" == codeString) return GRAPHDEFINITION
				if ("Group" == codeString) return GROUP
				if ("GuidanceResponse" == codeString) return GUIDANCERESPONSE
				if ("HealthcareService" == codeString) return HEALTHCARESERVICE
				if ("ImagingStudy" == codeString) return IMAGINGSTUDY
				if ("Immunization" == codeString) return IMMUNIZATION
				if ("ImmunizationEvaluation" == codeString) return IMMUNIZATIONEVALUATION
				if ("ImmunizationRecommendation" == codeString) return IMMUNIZATIONRECOMMENDATION
				if ("ImplementationGuide" == codeString) return IMPLEMENTATIONGUIDE
				if ("Ingredient" == codeString) return INGREDIENT
				if ("InsurancePlan" == codeString) return INSURANCEPLAN
				if ("Invoice" == codeString) return INVOICE
				if ("Library" == codeString) return LIBRARY
				if ("Linkage" == codeString) return LINKAGE
				if ("List" == codeString) return LIST
				if ("Location" == codeString) return LOCATION
				if ("ManufacturedItemDefinition" == codeString) return MANUFACTUREDITEMDEFINITION
				if ("Measure" == codeString) return MEASURE
				if ("MeasureReport" == codeString) return MEASUREREPORT
				if ("Medication" == codeString) return MEDICATION
				if ("MedicationAdministration" == codeString) return MEDICATIONADMINISTRATION
				if ("MedicationDispense" == codeString) return MEDICATIONDISPENSE
				if ("MedicationKnowledge" == codeString) return MEDICATIONKNOWLEDGE
				if ("MedicationRequest" == codeString) return MEDICATIONREQUEST
				if ("MedicationUsage" == codeString) return MEDICATIONUSAGE
				if ("MedicinalProductDefinition" == codeString) return MEDICINALPRODUCTDEFINITION
				if ("MessageDefinition" == codeString) return MESSAGEDEFINITION
				if ("MessageHeader" == codeString) return MESSAGEHEADER
				if ("MolecularSequence" == codeString) return MOLECULARSEQUENCE
				if ("NamingSystem" == codeString) return NAMINGSYSTEM
				if ("NutritionIntake" == codeString) return NUTRITIONINTAKE
				if ("NutritionOrder" == codeString) return NUTRITIONORDER
				if ("NutritionProduct" == codeString) return NUTRITIONPRODUCT
				if ("Observation" == codeString) return OBSERVATION
				if ("ObservationDefinition" == codeString) return OBSERVATIONDEFINITION
				if ("OperationDefinition" == codeString) return OPERATIONDEFINITION
				if ("OperationOutcome" == codeString) return OPERATIONOUTCOME
				if ("Organization" == codeString) return ORGANIZATION
				if ("OrganizationAffiliation" == codeString) return ORGANIZATIONAFFILIATION
				if ("PackagedProductDefinition" == codeString) return PACKAGEDPRODUCTDEFINITION
				if ("Parameters" == codeString) return PARAMETERS
				if ("Patient" == codeString) return PATIENT
				if ("PaymentNotice" == codeString) return PAYMENTNOTICE
				if ("PaymentReconciliation" == codeString) return PAYMENTRECONCILIATION
				if ("Permission" == codeString) return PERMISSION
				if ("Person" == codeString) return PERSON
				if ("PlanDefinition" == codeString) return PLANDEFINITION
				if ("Practitioner" == codeString) return PRACTITIONER
				if ("PractitionerRole" == codeString) return PRACTITIONERROLE
				if ("Procedure" == codeString) return PROCEDURE
				if ("Provenance" == codeString) return PROVENANCE
				if ("Questionnaire" == codeString) return QUESTIONNAIRE
				if ("QuestionnaireResponse" == codeString) return QUESTIONNAIRERESPONSE
				if ("RegulatedAuthorization" == codeString) return REGULATEDAUTHORIZATION
				if ("RelatedPerson" == codeString) return RELATEDPERSON
				if ("RequestGroup" == codeString) return REQUESTGROUP
				if ("ResearchStudy" == codeString) return RESEARCHSTUDY
				if ("ResearchSubject" == codeString) return RESEARCHSUBJECT
				if ("Resource" == codeString) return RESOURCE
				if ("RiskAssessment" == codeString) return RISKASSESSMENT
				if ("Schedule" == codeString) return SCHEDULE
				if ("SearchParameter" == codeString) return SEARCHPARAMETER
				if ("ServiceRequest" == codeString) return SERVICEREQUEST
				if ("Slot" == codeString) return SLOT
				if ("Specimen" == codeString) return SPECIMEN
				if ("SpecimenDefinition" == codeString) return SPECIMENDEFINITION
				if ("StructureDefinition" == codeString) return STRUCTUREDEFINITION
				if ("StructureMap" == codeString) return STRUCTUREMAP
				if ("Subscription" == codeString) return SUBSCRIPTION
				if ("SubscriptionStatus" == codeString) return SUBSCRIPTIONSTATUS
				if ("SubscriptionTopic" == codeString) return SUBSCRIPTIONTOPIC
				if ("Substance" == codeString) return SUBSTANCE
				if ("SubstanceDefinition" == codeString) return SUBSTANCEDEFINITION
				if ("SubstanceNucleicAcid" == codeString) return SUBSTANCENUCLEICACID
				if ("SubstancePolymer" == codeString) return SUBSTANCEPOLYMER
				if ("SubstanceProtein" == codeString) return SUBSTANCEPROTEIN
				if ("SubstanceReferenceInformation" == codeString) return SUBSTANCEREFERENCEINFORMATION
				if ("SubstanceSourceMaterial" == codeString) return SUBSTANCESOURCEMATERIAL
				if ("SupplyDelivery" == codeString) return SUPPLYDELIVERY
				if ("SupplyRequest" == codeString) return SUPPLYREQUEST
				if ("Task" == codeString) return TASK
				if ("TerminologyCapabilities" == codeString) return TERMINOLOGYCAPABILITIES
				if ("TestReport" == codeString) return TESTREPORT
				if ("TestScript" == codeString) return TESTSCRIPT
				if ("ValueSet" == codeString) return VALUESET
				if ("VerificationResult" == codeString) return VERIFICATIONRESULT
				if ("VisionPrescription" == codeString) return VISIONPRESCRIPTION
				throw FHIRException("Unknown ResourceTypeEnum code '"$codeString"'")
			}
		}
	}

	class ResourceTypeEnumEnumFactory : EnumFactory<ResourceTypeEnum> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): ResourceTypeEnum? {
			if (codeString == null || "" == codeString) return null
			if ("Account" == codeString) return ResourceTypeEnum.ACCOUNT
			if ("ActivityDefinition" == codeString) return ResourceTypeEnum.ACTIVITYDEFINITION
			if ("AdministrableProductDefinition" == codeString) return ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION
			if ("AdverseEvent" == codeString) return ResourceTypeEnum.ADVERSEEVENT
			if ("AllergyIntolerance" == codeString) return ResourceTypeEnum.ALLERGYINTOLERANCE
			if ("Appointment" == codeString) return ResourceTypeEnum.APPOINTMENT
			if ("AppointmentResponse" == codeString) return ResourceTypeEnum.APPOINTMENTRESPONSE
			if ("AuditEvent" == codeString) return ResourceTypeEnum.AUDITEVENT
			if ("Basic" == codeString) return ResourceTypeEnum.BASIC
			if ("Binary" == codeString) return ResourceTypeEnum.BINARY
			if ("BiologicallyDerivedProduct" == codeString) return ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT
			if ("BodyStructure" == codeString) return ResourceTypeEnum.BODYSTRUCTURE
			if ("Bundle" == codeString) return ResourceTypeEnum.BUNDLE
			if ("CapabilityStatement" == codeString) return ResourceTypeEnum.CAPABILITYSTATEMENT
			if ("CapabilityStatement2" == codeString) return ResourceTypeEnum.CAPABILITYSTATEMENT2
			if ("CarePlan" == codeString) return ResourceTypeEnum.CAREPLAN
			if ("CareTeam" == codeString) return ResourceTypeEnum.CARETEAM
			if ("CatalogEntry" == codeString) return ResourceTypeEnum.CATALOGENTRY
			if ("ChargeItem" == codeString) return ResourceTypeEnum.CHARGEITEM
			if ("ChargeItemDefinition" == codeString) return ResourceTypeEnum.CHARGEITEMDEFINITION
			if ("Citation" == codeString) return ResourceTypeEnum.CITATION
			if ("Claim" == codeString) return ResourceTypeEnum.CLAIM
			if ("ClaimResponse" == codeString) return ResourceTypeEnum.CLAIMRESPONSE
			if ("ClinicalImpression" == codeString) return ResourceTypeEnum.CLINICALIMPRESSION
			if ("ClinicalUseIssue" == codeString) return ResourceTypeEnum.CLINICALUSEISSUE
			if ("CodeSystem" == codeString) return ResourceTypeEnum.CODESYSTEM
			if ("Communication" == codeString) return ResourceTypeEnum.COMMUNICATION
			if ("CommunicationRequest" == codeString) return ResourceTypeEnum.COMMUNICATIONREQUEST
			if ("CompartmentDefinition" == codeString) return ResourceTypeEnum.COMPARTMENTDEFINITION
			if ("Composition" == codeString) return ResourceTypeEnum.COMPOSITION
			if ("ConceptMap" == codeString) return ResourceTypeEnum.CONCEPTMAP
			if ("Condition" == codeString) return ResourceTypeEnum.CONDITION
			if ("ConditionDefinition" == codeString) return ResourceTypeEnum.CONDITIONDEFINITION
			if ("Consent" == codeString) return ResourceTypeEnum.CONSENT
			if ("Contract" == codeString) return ResourceTypeEnum.CONTRACT
			if ("Coverage" == codeString) return ResourceTypeEnum.COVERAGE
			if ("CoverageEligibilityRequest" == codeString) return ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST
			if ("CoverageEligibilityResponse" == codeString) return ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE
			if ("DetectedIssue" == codeString) return ResourceTypeEnum.DETECTEDISSUE
			if ("Device" == codeString) return ResourceTypeEnum.DEVICE
			if ("DeviceDefinition" == codeString) return ResourceTypeEnum.DEVICEDEFINITION
			if ("DeviceMetric" == codeString) return ResourceTypeEnum.DEVICEMETRIC
			if ("DeviceRequest" == codeString) return ResourceTypeEnum.DEVICEREQUEST
			if ("DeviceUseStatement" == codeString) return ResourceTypeEnum.DEVICEUSESTATEMENT
			if ("DiagnosticReport" == codeString) return ResourceTypeEnum.DIAGNOSTICREPORT
			if ("DocumentManifest" == codeString) return ResourceTypeEnum.DOCUMENTMANIFEST
			if ("DocumentReference" == codeString) return ResourceTypeEnum.DOCUMENTREFERENCE
			if ("DomainResource" == codeString) return ResourceTypeEnum.DOMAINRESOURCE
			if ("Encounter" == codeString) return ResourceTypeEnum.ENCOUNTER
			if ("Endpoint" == codeString) return ResourceTypeEnum.ENDPOINT
			if ("EnrollmentRequest" == codeString) return ResourceTypeEnum.ENROLLMENTREQUEST
			if ("EnrollmentResponse" == codeString) return ResourceTypeEnum.ENROLLMENTRESPONSE
			if ("EpisodeOfCare" == codeString) return ResourceTypeEnum.EPISODEOFCARE
			if ("EventDefinition" == codeString) return ResourceTypeEnum.EVENTDEFINITION
			if ("Evidence" == codeString) return ResourceTypeEnum.EVIDENCE
			if ("EvidenceReport" == codeString) return ResourceTypeEnum.EVIDENCEREPORT
			if ("EvidenceVariable" == codeString) return ResourceTypeEnum.EVIDENCEVARIABLE
			if ("ExampleScenario" == codeString) return ResourceTypeEnum.EXAMPLESCENARIO
			if ("ExplanationOfBenefit" == codeString) return ResourceTypeEnum.EXPLANATIONOFBENEFIT
			if ("FamilyMemberHistory" == codeString) return ResourceTypeEnum.FAMILYMEMBERHISTORY
			if ("Flag" == codeString) return ResourceTypeEnum.FLAG
			if ("Goal" == codeString) return ResourceTypeEnum.GOAL
			if ("GraphDefinition" == codeString) return ResourceTypeEnum.GRAPHDEFINITION
			if ("Group" == codeString) return ResourceTypeEnum.GROUP
			if ("GuidanceResponse" == codeString) return ResourceTypeEnum.GUIDANCERESPONSE
			if ("HealthcareService" == codeString) return ResourceTypeEnum.HEALTHCARESERVICE
			if ("ImagingStudy" == codeString) return ResourceTypeEnum.IMAGINGSTUDY
			if ("Immunization" == codeString) return ResourceTypeEnum.IMMUNIZATION
			if ("ImmunizationEvaluation" == codeString) return ResourceTypeEnum.IMMUNIZATIONEVALUATION
			if ("ImmunizationRecommendation" == codeString) return ResourceTypeEnum.IMMUNIZATIONRECOMMENDATION
			if ("ImplementationGuide" == codeString) return ResourceTypeEnum.IMPLEMENTATIONGUIDE
			if ("Ingredient" == codeString) return ResourceTypeEnum.INGREDIENT
			if ("InsurancePlan" == codeString) return ResourceTypeEnum.INSURANCEPLAN
			if ("Invoice" == codeString) return ResourceTypeEnum.INVOICE
			if ("Library" == codeString) return ResourceTypeEnum.LIBRARY
			if ("Linkage" == codeString) return ResourceTypeEnum.LINKAGE
			if ("List" == codeString) return ResourceTypeEnum.LIST
			if ("Location" == codeString) return ResourceTypeEnum.LOCATION
			if ("ManufacturedItemDefinition" == codeString) return ResourceTypeEnum.MANUFACTUREDITEMDEFINITION
			if ("Measure" == codeString) return ResourceTypeEnum.MEASURE
			if ("MeasureReport" == codeString) return ResourceTypeEnum.MEASUREREPORT
			if ("Medication" == codeString) return ResourceTypeEnum.MEDICATION
			if ("MedicationAdministration" == codeString) return ResourceTypeEnum.MEDICATIONADMINISTRATION
			if ("MedicationDispense" == codeString) return ResourceTypeEnum.MEDICATIONDISPENSE
			if ("MedicationKnowledge" == codeString) return ResourceTypeEnum.MEDICATIONKNOWLEDGE
			if ("MedicationRequest" == codeString) return ResourceTypeEnum.MEDICATIONREQUEST
			if ("MedicationUsage" == codeString) return ResourceTypeEnum.MEDICATIONUSAGE
			if ("MedicinalProductDefinition" == codeString) return ResourceTypeEnum.MEDICINALPRODUCTDEFINITION
			if ("MessageDefinition" == codeString) return ResourceTypeEnum.MESSAGEDEFINITION
			if ("MessageHeader" == codeString) return ResourceTypeEnum.MESSAGEHEADER
			if ("MolecularSequence" == codeString) return ResourceTypeEnum.MOLECULARSEQUENCE
			if ("NamingSystem" == codeString) return ResourceTypeEnum.NAMINGSYSTEM
			if ("NutritionIntake" == codeString) return ResourceTypeEnum.NUTRITIONINTAKE
			if ("NutritionOrder" == codeString) return ResourceTypeEnum.NUTRITIONORDER
			if ("NutritionProduct" == codeString) return ResourceTypeEnum.NUTRITIONPRODUCT
			if ("Observation" == codeString) return ResourceTypeEnum.OBSERVATION
			if ("ObservationDefinition" == codeString) return ResourceTypeEnum.OBSERVATIONDEFINITION
			if ("OperationDefinition" == codeString) return ResourceTypeEnum.OPERATIONDEFINITION
			if ("OperationOutcome" == codeString) return ResourceTypeEnum.OPERATIONOUTCOME
			if ("Organization" == codeString) return ResourceTypeEnum.ORGANIZATION
			if ("OrganizationAffiliation" == codeString) return ResourceTypeEnum.ORGANIZATIONAFFILIATION
			if ("PackagedProductDefinition" == codeString) return ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION
			if ("Parameters" == codeString) return ResourceTypeEnum.PARAMETERS
			if ("Patient" == codeString) return ResourceTypeEnum.PATIENT
			if ("PaymentNotice" == codeString) return ResourceTypeEnum.PAYMENTNOTICE
			if ("PaymentReconciliation" == codeString) return ResourceTypeEnum.PAYMENTRECONCILIATION
			if ("Permission" == codeString) return ResourceTypeEnum.PERMISSION
			if ("Person" == codeString) return ResourceTypeEnum.PERSON
			if ("PlanDefinition" == codeString) return ResourceTypeEnum.PLANDEFINITION
			if ("Practitioner" == codeString) return ResourceTypeEnum.PRACTITIONER
			if ("PractitionerRole" == codeString) return ResourceTypeEnum.PRACTITIONERROLE
			if ("Procedure" == codeString) return ResourceTypeEnum.PROCEDURE
			if ("Provenance" == codeString) return ResourceTypeEnum.PROVENANCE
			if ("Questionnaire" == codeString) return ResourceTypeEnum.QUESTIONNAIRE
			if ("QuestionnaireResponse" == codeString) return ResourceTypeEnum.QUESTIONNAIRERESPONSE
			if ("RegulatedAuthorization" == codeString) return ResourceTypeEnum.REGULATEDAUTHORIZATION
			if ("RelatedPerson" == codeString) return ResourceTypeEnum.RELATEDPERSON
			if ("RequestGroup" == codeString) return ResourceTypeEnum.REQUESTGROUP
			if ("ResearchStudy" == codeString) return ResourceTypeEnum.RESEARCHSTUDY
			if ("ResearchSubject" == codeString) return ResourceTypeEnum.RESEARCHSUBJECT
			if ("Resource" == codeString) return ResourceTypeEnum.RESOURCE
			if ("RiskAssessment" == codeString) return ResourceTypeEnum.RISKASSESSMENT
			if ("Schedule" == codeString) return ResourceTypeEnum.SCHEDULE
			if ("SearchParameter" == codeString) return ResourceTypeEnum.SEARCHPARAMETER
			if ("ServiceRequest" == codeString) return ResourceTypeEnum.SERVICEREQUEST
			if ("Slot" == codeString) return ResourceTypeEnum.SLOT
			if ("Specimen" == codeString) return ResourceTypeEnum.SPECIMEN
			if ("SpecimenDefinition" == codeString) return ResourceTypeEnum.SPECIMENDEFINITION
			if ("StructureDefinition" == codeString) return ResourceTypeEnum.STRUCTUREDEFINITION
			if ("StructureMap" == codeString) return ResourceTypeEnum.STRUCTUREMAP
			if ("Subscription" == codeString) return ResourceTypeEnum.SUBSCRIPTION
			if ("SubscriptionStatus" == codeString) return ResourceTypeEnum.SUBSCRIPTIONSTATUS
			if ("SubscriptionTopic" == codeString) return ResourceTypeEnum.SUBSCRIPTIONTOPIC
			if ("Substance" == codeString) return ResourceTypeEnum.SUBSTANCE
			if ("SubstanceDefinition" == codeString) return ResourceTypeEnum.SUBSTANCEDEFINITION
			if ("SubstanceNucleicAcid" == codeString) return ResourceTypeEnum.SUBSTANCENUCLEICACID
			if ("SubstancePolymer" == codeString) return ResourceTypeEnum.SUBSTANCEPOLYMER
			if ("SubstanceProtein" == codeString) return ResourceTypeEnum.SUBSTANCEPROTEIN
			if ("SubstanceReferenceInformation" == codeString) return ResourceTypeEnum.SUBSTANCEREFERENCEINFORMATION
			if ("SubstanceSourceMaterial" == codeString) return ResourceTypeEnum.SUBSTANCESOURCEMATERIAL
			if ("SupplyDelivery" == codeString) return ResourceTypeEnum.SUPPLYDELIVERY
			if ("SupplyRequest" == codeString) return ResourceTypeEnum.SUPPLYREQUEST
			if ("Task" == codeString) return ResourceTypeEnum.TASK
			if ("TerminologyCapabilities" == codeString) return ResourceTypeEnum.TERMINOLOGYCAPABILITIES
			if ("TestReport" == codeString) return ResourceTypeEnum.TESTREPORT
			if ("TestScript" == codeString) return ResourceTypeEnum.TESTSCRIPT
			if ("ValueSet" == codeString) return ResourceTypeEnum.VALUESET
			if ("VerificationResult" == codeString) return ResourceTypeEnum.VERIFICATIONRESULT
			if ("VisionPrescription" == codeString) return ResourceTypeEnum.VISIONPRESCRIPTION
			throw IllegalArgumentException("Unknown ResourceTypeEnum code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<ResourceTypeEnum>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("Account" == codeString) return new Enumeration(this, ResourceTypeEnum.ACCOUNT)
			if ("ActivityDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.ACTIVITYDEFINITION)
			if ("AdministrableProductDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION)
			if ("AdverseEvent" == codeString) return new Enumeration(this, ResourceTypeEnum.ADVERSEEVENT)
			if ("AllergyIntolerance" == codeString) return new Enumeration(this, ResourceTypeEnum.ALLERGYINTOLERANCE)
			if ("Appointment" == codeString) return new Enumeration(this, ResourceTypeEnum.APPOINTMENT)
			if ("AppointmentResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.APPOINTMENTRESPONSE)
			if ("AuditEvent" == codeString) return new Enumeration(this, ResourceTypeEnum.AUDITEVENT)
			if ("Basic" == codeString) return new Enumeration(this, ResourceTypeEnum.BASIC)
			if ("Binary" == codeString) return new Enumeration(this, ResourceTypeEnum.BINARY)
			if ("BiologicallyDerivedProduct" == codeString) return new Enumeration(this, ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT)
			if ("BodyStructure" == codeString) return new Enumeration(this, ResourceTypeEnum.BODYSTRUCTURE)
			if ("Bundle" == codeString) return new Enumeration(this, ResourceTypeEnum.BUNDLE)
			if ("CapabilityStatement" == codeString) return new Enumeration(this, ResourceTypeEnum.CAPABILITYSTATEMENT)
			if ("CapabilityStatement2" == codeString) return new Enumeration(this, ResourceTypeEnum.CAPABILITYSTATEMENT2)
			if ("CarePlan" == codeString) return new Enumeration(this, ResourceTypeEnum.CAREPLAN)
			if ("CareTeam" == codeString) return new Enumeration(this, ResourceTypeEnum.CARETEAM)
			if ("CatalogEntry" == codeString) return new Enumeration(this, ResourceTypeEnum.CATALOGENTRY)
			if ("ChargeItem" == codeString) return new Enumeration(this, ResourceTypeEnum.CHARGEITEM)
			if ("ChargeItemDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.CHARGEITEMDEFINITION)
			if ("Citation" == codeString) return new Enumeration(this, ResourceTypeEnum.CITATION)
			if ("Claim" == codeString) return new Enumeration(this, ResourceTypeEnum.CLAIM)
			if ("ClaimResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.CLAIMRESPONSE)
			if ("ClinicalImpression" == codeString) return new Enumeration(this, ResourceTypeEnum.CLINICALIMPRESSION)
			if ("ClinicalUseIssue" == codeString) return new Enumeration(this, ResourceTypeEnum.CLINICALUSEISSUE)
			if ("CodeSystem" == codeString) return new Enumeration(this, ResourceTypeEnum.CODESYSTEM)
			if ("Communication" == codeString) return new Enumeration(this, ResourceTypeEnum.COMMUNICATION)
			if ("CommunicationRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.COMMUNICATIONREQUEST)
			if ("CompartmentDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.COMPARTMENTDEFINITION)
			if ("Composition" == codeString) return new Enumeration(this, ResourceTypeEnum.COMPOSITION)
			if ("ConceptMap" == codeString) return new Enumeration(this, ResourceTypeEnum.CONCEPTMAP)
			if ("Condition" == codeString) return new Enumeration(this, ResourceTypeEnum.CONDITION)
			if ("ConditionDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.CONDITIONDEFINITION)
			if ("Consent" == codeString) return new Enumeration(this, ResourceTypeEnum.CONSENT)
			if ("Contract" == codeString) return new Enumeration(this, ResourceTypeEnum.CONTRACT)
			if ("Coverage" == codeString) return new Enumeration(this, ResourceTypeEnum.COVERAGE)
			if ("CoverageEligibilityRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST)
			if ("CoverageEligibilityResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE)
			if ("DetectedIssue" == codeString) return new Enumeration(this, ResourceTypeEnum.DETECTEDISSUE)
			if ("Device" == codeString) return new Enumeration(this, ResourceTypeEnum.DEVICE)
			if ("DeviceDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.DEVICEDEFINITION)
			if ("DeviceMetric" == codeString) return new Enumeration(this, ResourceTypeEnum.DEVICEMETRIC)
			if ("DeviceRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.DEVICEREQUEST)
			if ("DeviceUseStatement" == codeString) return new Enumeration(this, ResourceTypeEnum.DEVICEUSESTATEMENT)
			if ("DiagnosticReport" == codeString) return new Enumeration(this, ResourceTypeEnum.DIAGNOSTICREPORT)
			if ("DocumentManifest" == codeString) return new Enumeration(this, ResourceTypeEnum.DOCUMENTMANIFEST)
			if ("DocumentReference" == codeString) return new Enumeration(this, ResourceTypeEnum.DOCUMENTREFERENCE)
			if ("DomainResource" == codeString) return new Enumeration(this, ResourceTypeEnum.DOMAINRESOURCE)
			if ("Encounter" == codeString) return new Enumeration(this, ResourceTypeEnum.ENCOUNTER)
			if ("Endpoint" == codeString) return new Enumeration(this, ResourceTypeEnum.ENDPOINT)
			if ("EnrollmentRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.ENROLLMENTREQUEST)
			if ("EnrollmentResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.ENROLLMENTRESPONSE)
			if ("EpisodeOfCare" == codeString) return new Enumeration(this, ResourceTypeEnum.EPISODEOFCARE)
			if ("EventDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.EVENTDEFINITION)
			if ("Evidence" == codeString) return new Enumeration(this, ResourceTypeEnum.EVIDENCE)
			if ("EvidenceReport" == codeString) return new Enumeration(this, ResourceTypeEnum.EVIDENCEREPORT)
			if ("EvidenceVariable" == codeString) return new Enumeration(this, ResourceTypeEnum.EVIDENCEVARIABLE)
			if ("ExampleScenario" == codeString) return new Enumeration(this, ResourceTypeEnum.EXAMPLESCENARIO)
			if ("ExplanationOfBenefit" == codeString) return new Enumeration(this, ResourceTypeEnum.EXPLANATIONOFBENEFIT)
			if ("FamilyMemberHistory" == codeString) return new Enumeration(this, ResourceTypeEnum.FAMILYMEMBERHISTORY)
			if ("Flag" == codeString) return new Enumeration(this, ResourceTypeEnum.FLAG)
			if ("Goal" == codeString) return new Enumeration(this, ResourceTypeEnum.GOAL)
			if ("GraphDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.GRAPHDEFINITION)
			if ("Group" == codeString) return new Enumeration(this, ResourceTypeEnum.GROUP)
			if ("GuidanceResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.GUIDANCERESPONSE)
			if ("HealthcareService" == codeString) return new Enumeration(this, ResourceTypeEnum.HEALTHCARESERVICE)
			if ("ImagingStudy" == codeString) return new Enumeration(this, ResourceTypeEnum.IMAGINGSTUDY)
			if ("Immunization" == codeString) return new Enumeration(this, ResourceTypeEnum.IMMUNIZATION)
			if ("ImmunizationEvaluation" == codeString) return new Enumeration(this, ResourceTypeEnum.IMMUNIZATIONEVALUATION)
			if ("ImmunizationRecommendation" == codeString) return new Enumeration(this, ResourceTypeEnum.IMMUNIZATIONRECOMMENDATION)
			if ("ImplementationGuide" == codeString) return new Enumeration(this, ResourceTypeEnum.IMPLEMENTATIONGUIDE)
			if ("Ingredient" == codeString) return new Enumeration(this, ResourceTypeEnum.INGREDIENT)
			if ("InsurancePlan" == codeString) return new Enumeration(this, ResourceTypeEnum.INSURANCEPLAN)
			if ("Invoice" == codeString) return new Enumeration(this, ResourceTypeEnum.INVOICE)
			if ("Library" == codeString) return new Enumeration(this, ResourceTypeEnum.LIBRARY)
			if ("Linkage" == codeString) return new Enumeration(this, ResourceTypeEnum.LINKAGE)
			if ("List" == codeString) return new Enumeration(this, ResourceTypeEnum.LIST)
			if ("Location" == codeString) return new Enumeration(this, ResourceTypeEnum.LOCATION)
			if ("ManufacturedItemDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.MANUFACTUREDITEMDEFINITION)
			if ("Measure" == codeString) return new Enumeration(this, ResourceTypeEnum.MEASURE)
			if ("MeasureReport" == codeString) return new Enumeration(this, ResourceTypeEnum.MEASUREREPORT)
			if ("Medication" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATION)
			if ("MedicationAdministration" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATIONADMINISTRATION)
			if ("MedicationDispense" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATIONDISPENSE)
			if ("MedicationKnowledge" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATIONKNOWLEDGE)
			if ("MedicationRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATIONREQUEST)
			if ("MedicationUsage" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICATIONUSAGE)
			if ("MedicinalProductDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.MEDICINALPRODUCTDEFINITION)
			if ("MessageDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.MESSAGEDEFINITION)
			if ("MessageHeader" == codeString) return new Enumeration(this, ResourceTypeEnum.MESSAGEHEADER)
			if ("MolecularSequence" == codeString) return new Enumeration(this, ResourceTypeEnum.MOLECULARSEQUENCE)
			if ("NamingSystem" == codeString) return new Enumeration(this, ResourceTypeEnum.NAMINGSYSTEM)
			if ("NutritionIntake" == codeString) return new Enumeration(this, ResourceTypeEnum.NUTRITIONINTAKE)
			if ("NutritionOrder" == codeString) return new Enumeration(this, ResourceTypeEnum.NUTRITIONORDER)
			if ("NutritionProduct" == codeString) return new Enumeration(this, ResourceTypeEnum.NUTRITIONPRODUCT)
			if ("Observation" == codeString) return new Enumeration(this, ResourceTypeEnum.OBSERVATION)
			if ("ObservationDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.OBSERVATIONDEFINITION)
			if ("OperationDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.OPERATIONDEFINITION)
			if ("OperationOutcome" == codeString) return new Enumeration(this, ResourceTypeEnum.OPERATIONOUTCOME)
			if ("Organization" == codeString) return new Enumeration(this, ResourceTypeEnum.ORGANIZATION)
			if ("OrganizationAffiliation" == codeString) return new Enumeration(this, ResourceTypeEnum.ORGANIZATIONAFFILIATION)
			if ("PackagedProductDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION)
			if ("Parameters" == codeString) return new Enumeration(this, ResourceTypeEnum.PARAMETERS)
			if ("Patient" == codeString) return new Enumeration(this, ResourceTypeEnum.PATIENT)
			if ("PaymentNotice" == codeString) return new Enumeration(this, ResourceTypeEnum.PAYMENTNOTICE)
			if ("PaymentReconciliation" == codeString) return new Enumeration(this, ResourceTypeEnum.PAYMENTRECONCILIATION)
			if ("Permission" == codeString) return new Enumeration(this, ResourceTypeEnum.PERMISSION)
			if ("Person" == codeString) return new Enumeration(this, ResourceTypeEnum.PERSON)
			if ("PlanDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.PLANDEFINITION)
			if ("Practitioner" == codeString) return new Enumeration(this, ResourceTypeEnum.PRACTITIONER)
			if ("PractitionerRole" == codeString) return new Enumeration(this, ResourceTypeEnum.PRACTITIONERROLE)
			if ("Procedure" == codeString) return new Enumeration(this, ResourceTypeEnum.PROCEDURE)
			if ("Provenance" == codeString) return new Enumeration(this, ResourceTypeEnum.PROVENANCE)
			if ("Questionnaire" == codeString) return new Enumeration(this, ResourceTypeEnum.QUESTIONNAIRE)
			if ("QuestionnaireResponse" == codeString) return new Enumeration(this, ResourceTypeEnum.QUESTIONNAIRERESPONSE)
			if ("RegulatedAuthorization" == codeString) return new Enumeration(this, ResourceTypeEnum.REGULATEDAUTHORIZATION)
			if ("RelatedPerson" == codeString) return new Enumeration(this, ResourceTypeEnum.RELATEDPERSON)
			if ("RequestGroup" == codeString) return new Enumeration(this, ResourceTypeEnum.REQUESTGROUP)
			if ("ResearchStudy" == codeString) return new Enumeration(this, ResourceTypeEnum.RESEARCHSTUDY)
			if ("ResearchSubject" == codeString) return new Enumeration(this, ResourceTypeEnum.RESEARCHSUBJECT)
			if ("Resource" == codeString) return new Enumeration(this, ResourceTypeEnum.RESOURCE)
			if ("RiskAssessment" == codeString) return new Enumeration(this, ResourceTypeEnum.RISKASSESSMENT)
			if ("Schedule" == codeString) return new Enumeration(this, ResourceTypeEnum.SCHEDULE)
			if ("SearchParameter" == codeString) return new Enumeration(this, ResourceTypeEnum.SEARCHPARAMETER)
			if ("ServiceRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.SERVICEREQUEST)
			if ("Slot" == codeString) return new Enumeration(this, ResourceTypeEnum.SLOT)
			if ("Specimen" == codeString) return new Enumeration(this, ResourceTypeEnum.SPECIMEN)
			if ("SpecimenDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.SPECIMENDEFINITION)
			if ("StructureDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.STRUCTUREDEFINITION)
			if ("StructureMap" == codeString) return new Enumeration(this, ResourceTypeEnum.STRUCTUREMAP)
			if ("Subscription" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSCRIPTION)
			if ("SubscriptionStatus" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSCRIPTIONSTATUS)
			if ("SubscriptionTopic" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSCRIPTIONTOPIC)
			if ("Substance" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCE)
			if ("SubstanceDefinition" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCEDEFINITION)
			if ("SubstanceNucleicAcid" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCENUCLEICACID)
			if ("SubstancePolymer" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCEPOLYMER)
			if ("SubstanceProtein" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCEPROTEIN)
			if ("SubstanceReferenceInformation" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCEREFERENCEINFORMATION)
			if ("SubstanceSourceMaterial" == codeString) return new Enumeration(this, ResourceTypeEnum.SUBSTANCESOURCEMATERIAL)
			if ("SupplyDelivery" == codeString) return new Enumeration(this, ResourceTypeEnum.SUPPLYDELIVERY)
			if ("SupplyRequest" == codeString) return new Enumeration(this, ResourceTypeEnum.SUPPLYREQUEST)
			if ("Task" == codeString) return new Enumeration(this, ResourceTypeEnum.TASK)
			if ("TerminologyCapabilities" == codeString) return new Enumeration(this, ResourceTypeEnum.TERMINOLOGYCAPABILITIES)
			if ("TestReport" == codeString) return new Enumeration(this, ResourceTypeEnum.TESTREPORT)
			if ("TestScript" == codeString) return new Enumeration(this, ResourceTypeEnum.TESTSCRIPT)
			if ("ValueSet" == codeString) return new Enumeration(this, ResourceTypeEnum.VALUESET)
			if ("VerificationResult" == codeString) return new Enumeration(this, ResourceTypeEnum.VERIFICATIONRESULT)
			if ("VisionPrescription" == codeString) return new Enumeration(this, ResourceTypeEnum.VISIONPRESCRIPTION)
			throw FHIRException("Unknown ResourceTypeEnum code '$codeString'")
		}
		override fun toCode(code: ResourceTypeEnum): String? {
			return when (code) {
				ResourceTypeEnum.ACCOUNT -> "Account"
				ResourceTypeEnum.ACTIVITYDEFINITION -> "ActivityDefinition"
				ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION -> "AdministrableProductDefinition"
				ResourceTypeEnum.ADVERSEEVENT -> "AdverseEvent"
				ResourceTypeEnum.ALLERGYINTOLERANCE -> "AllergyIntolerance"
				ResourceTypeEnum.APPOINTMENT -> "Appointment"
				ResourceTypeEnum.APPOINTMENTRESPONSE -> "AppointmentResponse"
				ResourceTypeEnum.AUDITEVENT -> "AuditEvent"
				ResourceTypeEnum.BASIC -> "Basic"
				ResourceTypeEnum.BINARY -> "Binary"
				ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT -> "BiologicallyDerivedProduct"
				ResourceTypeEnum.BODYSTRUCTURE -> "BodyStructure"
				ResourceTypeEnum.BUNDLE -> "Bundle"
				ResourceTypeEnum.CAPABILITYSTATEMENT -> "CapabilityStatement"
				ResourceTypeEnum.CAPABILITYSTATEMENT2 -> "CapabilityStatement2"
				ResourceTypeEnum.CAREPLAN -> "CarePlan"
				ResourceTypeEnum.CARETEAM -> "CareTeam"
				ResourceTypeEnum.CATALOGENTRY -> "CatalogEntry"
				ResourceTypeEnum.CHARGEITEM -> "ChargeItem"
				ResourceTypeEnum.CHARGEITEMDEFINITION -> "ChargeItemDefinition"
				ResourceTypeEnum.CITATION -> "Citation"
				ResourceTypeEnum.CLAIM -> "Claim"
				ResourceTypeEnum.CLAIMRESPONSE -> "ClaimResponse"
				ResourceTypeEnum.CLINICALIMPRESSION -> "ClinicalImpression"
				ResourceTypeEnum.CLINICALUSEISSUE -> "ClinicalUseIssue"
				ResourceTypeEnum.CODESYSTEM -> "CodeSystem"
				ResourceTypeEnum.COMMUNICATION -> "Communication"
				ResourceTypeEnum.COMMUNICATIONREQUEST -> "CommunicationRequest"
				ResourceTypeEnum.COMPARTMENTDEFINITION -> "CompartmentDefinition"
				ResourceTypeEnum.COMPOSITION -> "Composition"
				ResourceTypeEnum.CONCEPTMAP -> "ConceptMap"
				ResourceTypeEnum.CONDITION -> "Condition"
				ResourceTypeEnum.CONDITIONDEFINITION -> "ConditionDefinition"
				ResourceTypeEnum.CONSENT -> "Consent"
				ResourceTypeEnum.CONTRACT -> "Contract"
				ResourceTypeEnum.COVERAGE -> "Coverage"
				ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST -> "CoverageEligibilityRequest"
				ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE -> "CoverageEligibilityResponse"
				ResourceTypeEnum.DETECTEDISSUE -> "DetectedIssue"
				ResourceTypeEnum.DEVICE -> "Device"
				ResourceTypeEnum.DEVICEDEFINITION -> "DeviceDefinition"
				ResourceTypeEnum.DEVICEMETRIC -> "DeviceMetric"
				ResourceTypeEnum.DEVICEREQUEST -> "DeviceRequest"
				ResourceTypeEnum.DEVICEUSESTATEMENT -> "DeviceUseStatement"
				ResourceTypeEnum.DIAGNOSTICREPORT -> "DiagnosticReport"
				ResourceTypeEnum.DOCUMENTMANIFEST -> "DocumentManifest"
				ResourceTypeEnum.DOCUMENTREFERENCE -> "DocumentReference"
				ResourceTypeEnum.DOMAINRESOURCE -> "DomainResource"
				ResourceTypeEnum.ENCOUNTER -> "Encounter"
				ResourceTypeEnum.ENDPOINT -> "Endpoint"
				ResourceTypeEnum.ENROLLMENTREQUEST -> "EnrollmentRequest"
				ResourceTypeEnum.ENROLLMENTRESPONSE -> "EnrollmentResponse"
				ResourceTypeEnum.EPISODEOFCARE -> "EpisodeOfCare"
				ResourceTypeEnum.EVENTDEFINITION -> "EventDefinition"
				ResourceTypeEnum.EVIDENCE -> "Evidence"
				ResourceTypeEnum.EVIDENCEREPORT -> "EvidenceReport"
				ResourceTypeEnum.EVIDENCEVARIABLE -> "EvidenceVariable"
				ResourceTypeEnum.EXAMPLESCENARIO -> "ExampleScenario"
				ResourceTypeEnum.EXPLANATIONOFBENEFIT -> "ExplanationOfBenefit"
				ResourceTypeEnum.FAMILYMEMBERHISTORY -> "FamilyMemberHistory"
				ResourceTypeEnum.FLAG -> "Flag"
				ResourceTypeEnum.GOAL -> "Goal"
				ResourceTypeEnum.GRAPHDEFINITION -> "GraphDefinition"
				ResourceTypeEnum.GROUP -> "Group"
				ResourceTypeEnum.GUIDANCERESPONSE -> "GuidanceResponse"
				ResourceTypeEnum.HEALTHCARESERVICE -> "HealthcareService"
				ResourceTypeEnum.IMAGINGSTUDY -> "ImagingStudy"
				ResourceTypeEnum.IMMUNIZATION -> "Immunization"
				ResourceTypeEnum.IMMUNIZATIONEVALUATION -> "ImmunizationEvaluation"
				ResourceTypeEnum.IMMUNIZATIONRECOMMENDATION -> "ImmunizationRecommendation"
				ResourceTypeEnum.IMPLEMENTATIONGUIDE -> "ImplementationGuide"
				ResourceTypeEnum.INGREDIENT -> "Ingredient"
				ResourceTypeEnum.INSURANCEPLAN -> "InsurancePlan"
				ResourceTypeEnum.INVOICE -> "Invoice"
				ResourceTypeEnum.LIBRARY -> "Library"
				ResourceTypeEnum.LINKAGE -> "Linkage"
				ResourceTypeEnum.LIST -> "List"
				ResourceTypeEnum.LOCATION -> "Location"
				ResourceTypeEnum.MANUFACTUREDITEMDEFINITION -> "ManufacturedItemDefinition"
				ResourceTypeEnum.MEASURE -> "Measure"
				ResourceTypeEnum.MEASUREREPORT -> "MeasureReport"
				ResourceTypeEnum.MEDICATION -> "Medication"
				ResourceTypeEnum.MEDICATIONADMINISTRATION -> "MedicationAdministration"
				ResourceTypeEnum.MEDICATIONDISPENSE -> "MedicationDispense"
				ResourceTypeEnum.MEDICATIONKNOWLEDGE -> "MedicationKnowledge"
				ResourceTypeEnum.MEDICATIONREQUEST -> "MedicationRequest"
				ResourceTypeEnum.MEDICATIONUSAGE -> "MedicationUsage"
				ResourceTypeEnum.MEDICINALPRODUCTDEFINITION -> "MedicinalProductDefinition"
				ResourceTypeEnum.MESSAGEDEFINITION -> "MessageDefinition"
				ResourceTypeEnum.MESSAGEHEADER -> "MessageHeader"
				ResourceTypeEnum.MOLECULARSEQUENCE -> "MolecularSequence"
				ResourceTypeEnum.NAMINGSYSTEM -> "NamingSystem"
				ResourceTypeEnum.NUTRITIONINTAKE -> "NutritionIntake"
				ResourceTypeEnum.NUTRITIONORDER -> "NutritionOrder"
				ResourceTypeEnum.NUTRITIONPRODUCT -> "NutritionProduct"
				ResourceTypeEnum.OBSERVATION -> "Observation"
				ResourceTypeEnum.OBSERVATIONDEFINITION -> "ObservationDefinition"
				ResourceTypeEnum.OPERATIONDEFINITION -> "OperationDefinition"
				ResourceTypeEnum.OPERATIONOUTCOME -> "OperationOutcome"
				ResourceTypeEnum.ORGANIZATION -> "Organization"
				ResourceTypeEnum.ORGANIZATIONAFFILIATION -> "OrganizationAffiliation"
				ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION -> "PackagedProductDefinition"
				ResourceTypeEnum.PARAMETERS -> "Parameters"
				ResourceTypeEnum.PATIENT -> "Patient"
				ResourceTypeEnum.PAYMENTNOTICE -> "PaymentNotice"
				ResourceTypeEnum.PAYMENTRECONCILIATION -> "PaymentReconciliation"
				ResourceTypeEnum.PERMISSION -> "Permission"
				ResourceTypeEnum.PERSON -> "Person"
				ResourceTypeEnum.PLANDEFINITION -> "PlanDefinition"
				ResourceTypeEnum.PRACTITIONER -> "Practitioner"
				ResourceTypeEnum.PRACTITIONERROLE -> "PractitionerRole"
				ResourceTypeEnum.PROCEDURE -> "Procedure"
				ResourceTypeEnum.PROVENANCE -> "Provenance"
				ResourceTypeEnum.QUESTIONNAIRE -> "Questionnaire"
				ResourceTypeEnum.QUESTIONNAIRERESPONSE -> "QuestionnaireResponse"
				ResourceTypeEnum.REGULATEDAUTHORIZATION -> "RegulatedAuthorization"
				ResourceTypeEnum.RELATEDPERSON -> "RelatedPerson"
				ResourceTypeEnum.REQUESTGROUP -> "RequestGroup"
				ResourceTypeEnum.RESEARCHSTUDY -> "ResearchStudy"
				ResourceTypeEnum.RESEARCHSUBJECT -> "ResearchSubject"
				ResourceTypeEnum.RESOURCE -> "Resource"
				ResourceTypeEnum.RISKASSESSMENT -> "RiskAssessment"
				ResourceTypeEnum.SCHEDULE -> "Schedule"
				ResourceTypeEnum.SEARCHPARAMETER -> "SearchParameter"
				ResourceTypeEnum.SERVICEREQUEST -> "ServiceRequest"
				ResourceTypeEnum.SLOT -> "Slot"
				ResourceTypeEnum.SPECIMEN -> "Specimen"
				ResourceTypeEnum.SPECIMENDEFINITION -> "SpecimenDefinition"
				ResourceTypeEnum.STRUCTUREDEFINITION -> "StructureDefinition"
				ResourceTypeEnum.STRUCTUREMAP -> "StructureMap"
				ResourceTypeEnum.SUBSCRIPTION -> "Subscription"
				ResourceTypeEnum.SUBSCRIPTIONSTATUS -> "SubscriptionStatus"
				ResourceTypeEnum.SUBSCRIPTIONTOPIC -> "SubscriptionTopic"
				ResourceTypeEnum.SUBSTANCE -> "Substance"
				ResourceTypeEnum.SUBSTANCEDEFINITION -> "SubstanceDefinition"
				ResourceTypeEnum.SUBSTANCENUCLEICACID -> "SubstanceNucleicAcid"
				ResourceTypeEnum.SUBSTANCEPOLYMER -> "SubstancePolymer"
				ResourceTypeEnum.SUBSTANCEPROTEIN -> "SubstanceProtein"
				ResourceTypeEnum.SUBSTANCEREFERENCEINFORMATION -> "SubstanceReferenceInformation"
				ResourceTypeEnum.SUBSTANCESOURCEMATERIAL -> "SubstanceSourceMaterial"
				ResourceTypeEnum.SUPPLYDELIVERY -> "SupplyDelivery"
				ResourceTypeEnum.SUPPLYREQUEST -> "SupplyRequest"
				ResourceTypeEnum.TASK -> "Task"
				ResourceTypeEnum.TERMINOLOGYCAPABILITIES -> "TerminologyCapabilities"
				ResourceTypeEnum.TESTREPORT -> "TestReport"
				ResourceTypeEnum.TESTSCRIPT -> "TestScript"
				ResourceTypeEnum.VALUESET -> "ValueSet"
				ResourceTypeEnum.VERIFICATIONRESULT -> "VerificationResult"
				ResourceTypeEnum.VISIONPRESCRIPTION -> "VisionPrescription"
				NULL -> null
			}
		}
		override fun toSystem(code: ResourceTypeEnum): String? {
			return code.system
		}
    }

	enum class RestfulCapabilityMode {
		/**
		* The application acts as a client for this resource.
		*/
		CLIENT, 
		/**
		* The application acts as a server for this resource.
		*/
		SERVER, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				CLIENT -> "client"
				SERVER -> "server"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				CLIENT -> "http://hl7.org/fhir/restful-capability-mode"
				SERVER -> "http://hl7.org/fhir/restful-capability-mode"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				CLIENT -> "The application acts as a client for this resource."
				SERVER -> "The application acts as a server for this resource."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				CLIENT -> "Client";
				SERVER -> "Server";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): RestfulCapabilityMode? {
				if (codeString == null || "" == codeString) return null
				if ("client" == codeString) return CLIENT
				if ("server" == codeString) return SERVER
				throw FHIRException("Unknown RestfulCapabilityMode code '"$codeString"'")
			}
		}
	}

	class RestfulCapabilityModeEnumFactory : EnumFactory<RestfulCapabilityMode> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): RestfulCapabilityMode? {
			if (codeString == null || "" == codeString) return null
			if ("client" == codeString) return RestfulCapabilityMode.CLIENT
			if ("server" == codeString) return RestfulCapabilityMode.SERVER
			throw IllegalArgumentException("Unknown RestfulCapabilityMode code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<RestfulCapabilityMode>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("client" == codeString) return new Enumeration(this, RestfulCapabilityMode.CLIENT)
			if ("server" == codeString) return new Enumeration(this, RestfulCapabilityMode.SERVER)
			throw FHIRException("Unknown RestfulCapabilityMode code '$codeString'")
		}
		override fun toCode(code: RestfulCapabilityMode): String? {
			return when (code) {
				RestfulCapabilityMode.CLIENT -> "client"
				RestfulCapabilityMode.SERVER -> "server"
				NULL -> null
			}
		}
		override fun toSystem(code: RestfulCapabilityMode): String? {
			return code.system
		}
    }

	enum class SearchParamType {
		/**
		* Search parameter SHALL be a number (a whole number, or a decimal).
		*/
		NUMBER, 
		/**
		* Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
		*/
		DATE, 
		/**
		* Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
		*/
		STRING, 
		/**
		* Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
		*/
		TOKEN, 
		/**
		* A reference to another resource (Reference or canonical).
		*/
		REFERENCE, 
		/**
		* A composite search parameter that combines a search on two values together.
		*/
		COMPOSITE, 
		/**
		* A search parameter that searches on a quantity.
		*/
		QUANTITY, 
		/**
		* A search parameter that searches on a URI (RFC 3986).
		*/
		URI, 
		/**
		* Special logic applies to this parameter per the description of the search parameter.
		*/
		SPECIAL, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				NUMBER -> "number"
				DATE -> "date"
				STRING -> "string"
				TOKEN -> "token"
				REFERENCE -> "reference"
				COMPOSITE -> "composite"
				QUANTITY -> "quantity"
				URI -> "uri"
				SPECIAL -> "special"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				NUMBER -> "http://hl7.org/fhir/search-param-type"
				DATE -> "http://hl7.org/fhir/search-param-type"
				STRING -> "http://hl7.org/fhir/search-param-type"
				TOKEN -> "http://hl7.org/fhir/search-param-type"
				REFERENCE -> "http://hl7.org/fhir/search-param-type"
				COMPOSITE -> "http://hl7.org/fhir/search-param-type"
				QUANTITY -> "http://hl7.org/fhir/search-param-type"
				URI -> "http://hl7.org/fhir/search-param-type"
				SPECIAL -> "http://hl7.org/fhir/search-param-type"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				NUMBER -> "Search parameter SHALL be a number (a whole number, or a decimal)."
				DATE -> "Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported."
				STRING -> "Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces."
				TOKEN -> "Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a \"|\", depending on the modifier used."
				REFERENCE -> "A reference to another resource (Reference or canonical)."
				COMPOSITE -> "A composite search parameter that combines a search on two values together."
				QUANTITY -> "A search parameter that searches on a quantity."
				URI -> "A search parameter that searches on a URI (RFC 3986)."
				SPECIAL -> "Special logic applies to this parameter per the description of the search parameter."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				NUMBER -> "Number";
				DATE -> "Date/DateTime";
				STRING -> "String";
				TOKEN -> "Token";
				REFERENCE -> "Reference";
				COMPOSITE -> "Composite";
				QUANTITY -> "Quantity";
				URI -> "URI";
				SPECIAL -> "Special";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): SearchParamType? {
				if (codeString == null || "" == codeString) return null
				if ("number" == codeString) return NUMBER
				if ("date" == codeString) return DATE
				if ("string" == codeString) return STRING
				if ("token" == codeString) return TOKEN
				if ("reference" == codeString) return REFERENCE
				if ("composite" == codeString) return COMPOSITE
				if ("quantity" == codeString) return QUANTITY
				if ("uri" == codeString) return URI
				if ("special" == codeString) return SPECIAL
				throw FHIRException("Unknown SearchParamType code '"$codeString"'")
			}
		}
	}

	class SearchParamTypeEnumFactory : EnumFactory<SearchParamType> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): SearchParamType? {
			if (codeString == null || "" == codeString) return null
			if ("number" == codeString) return SearchParamType.NUMBER
			if ("date" == codeString) return SearchParamType.DATE
			if ("string" == codeString) return SearchParamType.STRING
			if ("token" == codeString) return SearchParamType.TOKEN
			if ("reference" == codeString) return SearchParamType.REFERENCE
			if ("composite" == codeString) return SearchParamType.COMPOSITE
			if ("quantity" == codeString) return SearchParamType.QUANTITY
			if ("uri" == codeString) return SearchParamType.URI
			if ("special" == codeString) return SearchParamType.SPECIAL
			throw IllegalArgumentException("Unknown SearchParamType code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<SearchParamType>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("number" == codeString) return new Enumeration(this, SearchParamType.NUMBER)
			if ("date" == codeString) return new Enumeration(this, SearchParamType.DATE)
			if ("string" == codeString) return new Enumeration(this, SearchParamType.STRING)
			if ("token" == codeString) return new Enumeration(this, SearchParamType.TOKEN)
			if ("reference" == codeString) return new Enumeration(this, SearchParamType.REFERENCE)
			if ("composite" == codeString) return new Enumeration(this, SearchParamType.COMPOSITE)
			if ("quantity" == codeString) return new Enumeration(this, SearchParamType.QUANTITY)
			if ("uri" == codeString) return new Enumeration(this, SearchParamType.URI)
			if ("special" == codeString) return new Enumeration(this, SearchParamType.SPECIAL)
			throw FHIRException("Unknown SearchParamType code '$codeString'")
		}
		override fun toCode(code: SearchParamType): String? {
			return when (code) {
				SearchParamType.NUMBER -> "number"
				SearchParamType.DATE -> "date"
				SearchParamType.STRING -> "string"
				SearchParamType.TOKEN -> "token"
				SearchParamType.REFERENCE -> "reference"
				SearchParamType.COMPOSITE -> "composite"
				SearchParamType.QUANTITY -> "quantity"
				SearchParamType.URI -> "uri"
				SearchParamType.SPECIAL -> "special"
				NULL -> null
			}
		}
		override fun toSystem(code: SearchParamType): String? {
			return code.system
		}
    }

	enum class SubscriptionSearchModifier {
		/**
		* Used to match a value according to FHIR Search rules (e.g., Patient/123, Encounter/2002).
		*/
		EQUAL, 
		/**
		* The value for the parameter in the resource is equal to the provided value.
		*/
		EQ, 
		/**
		* The value for the parameter in the resource is not equal to the provided value.
		*/
		NE, 
		/**
		* The value for the parameter in the resource is greater than the provided value.
		*/
		GT, 
		/**
		* The value for the parameter in the resource is less than the provided value.
		*/
		LT, 
		/**
		* The value for the parameter in the resource is greater or equal to the provided value.
		*/
		GE, 
		/**
		* The value for the parameter in the resource is less or equal to the provided value.
		*/
		LE, 
		/**
		* The value for the parameter in the resource starts after the provided value.
		*/
		SA, 
		/**
		* The value for the parameter in the resource ends before the provided value.
		*/
		EB, 
		/**
		* The value for the parameter in the resource is approximately the same to the provided value. Note that the recommended value for the approximation is 10% of the stated value (or for a date, 10% of the gap between now and the date), but systems may choose other values where appropriate.
		*/
		AP, 
		/**
		* The search parameter is a concept with the form [system]|[code], and the search parameter tests whether the coding in a resource subsumes the specified search code.
		*/
		ABOVE, 
		/**
		* The search parameter is a concept with the form [system]|[code], and the search parameter tests whether the coding in a resource is subsumed by the specified search code.
		*/
		BELOW, 
		/**
		* The search parameter is a member of a Group or List, or the search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the value is present in the specified Group, List, or Value Set.
		*/
		IN, 
		/**
		* The search parameter is a member of a Group or List, or the search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the value is NOT present in the specified Group, List, or Value Set.
		*/
		NOTIN, 
		/**
		* The search parameter has the format system|code|value, where the system and code refer to a Identifier.type.coding.system and .code, and match if any of the type codes match. All 3 parts must be present.
		*/
		OFTYPE, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				EQUAL -> "="
				EQ -> "eq"
				NE -> "ne"
				GT -> "gt"
				LT -> "lt"
				GE -> "ge"
				LE -> "le"
				SA -> "sa"
				EB -> "eb"
				AP -> "ap"
				ABOVE -> "above"
				BELOW -> "below"
				IN -> "in"
				NOTIN -> "not-in"
				OFTYPE -> "of-type"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				EQUAL -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				EQ -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				NE -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				GT -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				LT -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				GE -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				LE -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				SA -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				EB -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				AP -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				ABOVE -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				BELOW -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				IN -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				NOTIN -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				OFTYPE -> "http://terminology.hl7.org/CodeSystem/subscription-search-modifier"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				EQUAL -> "Used to match a value according to FHIR Search rules (e.g., Patient/123, Encounter/2002)."
				EQ -> "The value for the parameter in the resource is equal to the provided value."
				NE -> "The value for the parameter in the resource is not equal to the provided value."
				GT -> "The value for the parameter in the resource is greater than the provided value."
				LT -> "The value for the parameter in the resource is less than the provided value."
				GE -> "The value for the parameter in the resource is greater or equal to the provided value."
				LE -> "The value for the parameter in the resource is less or equal to the provided value."
				SA -> "The value for the parameter in the resource starts after the provided value."
				EB -> "The value for the parameter in the resource ends before the provided value."
				AP -> "The value for the parameter in the resource is approximately the same to the provided value. Note that the recommended value for the approximation is 10% of the stated value (or for a date, 10% of the gap between now and the date), but systems may choose other values where appropriate."
				ABOVE -> "The search parameter is a concept with the form [system]|[code], and the search parameter tests whether the coding in a resource subsumes the specified search code."
				BELOW -> "The search parameter is a concept with the form [system]|[code], and the search parameter tests whether the coding in a resource is subsumed by the specified search code."
				IN -> "The search parameter is a member of a Group or List, or the search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the value is present in the specified Group, List, or Value Set."
				NOTIN -> "The search parameter is a member of a Group or List, or the search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the value is NOT present in the specified Group, List, or Value Set."
				OFTYPE -> "The search parameter has the format system|code|value, where the system and code refer to a Identifier.type.coding.system and .code, and match if any of the type codes match. All 3 parts must be present."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				EQUAL -> "=";
				EQ -> "Equal";
				NE -> "Not Equal";
				GT -> "Greater Than";
				LT -> "Less Than";
				GE -> "Greater Than or Equal";
				LE -> "Less Than or Equal";
				SA -> "Starts After";
				EB -> "Ends Before";
				AP -> "Approximately";
				ABOVE -> "Above";
				BELOW -> "Below";
				IN -> "In";
				NOTIN -> "Not In";
				OFTYPE -> "Of Type";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): SubscriptionSearchModifier? {
				if (codeString == null || "" == codeString) return null
				if ("=" == codeString) return EQUAL
				if ("eq" == codeString) return EQ
				if ("ne" == codeString) return NE
				if ("gt" == codeString) return GT
				if ("lt" == codeString) return LT
				if ("ge" == codeString) return GE
				if ("le" == codeString) return LE
				if ("sa" == codeString) return SA
				if ("eb" == codeString) return EB
				if ("ap" == codeString) return AP
				if ("above" == codeString) return ABOVE
				if ("below" == codeString) return BELOW
				if ("in" == codeString) return IN
				if ("not-in" == codeString) return NOTIN
				if ("of-type" == codeString) return OFTYPE
				throw FHIRException("Unknown SubscriptionSearchModifier code '"$codeString"'")
			}
		}
	}

	class SubscriptionSearchModifierEnumFactory : EnumFactory<SubscriptionSearchModifier> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): SubscriptionSearchModifier? {
			if (codeString == null || "" == codeString) return null
			if ("=" == codeString) return SubscriptionSearchModifier.EQUAL
			if ("eq" == codeString) return SubscriptionSearchModifier.EQ
			if ("ne" == codeString) return SubscriptionSearchModifier.NE
			if ("gt" == codeString) return SubscriptionSearchModifier.GT
			if ("lt" == codeString) return SubscriptionSearchModifier.LT
			if ("ge" == codeString) return SubscriptionSearchModifier.GE
			if ("le" == codeString) return SubscriptionSearchModifier.LE
			if ("sa" == codeString) return SubscriptionSearchModifier.SA
			if ("eb" == codeString) return SubscriptionSearchModifier.EB
			if ("ap" == codeString) return SubscriptionSearchModifier.AP
			if ("above" == codeString) return SubscriptionSearchModifier.ABOVE
			if ("below" == codeString) return SubscriptionSearchModifier.BELOW
			if ("in" == codeString) return SubscriptionSearchModifier.IN
			if ("not-in" == codeString) return SubscriptionSearchModifier.NOTIN
			if ("of-type" == codeString) return SubscriptionSearchModifier.OFTYPE
			throw IllegalArgumentException("Unknown SubscriptionSearchModifier code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<SubscriptionSearchModifier>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("=" == codeString) return new Enumeration(this, SubscriptionSearchModifier.EQUAL)
			if ("eq" == codeString) return new Enumeration(this, SubscriptionSearchModifier.EQ)
			if ("ne" == codeString) return new Enumeration(this, SubscriptionSearchModifier.NE)
			if ("gt" == codeString) return new Enumeration(this, SubscriptionSearchModifier.GT)
			if ("lt" == codeString) return new Enumeration(this, SubscriptionSearchModifier.LT)
			if ("ge" == codeString) return new Enumeration(this, SubscriptionSearchModifier.GE)
			if ("le" == codeString) return new Enumeration(this, SubscriptionSearchModifier.LE)
			if ("sa" == codeString) return new Enumeration(this, SubscriptionSearchModifier.SA)
			if ("eb" == codeString) return new Enumeration(this, SubscriptionSearchModifier.EB)
			if ("ap" == codeString) return new Enumeration(this, SubscriptionSearchModifier.AP)
			if ("above" == codeString) return new Enumeration(this, SubscriptionSearchModifier.ABOVE)
			if ("below" == codeString) return new Enumeration(this, SubscriptionSearchModifier.BELOW)
			if ("in" == codeString) return new Enumeration(this, SubscriptionSearchModifier.IN)
			if ("not-in" == codeString) return new Enumeration(this, SubscriptionSearchModifier.NOTIN)
			if ("of-type" == codeString) return new Enumeration(this, SubscriptionSearchModifier.OFTYPE)
			throw FHIRException("Unknown SubscriptionSearchModifier code '$codeString'")
		}
		override fun toCode(code: SubscriptionSearchModifier): String? {
			return when (code) {
				SubscriptionSearchModifier.EQUAL -> "="
				SubscriptionSearchModifier.EQ -> "eq"
				SubscriptionSearchModifier.NE -> "ne"
				SubscriptionSearchModifier.GT -> "gt"
				SubscriptionSearchModifier.LT -> "lt"
				SubscriptionSearchModifier.GE -> "ge"
				SubscriptionSearchModifier.LE -> "le"
				SubscriptionSearchModifier.SA -> "sa"
				SubscriptionSearchModifier.EB -> "eb"
				SubscriptionSearchModifier.AP -> "ap"
				SubscriptionSearchModifier.ABOVE -> "above"
				SubscriptionSearchModifier.BELOW -> "below"
				SubscriptionSearchModifier.IN -> "in"
				SubscriptionSearchModifier.NOTIN -> "not-in"
				SubscriptionSearchModifier.OFTYPE -> "of-type"
				NULL -> null
			}
		}
		override fun toSystem(code: SubscriptionSearchModifier): String? {
			return code.system
		}
    }

	enum class SubscriptionState {
		/**
		* The client has requested the subscription, and the server has not yet set it up.
		*/
		REQUESTED, 
		/**
		* The subscription is active.
		*/
		ACTIVE, 
		/**
		* The server has an error executing the notification.
		*/
		ERROR, 
		/**
		* Too many errors have occurred or the subscription has expired.
		*/
		OFF, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				REQUESTED -> "requested"
				ACTIVE -> "active"
				ERROR -> "error"
				OFF -> "off"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				REQUESTED -> "http://terminology.hl7.org/CodeSystem/subscription-state"
				ACTIVE -> "http://terminology.hl7.org/CodeSystem/subscription-state"
				ERROR -> "http://terminology.hl7.org/CodeSystem/subscription-state"
				OFF -> "http://terminology.hl7.org/CodeSystem/subscription-state"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				REQUESTED -> "The client has requested the subscription, and the server has not yet set it up."
				ACTIVE -> "The subscription is active."
				ERROR -> "The server has an error executing the notification."
				OFF -> "Too many errors have occurred or the subscription has expired."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				REQUESTED -> "Requested";
				ACTIVE -> "Active";
				ERROR -> "Error";
				OFF -> "Off";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): SubscriptionState? {
				if (codeString == null || "" == codeString) return null
				if ("requested" == codeString) return REQUESTED
				if ("active" == codeString) return ACTIVE
				if ("error" == codeString) return ERROR
				if ("off" == codeString) return OFF
				throw FHIRException("Unknown SubscriptionState code '"$codeString"'")
			}
		}
	}

	class SubscriptionStateEnumFactory : EnumFactory<SubscriptionState> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): SubscriptionState? {
			if (codeString == null || "" == codeString) return null
			if ("requested" == codeString) return SubscriptionState.REQUESTED
			if ("active" == codeString) return SubscriptionState.ACTIVE
			if ("error" == codeString) return SubscriptionState.ERROR
			if ("off" == codeString) return SubscriptionState.OFF
			throw IllegalArgumentException("Unknown SubscriptionState code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<SubscriptionState>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("requested" == codeString) return new Enumeration(this, SubscriptionState.REQUESTED)
			if ("active" == codeString) return new Enumeration(this, SubscriptionState.ACTIVE)
			if ("error" == codeString) return new Enumeration(this, SubscriptionState.ERROR)
			if ("off" == codeString) return new Enumeration(this, SubscriptionState.OFF)
			throw FHIRException("Unknown SubscriptionState code '$codeString'")
		}
		override fun toCode(code: SubscriptionState): String? {
			return when (code) {
				SubscriptionState.REQUESTED -> "requested"
				SubscriptionState.ACTIVE -> "active"
				SubscriptionState.ERROR -> "error"
				SubscriptionState.OFF -> "off"
				NULL -> null
			}
		}
		override fun toSystem(code: SubscriptionState): String? {
			return code.system
		}
    }

	enum class Use {
		/**
		* The treatment is complete and this represents a Claim for the services.
		*/
		CLAIM, 
		/**
		* The treatment is proposed and this represents a Pre-authorization for the services.
		*/
		PREAUTHORIZATION, 
		/**
		* The treatment is proposed and this represents a Pre-determination for the services.
		*/
		PREDETERMINATION, 
		/**
		* added to help the parsers
		*/
		NULL;
		fun toCode() {
			return when (this) {
				CLAIM -> "claim"
				PREAUTHORIZATION -> "preauthorization"
				PREDETERMINATION -> "predetermination"
				NULL -> null
			}
		}
		val system: String?
			get() = when (this) {
				CLAIM -> "http://hl7.org/fhir/claim-use"
				PREAUTHORIZATION -> "http://hl7.org/fhir/claim-use"
				PREDETERMINATION -> "http://hl7.org/fhir/claim-use"
				NULL -> null
			}
		val definition: String?
			get() = when (this) {
				CLAIM -> "The treatment is complete and this represents a Claim for the services."
				PREAUTHORIZATION -> "The treatment is proposed and this represents a Pre-authorization for the services."
				PREDETERMINATION -> "The treatment is proposed and this represents a Pre-determination for the services."
				NULL -> null
			}
		val display: String?
			get() = when (this) {
				CLAIM -> "Claim";
				PREAUTHORIZATION -> "Preauthorization";
				PREDETERMINATION -> "Predetermination";
				NULL -> null
			}
		companion object {
			@Throws(FHIRException::class)
			fun fromCode(codeString: String?): Use? {
				if (codeString == null || "" == codeString) return null
				if ("claim" == codeString) return CLAIM
				if ("preauthorization" == codeString) return PREAUTHORIZATION
				if ("predetermination" == codeString) return PREDETERMINATION
				throw FHIRException("Unknown Use code '"$codeString"'")
			}
		}
	}

	class UseEnumFactory : EnumFactory<Use> {
		@Throws(IllegalArgumentException::class)
		override fun fromCode(codeString: String?): Use? {
			if (codeString == null || "" == codeString) return null
			if ("claim" == codeString) return Use.CLAIM
			if ("preauthorization" == codeString) return Use.PREAUTHORIZATION
			if ("predetermination" == codeString) return Use.PREDETERMINATION
			throw IllegalArgumentException("Unknown Use code '$codeString'")
		}
		@Throws(FHIRException::class)
		fun fromType(code: Base?): Enumeration<Use>? {
			if (code == null) return null
			if (code.isEmpty) return Enumeration(this)
			val codeString = (code as PrimitiveType<*>).asStringValue()
			if (codeString == null || "" == codeString) return null
			if ("claim" == codeString) return new Enumeration(this, Use.CLAIM)
			if ("preauthorization" == codeString) return new Enumeration(this, Use.PREAUTHORIZATION)
			if ("predetermination" == codeString) return new Enumeration(this, Use.PREDETERMINATION)
			throw FHIRException("Unknown Use code '$codeString'")
		}
		override fun toCode(code: Use): String? {
			return when (code) {
				Use.CLAIM -> "claim"
				Use.PREAUTHORIZATION -> "preauthorization"
				Use.PREDETERMINATION -> "predetermination"
				NULL -> null
			}
		}
		override fun toSystem(code: Use): String? {
			return code.system
		}
    }


}

