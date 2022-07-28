package com.example.Updation_RR_Portal.model;


import com.example.Updation_RR_Portal.exception.UnknownEnumValueException;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Iterator;

public enum Role implements Collection<GrantedAuthority> {
//    admin("HR"),
//    employee("joinee");

    ROLE_HR("HR"),
    ROLE_JOINEE("JOINEE");
    private String roleType;

    Role(String roleType){
        this.roleType=roleType;

    }

    public String roleType(){

        return this.roleType;
    }


    @JsonCreator
    public static Role getGenderFromGenderType(String value){
        for (Role roles : Role.values()) {
            if (roles.roleType().equalsIgnoreCase(value)){
                return roles;
            }
        }
        throw new UnknownEnumValueException("Role: unknown value: "+value);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public Iterator<GrantedAuthority> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(GrantedAuthority grantedAuthority) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends GrantedAuthority> c) {
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return true;
    }

    @Override
    public void clear() {

    }
}
