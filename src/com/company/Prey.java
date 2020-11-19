package com.company;

public class Prey {
    static int s_iMaxPreyAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPreyLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPreyVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fMaxPreyMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPreyAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    Vision m_Vision;
    Hearing m_Hearing;

    public Prey(int p_iAgeMax, int p_iAge, int p_iLifePointMax, int p_iLifePoint, int p_iVigorMax, int p_iVigor, float p_fMaxMovingSpeed, float p_fMovingSpeed, float p_fOrientation, Vision p_Vision, Hearing p_Hearing) {
        this.m_iAgeMax = p_iAgeMax;
        this.m_iAge = p_iAge;
        this.m_iLifePointMax = p_iLifePointMax;
        this.m_iLifePoint = p_iLifePoint;
        this.m_iVigorMax = p_iVigorMax;
        this.m_iVigor = p_iVigor;
        this.m_fMaxMovingSpeed = p_fMaxMovingSpeed;
        this.m_fMovingSpeed = p_fMovingSpeed;
        this.m_fOrientation = p_fOrientation;
        this.m_Vision = p_Vision;
        this.m_Hearing = p_Hearing;
    }

    void draw(){

    }

    void step(){

    }

    void pop(){

    }

    void move(){
    }

    void mating(){

    }

    void eat()  {

    }

    void drink(){

    }

    void rest(){

    }

    void flee()  {

    }
}
