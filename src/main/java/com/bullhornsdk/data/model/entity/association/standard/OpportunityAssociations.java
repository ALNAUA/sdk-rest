package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Opportunity Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class OpportunityAssociations implements EntityAssociations<Opportunity> {

    private final AssociationField<Opportunity, CorporateUser> assignedUsers = instantiateAssociationField("assignedUsers",
            CorporateUser.class);
    private final AssociationField<Opportunity, BusinessSector> businessSectors = instantiateAssociationField("businessSectors",
            BusinessSector.class);
    private final AssociationField<Opportunity, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Opportunity, Certification> certifications = instantiateAssociationField("certifications",
            Certification.class);
    private final AssociationField<Opportunity, Skill> skills = instantiateAssociationField("skills", Skill.class);

    private final AssociationField<Opportunity, JobOrderCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", JobOrderCustomObjectInstance1.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", JobOrderCustomObjectInstance2.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", JobOrderCustomObjectInstance3.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", JobOrderCustomObjectInstance4.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", JobOrderCustomObjectInstance5.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", JobOrderCustomObjectInstance6.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", JobOrderCustomObjectInstance7.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", JobOrderCustomObjectInstance8.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", JobOrderCustomObjectInstance9.class);
    private final AssociationField<Opportunity, JobOrderCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", JobOrderCustomObjectInstance10.class);

    private List<AssociationField<Opportunity, ? extends BullhornEntity>> allAssociations;

    private static final OpportunityAssociations INSTANCE = new OpportunityAssociations();

    private OpportunityAssociations() {
        super();
    }

    public static OpportunityAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Opportunity,CorporateUser> assignedUsers() {
        return assignedUsers;
    }

    public AssociationField<Opportunity,BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Opportunity,Category> categories() {
        return categories;
    }

    public AssociationField<Opportunity,Certification> certifications() {
        return certifications;
    }

    public AssociationField<Opportunity,Skill> skills() {
        return skills;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<Opportunity, JobOrderCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }

    private <E extends BullhornEntity> AssociationField<Opportunity, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Opportunity, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Opportunity, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Opportunity, ? extends BullhornEntity>>();
            allAssociations.add(assignedUsers());
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(certifications());
            allAssociations.add(skills());
            allAssociations.add(customObject1s());
            allAssociations.add(customObject2s());
            allAssociations.add(customObject3s());
            allAssociations.add(customObject4s());
            allAssociations.add(customObject5s());
            allAssociations.add(customObject6s());
            allAssociations.add(customObject7s());
            allAssociations.add(customObject8s());
            allAssociations.add(customObject9s());
            allAssociations.add(customObject10s());
            //allAssociations.add(tearsheets());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<Opportunity, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Opportunity, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Opportunity called: " + associationName);
    }

}
