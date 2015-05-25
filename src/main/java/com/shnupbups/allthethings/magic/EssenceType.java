package com.shnupbups.allthethings.magic;

public enum EssenceType {
    AIR, WATER, FIRE, EARTH, ORDER, VOID, INSTABILITY, EMPTINESS, PROTECTION, MAGMA, WORTH, STABILITY, DESTRUCTION, CORRUPTION, COLD, WARMTH, LIGHT, MOVEMENT, EXCHANGE, POWER, ELECTRICITY, WEATHER, NATURE, HUMANITY, BEAST, ANIMAL, PEACE, THOUGHT, CREATION, POISON, DEMAND, LIFE, RARITY, TRANSPARENCY, UNDERGROUND, NONSENSE, HELL, DEATH, MAGIC, INSUFFICIENCY, HUNGER, ADVENTURE, TRANSPORT, AUTOMATION, TELEPORTATION, ENDER, UNKNOWN, SLIME, PLANT, ROCK, SKY, SPACE, RADIATION, MEDICINE, TIME, DARKNESS, FLIGHT, ALIEN, WOOD, FLESH, UNDEAD, CONSUMPTION, MAGNETISM, ATTRACTION, DESIRE, LOVE, METAL, CHANGE, SOUL, LUST, ARROGANCE, INSIGNIFICANCE, WASTE, STUPIDITY, DISGUST, UNREALITY, MEMORY, KNOWLEDGE, MISTAKE, CHAOS, REDEMPTION, LAZINESS, VICTORY, SACRIFICE, BLOOD, HOLINESS, WORSHIP, SENSE, ENVY, UTILITY, LUCK, GREED, MECHANISM, STEALTH, GRIEF, CLOTH, HARM, ANGER, DISCOVERY, PURITY, SILENCE, NOISE, RECENCY, EXPERIMENT, HATRED, CHEATING, SICKNESS, LIABILITY, HAPPINESS, TOUCH, SIGHT, HEARING, SCENT, DIRECTION, USTHER, TASTE, BALANCE, ASCENSION, GODLINESS, ACHIEVEMENT, SORROW, FINALITY, CONTINUUM, SPEED, ERUPTION, REDUNDANCY, COLLECTION, SECRECY, BELONGING, ARTISTRY, PROPHECY, MASCULINITY, INTUITION, INTRICACY, TEDIUM, EXCITEMENT, DECEPTION;

    public int getColour() {
        if(this == AIR) return 0xEEDDB2;
        else if(this == WATER) return 0x005DB2;
        else if(this == FIRE) return 0xB76400;
        else if(this == EARTH) return 0x4C2A00;
        else if(this == ORDER) return 0x392249;
        else if(this == VOID) return 0x000C00;
        else if(this == INSTABILITY) return 0x99634A;
        else if(this == EMPTINESS) return 0x222222;
        else if(this == PROTECTION) return 0x949920;
        else if(this == MAGMA) return 0xC44E0F;
        else if(this == WORTH) return 0xB9E200;
        else if(this == STABILITY) return 0x669CB5;
        else if(this == DESTRUCTION) return 0x152051;
        else if(this == CORRUPTION) return 0x4A404F;
        else if(this == COLD) return 0x5098B7;
        else if(this == WARMTH) return 0xCC7300;
        else if(this == LIGHT) return 0xFFFF93;
        else if(this == MOVEMENT) return 0xFF7860;
        else if(this == EXCHANGE) return 0x1EBC1E;
        else if(this == POWER) return 0xFF0094;
        else if(this == ELECTRICITY) return 0xFFFF00;
        else if(this == WEATHER) return 0x88B28C;
        else if(this == NATURE) return 0x7CAF16;
        else if(this == HUMANITY) return 0xC1A347;
        else if(this == BEAST) return 0x15139F;
        else if(this == ANIMAL) return 0xD381B8;
        else if(this == PEACE) return 0xC492D1;
        else if(this == THOUGHT) return 0xB1C2CE;
        else if(this == CREATION) return 0xB1C261;
        else if(this == POISON) return 0x245626;
        else if(this == DEMAND) return 0x73A020;
        else if(this == LIFE) return 0xCEA9C4;
        else if(this == RARITY) return 0x61CCCA;
        else if(this == TRANSPARENCY) return 0xDDDDDD;
        else if(this == UNDERGROUND) return 0x82401D;
        else if(this == NONSENSE) return 0x237F36;
        else if(this == HELL) return 0xA01A00;
        else if(this == DEATH) return 0x963030;
        else if(this == MAGIC) return 0x7B5893;
        else if(this == INSUFFICIENCY) return 0x915D5D;
        else if(this == HUNGER) return 0xAA813A;
        else if(this == ADVENTURE) return 0x73A800;
        else if(this == TRANSPORT) return 0x22A557;
        else if(this == AUTOMATION) return 0xA3956B;
        else if(this == TELEPORTATION) return 0x5F179E;
        else if(this == ENDER) return 0x320C54;
        else if(this == UNKNOWN) return 0x4F4F4F;
        else if(this == SLIME) return 0x66AD51;
        else if(this == PLANT) return 0x335628;
        else if(this == ROCK) return 0x6B5857;
        else if(this == SKY) return 0x85D9DB;
        else if(this == SPACE) return 0x1A004C;
        else if(this == RADIATION) return 0x93A510;
        else if(this == MEDICINE) return 0xAF0000;
        else if(this == TIME) return 0x5D60AD;
        else if(this == DARKNESS) return 0x000000;
        else if(this == FLIGHT) return 0xD9C1FF;
        else if(this == ALIEN) return 0xD8D0A4;
        else if(this == WOOD) return 0x682F00;
        else if(this == FLESH) return 0xB73300;
        else if(this == UNDEAD) return 0x4C6B4F;
        else if(this == CONSUMPTION) return 0x3E6859;
        else if(this == MAGNETISM) return 0x665150;
        else if(this == ATTRACTION) return 0x663F42;
        else if(this == DESIRE) return 0xCC0E3D;
        else if(this == LOVE) return 0xCC0E61;
        else if(this == METAL) return 0xA8AFAA;
        else if(this == CHANGE) return 0xA86DAA;
        else if(this == SOUL) return 0x6935A8;
        else if(this == LUST) return 0xE271A0;
        else if(this == ARROGANCE) return 0xE52D00;
        else if(this == INSIGNIFICANCE) return 0xE0C9CB;
        else if(this == WASTE) return 0xA84830;
        else if(this == STUPIDITY) return 0xC6BB59;
        else if(this == DISGUST) return 0x82914E;
        else if(this == UNREALITY) return 0x76728E;
        else if(this == MEMORY) return 0xD3839E;
        else if(this == KNOWLEDGE) return 0xD3835D;
        else if(this == MISTAKE) return 0xD15A23;
        else if(this == CHAOS) return 0x594860;
        else if(this == REDEMPTION) return 0x59CD60;
        else if(this == LAZINESS) return 0x9DCC4E;
        else if(this == VICTORY) return 0xFFDD00;
        else if(this == SACRIFICE) return 0xB76628;
        else if(this == BLOOD) return 0xB50000;
        else if(this == HOLINESS) return 0x64B24A;
        else if(this == WORSHIP) return 0x7EA1AF;
        else if(this == SENSE) return 0xAD6669;
        else if(this == ENVY) return 0x605A7F;
        else if(this == UTILITY) return 0xB7E251;
        else if(this == LUCK) return 0x4143E0;
        else if(this == GREED) return 0xDD00DA;
        else if(this == MECHANISM) return 0xB2AFB5;
        else if(this == STEALTH) return 0x3E3D3F;
        else if(this == GRIEF) return 0x007F7F;
        else if(this == CLOTH) return 0xCEC584;
        else if(this == HARM) return 0xAF3B33;
        else if(this == ANGER) return 0xD52B00;
        else if(this == DISCOVERY) return 0xD3D076;
        else if(this == PURITY) return 0xD3BEAE;
        else if(this == SILENCE) return 0xC8D1C4;
        else if(this == NOISE) return 0xFF0061;
        else if(this == RECENCY) return 0xBBFFAA;
        else if(this == EXPERIMENT) return 0x26BA00;
        else if(this == HATRED) return 0xC63B00;
        else if(this == CHEATING) return 0x009E39;
        else if(this == SICKNESS) return 0x556010;
        else if(this == LIABILITY) return 0x41345E;
        else if(this == HAPPINESS) return 0xFFDF44;
        else if(this == TOUCH) return 0xFFDFD1;
        else if(this == SIGHT) return 0xE9FFD8;
        else if(this == HEARING) return 0xA5ADFF;
        else if(this == SCENT) return 0xFFB2BF;
        else if(this == DIRECTION) return 0x96FFA9;
        else if(this == USTHER) return 0xD86020;
        else if(this == TASTE) return 0xD67E98;
        else if(this == BALANCE) return 0xC9D392;
        else if(this == ASCENSION) return 0xC9D36D;
        else if(this == GODLINESS) return 0xC9C655;
        else if(this == ACHIEVEMENT) return 0xECC655;
        else if(this == SORROW) return 0x355B4C;
        else if(this == FINALITY) return 0x1D5427;
        else if(this == CONTINUUM) return 0x1D54BE;
        else if(this == SPEED) return 0x84B3B3;
        else if(this == ERUPTION) return 0xB74300;
        else if(this == REDUNDANCY) return 0xA79F00;
        else if(this == COLLECTION) return 0xA79FEC;
        else if(this == SECRECY) return 0x829FA0;
        else if(this == BELONGING) return 0xBA8F6D;
        else if(this == ARTISTRY) return 0xBA8FB2;
        else if(this == PROPHECY) return 0x934E42;
        else if(this == MASCULINITY) return 0x4D9AA5;
        else if(this == TEDIUM) return 0x932FA5;
        else if(this == EXCITEMENT) return 0x5DBAA5;
        else if(this == DECEPTION) return 0xB75B9D;
        else return 0x000000;
    }

    public int getId() {
        for(int i = 0; i < EssenceType.values().length; i++) {
            if(EssenceType.values()[i] == this) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public static EssenceType getFromId(int id) {
        return EssenceType.values()[id];
    }
}