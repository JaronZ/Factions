package com.massivecraft.factions;

import cn.nukkit.block.Block;
import cn.nukkit.item.Item;
import cn.nukkit.utils.TextFormat;

import java.util.*;

public class Conf {
    public static List<String> baseCommandAliases = new ArrayList<String>();

    // Colors
    public static TextFormat colorMember = TextFormat.GREEN;
    public static TextFormat colorAlly = TextFormat.LIGHT_PURPLE;
    public static TextFormat colorNeutral = TextFormat.WHITE;
    public static TextFormat colorEnemy = TextFormat.RED;

    public static TextFormat colorPeaceful = TextFormat.GOLD;
    public static TextFormat colorWar = TextFormat.DARK_RED;
    //public static ChatColor colorWilderness = ChatColor.DARK_GREEN;

    // Power
    public static double powerPlayerMax = 10.0;
    public static double powerPlayerMin = -10.0;
    public static double powerPlayerStarting = 0.0;
    public static double powerPerMinute = 0.2; // Default health rate... it takes 5 min to heal one power
    public static double powerPerDeath = 4.0; // A death makes you lose 4 power
    public static boolean powerRegenOffline = false;  // does player power regenerate even while they're offline?
    public static double powerOfflineLossPerDay = 0.0;  // players will lose this much power per day offline
    public static double powerOfflineLossLimit = 0.0;  // players will no longer lose power from being offline once their power drops to this amount or less
    public static double powerFactionMax = 0.0;  // if greater than 0, the cap on how much power a faction can have (additional power from players beyond that will act as a "buffer" of sorts)

    public static String prefixAdmin = "**";
    public static String prefixMod = "*";

    public static int factionTagLengthMin = 3;
    public static int factionTagLengthMax = 10;
    public static boolean factionTagForceUpperCase = false;

    public static boolean newFactionsDefaultOpen = false;

    // when faction membership hits this limit, players will no longer be able to join using /f join; default is 0, no limit
    public static int factionMemberLimit = 0;

    // what faction ID to start new players in when they first join the server; default is 0, "no faction"
    public static String newPlayerStartingFactionID = "0";

    public static boolean showMapFactionKey = true;
    public static boolean showNeutralFactionsOnMap = true;
    public static boolean showEnemyFactionsOnMap = true;

    // Disallow joining/leaving/kicking while power is negative
    public static boolean canLeaveWithNegativePower = true;

    // Configuration for faction-only chat
    public static boolean factionOnlyChat = false;
    // Configuration on the Faction tag in chat messages.
    public static boolean chatTagEnabled = false;
    public static transient boolean chatTagHandledByAnotherPlugin = false;
    public static boolean chatTagRelationColored = true;
    public static String chatTagReplaceString = "[FACTION]";
    public static String chatTagInsertAfterString = "";
    public static String chatTagInsertBeforeString = "";
    public static int chatTagInsertIndex = 1;
    public static boolean chatTagPadBefore = false;
    public static boolean chatTagPadAfter = true;
    public static String chatTagFormat = "%s" + TextFormat.WHITE;
    public static String factionChatFormat = "%s:" + TextFormat.WHITE + " %s";
    public static String allianceChatFormat = TextFormat.LIGHT_PURPLE + "%s:" + TextFormat.WHITE + " %s";

    public static boolean broadcastDescriptionChanges = false;

    public static double saveToFileEveryXMinutes = 30.0;

    public static double autoLeaveAfterDaysOfInactivity = 10.0;
    public static double autoLeaveRoutineRunsEveryXMinutes = 5.0;
    public static int autoLeaveRoutineMaxMillisecondsPerTick = 5;  // 1 server tick is roughly 50ms, so default max 10% of a tick
    public static boolean removePlayerDataWhenBanned = true;

    public static boolean worldGuardChecking = false;
    public static boolean worldGuardBuildPriority = false;

    //LWC
    public static boolean lwcIntegration = false;
    public static boolean onUnclaimResetLwcLocks = false;
    public static boolean onCaptureResetLwcLocks = false;

    // server logging options
    public static boolean logFactionCreate = true;
    public static boolean logFactionDisband = true;
    public static boolean logFactionJoin = true;
    public static boolean logFactionKick = true;
    public static boolean logFactionLeave = true;
    public static boolean logLandClaims = true;
    public static boolean logLandUnclaims = true;
    public static boolean logMoneyTransactions = true;
    public static boolean logPlayerCommands = false;

    // prevent some potential exploits
    public static boolean handleExploitObsidianGenerators = true;
    public static boolean handleExploitEnderPearlClipping = true;
    public static boolean handleExploitInteractionSpam = true;
    public static boolean handleExploitTNTWaterlog = false;

    public static boolean homesEnabled = true;
    public static boolean homesMustBeInClaimedTerritory = true;
    public static boolean homesTeleportToOnDeath = true;
    public static boolean homesRespawnFromNoPowerLossWorlds = true;
    public static boolean homesTeleportCommandEnabled = true;
    public static boolean homesTeleportCommandEssentialsIntegration = true;
    public static boolean homesTeleportCommandSmokeEffectEnabled = true;
    public static float homesTeleportCommandSmokeEffectThickness = 3f;
    public static boolean homesTeleportAllowedFromEnemyTerritory = true;
    public static boolean homesTeleportAllowedFromDifferentWorld = true;
    public static double homesTeleportAllowedEnemyDistance = 32.0;
    public static boolean homesTeleportIgnoreEnemiesIfInOwnTerritory = true;

    public static boolean disablePVPBetweenNeutralFactions = false;
    public static boolean disablePVPForFactionlessPlayers = false;
    public static boolean enablePVPAgainstFactionlessInAttackersLand = false;

    public static int noPVPDamageToOthersForXSecondsAfterLogin = 3;

    public static boolean peacefulTerritoryDisablePVP = true;
    public static boolean peacefulTerritoryDisableMonsters = false;
    public static boolean peacefulMembersDisablePowerLoss = true;

    public static boolean permanentFactionsDisableLeaderPromotion = false;

    public static boolean claimsMustBeConnected = false;
    public static boolean claimsCanBeUnconnectedIfOwnedByOtherFaction = true;
    public static int claimsRequireMinFactionMembers = 1;
    public static int claimedLandsMax = 0;

    // if someone is doing a radius claim and the process fails to claim land this many times in a row, it will exit
    public static int radiusClaimFailureLimit = 9;

    public static double considerFactionsReallyOfflineAfterXMinutes = 0.0;

    public static int actionDeniedPainAmount = 1;

    // commands which will be prevented if the player is a member of a permanent faction
    public static Set<String> permanentFactionMemberDenyCommands = new LinkedHashSet<String>();

    // commands which will be prevented when in claimed territory of another faction
    public static Set<String> territoryNeutralDenyCommands = new LinkedHashSet<String>();
    public static Set<String> territoryEnemyDenyCommands = new LinkedHashSet<String>();

    public static double territoryShieldFactor = 0.3;
    public static boolean territoryDenyBuild = true;
    public static boolean territoryDenyBuildWhenOffline = true;
    public static boolean territoryPainBuild = false;
    public static boolean territoryPainBuildWhenOffline = false;
    public static boolean territoryDenyUseage = true;
    public static boolean territoryEnemyDenyBuild = true;
    public static boolean territoryEnemyDenyBuildWhenOffline = true;
    public static boolean territoryEnemyPainBuild = false;
    public static boolean territoryEnemyPainBuildWhenOffline = false;
    public static boolean territoryEnemyDenyUseage = true;
    public static boolean territoryEnemyProtectMaterials = true;
    public static boolean territoryAllyDenyBuild = true;
    public static boolean territoryAllyDenyBuildWhenOffline = true;
    public static boolean territoryAllyPainBuild = false;
    public static boolean territoryAllyPainBuildWhenOffline = false;
    public static boolean territoryAllyDenyUseage = true;
    public static boolean territoryAllyProtectMaterials = true;
    public static boolean territoryBlockCreepers = false;
    public static boolean territoryBlockCreepersWhenOffline = false;
    public static boolean territoryBlockFireballs = false;
    public static boolean territoryBlockFireballsWhenOffline = false;
    public static boolean territoryBlockTNT = false;
    public static boolean territoryBlockTNTWhenOffline = false;
    public static boolean territoryDenyEndermanBlocks = true;
    public static boolean territoryDenyEndermanBlocksWhenOffline = true;

    public static boolean safeZoneDenyBuild = true;
    public static boolean safeZoneDenyUseage = true;
    public static boolean safeZoneBlockTNT = true;
    public static boolean safeZonePreventAllDamageToPlayers = false;
    public static boolean safeZoneDenyEndermanBlocks = true;

    public static boolean warZoneDenyBuild = true;
    public static boolean warZoneDenyUseage = true;
    public static boolean warZoneBlockCreepers = false;
    public static boolean warZoneBlockFireballs = false;
    public static boolean warZoneBlockTNT = true;
    public static boolean warZonePowerLoss = true;
    public static boolean warZoneFriendlyFire = false;
    public static boolean warZoneDenyEndermanBlocks = true;

    public static boolean wildernessDenyBuild = false;
    public static boolean wildernessDenyUseage = false;
    public static boolean wildernessBlockCreepers = false;
    public static boolean wildernessBlockFireballs = false;
    public static boolean wildernessBlockTNT = false;
    public static boolean wildernessPowerLoss = true;
    public static boolean wildernessDenyEndermanBlocks = false;

    // for claimed areas where further faction-member ownership can be defined
    public static boolean ownedAreasEnabled = true;
    public static int ownedAreasLimitPerFaction = 0;
    public static boolean ownedAreasModeratorsCanSet = false;
    public static boolean ownedAreaModeratorsBypass = true;
    public static boolean ownedAreaDenyBuild = true;
    public static boolean ownedAreaPainBuild = false;
    public static boolean ownedAreaProtectMaterials = true;
    public static boolean ownedAreaDenyUseage = true;

    public static String ownedLandMessage = "Owner(s): ";
    public static String publicLandMessage = "Public faction land.";
    public static boolean ownedMessageOnBorder = true;
    public static boolean ownedMessageInsideTerritory = true;
    public static boolean ownedMessageByChunk = false;
    public static boolean factionHereMessage = true;
    public static String factionHereMessageType = "tip"; // "tip", "popup", "actionbar" or "chat"

    public static boolean pistonProtectionThroughDenyBuild = true;
    //TODO Blocks are not enums they are static ints needs a large rewrite
    public static Set<Integer> territoryProtectedMaterials = new HashSet<>();
    public static Set<Integer> territoryDenyUseageMaterials = new HashSet<>();
    public static Set<Integer> territoryProtectedMaterialsWhenOffline = new HashSet<>();
    public static Set<Integer> territoryDenyUseageMaterialsWhenOffline = new HashSet<>();

    public static transient Set<Integer> safeZoneNerfedCreatureTypes = new HashSet<>();

    // Spout features
    public static boolean spoutFactionTagsOverNames = true;  // show faction tags over names over player heads
    public static boolean spoutFactionTitlesOverNames = true;  // whether to include player's title in that
    public static boolean spoutFactionAdminCapes = true;  // Show capes on faction admins, colored based on the viewer's relation to the target player
    public static boolean spoutFactionModeratorCapes = true;  // same, but for faction moderators
    public static int spoutTerritoryDisplayPosition = 1;  // permanent territory display, instead of by chat; 0 = disabled, 1 = top left, 2 = top center, 3+ = top right
    public static float spoutTerritoryDisplaySize = 1.0f;  // text scale (size) for territory display
    public static boolean spoutTerritoryDisplayShowDescription = true;  // whether to show the faction description, not just the faction tag
    public static boolean spoutTerritoryOwnersShow = true;  // show territory owner list as well
    public static boolean spoutTerritoryNoticeShow = true;  // show additional brief territory notice near center of screen, to be sure player notices transition
    public static int spoutTerritoryNoticeTop = 40;  // how far down the screen to place the additional notice
    public static boolean spoutTerritoryNoticeShowDescription = false;  // whether to show the faction description in the notice, not just the faction tag
    public static float spoutTerritoryNoticeSize = 1.5f;  // text scale (size) for notice
    public static float spoutTerritoryNoticeLeaveAfterSeconds = 2.00f;  // how many seconds before the notice goes away
    public static String capeAlly = "https://github.com/MassiveCraft/Factions/raw/master/capes/ally.png";
    public static String capeEnemy = "https://github.com/MassiveCraft/Factions/raw/master/capes/enemy.png";
    public static String capeMember = "https://github.com/MassiveCraft/Factions/raw/master/capes/member.png";
    public static String capeNeutral = "https://github.com/MassiveCraft/Factions/raw/master/capes/neutral.png";
    public static String capePeaceful = "https://github.com/MassiveCraft/Factions/raw/master/capes/peaceful.png";

    // Economy settings
    public static boolean econEnabled = false;
    public static String econUniverseAccount = "";
    public static double econCostClaimWilderness = 30.0;
    public static double econCostClaimFromFactionBonus = 30.0;
    public static double econClaimAdditionalMultiplier = 0.5;
    public static double econClaimRefundMultiplier = 0.7;
    public static double econClaimUnconnectedFee = 0.0;
    public static double econCostCreate = 100.0;
    public static double econCostOwner = 15.0;
    public static double econCostSethome = 30.0;
    public static double econCostJoin = 0.0;
    public static double econCostLeave = 0.0;
    public static double econCostKick = 0.0;
    public static double econCostInvite = 0.0;
    public static double econCostHome = 0.0;
    public static double econCostTag = 0.0;
    public static double econCostDesc = 0.0;
    public static double econCostTitle = 0.0;
    public static double econCostList = 0.0;
    public static double econCostMap = 0.0;
    public static double econCostPower = 0.0;
    public static double econCostShow = 0.0;
    public static double econCostOpen = 0.0;
    public static double econCostAlly = 0.0;
    public static double econCostEnemy = 0.0;
    public static double econCostNeutral = 0.0;
    public static double econCostNoBoom = 0.0;

    //Faction banks, to pay for land claiming and other costs instead of individuals paying for them
    public static boolean bankEnabled = true;
    public static boolean bankMembersCanWithdraw = false; //Have to be at least moderator to withdraw or pay money to another faction
    public static boolean bankFactionPaysCosts = true; //The faction pays for faction command costs, such as sethome
    public static boolean bankFactionPaysLandCosts = true; //The faction pays for land claiming costs.

    // mainly for other plugins/mods that use a fake player to take actions, which shouldn't be subject to our protections
    public static Set<String> playersWhoBypassAllProtection = new LinkedHashSet<String>();

    public static Set<String> worldsNoClaiming = new LinkedHashSet<String>();
    public static Set<String> worldsNoPowerLoss = new LinkedHashSet<String>();
    public static Set<String> worldsIgnorePvP = new LinkedHashSet<String>();
    public static Set<String> worldsNoWildernessProtection = new LinkedHashSet<String>();

    public static transient int mapHeight = 8;
    public static transient int mapWidth = 39;
    public static transient char[] mapKeyChrs = "\\/#?$%=&^ABCDEFGHJKLMNOPQRSTUVWXYZ1234567890abcdeghjmnopqrsuvwxyz".toCharArray();
    // -------------------------------------------- //
    // Persistance
    // -------------------------------------------- //
    private static transient Conf i = new Conf();

    static {
        baseCommandAliases.add("f");

        territoryEnemyDenyCommands.add("home");
        territoryEnemyDenyCommands.add("sethome");
        territoryEnemyDenyCommands.add("spawn");
        territoryEnemyDenyCommands.add("tpahere");
        territoryEnemyDenyCommands.add("tpaccept");
        territoryEnemyDenyCommands.add("tpa");

        territoryProtectedMaterials.add(Block.WOOD_DOOR_BLOCK);
        territoryProtectedMaterials.add(Block.IRON_DOOR_BLOCK);
        territoryProtectedMaterials.add(Block.TRAPDOOR);
        territoryProtectedMaterials.add(Block.IRON_TRAPDOOR);
        territoryProtectedMaterials.add(Block.FENCE_GATE);
        territoryProtectedMaterials.add(Block.FENCE_GATE_SPRUCE);
        territoryProtectedMaterials.add(Block.FENCE_GATE_JUNGLE);
        territoryProtectedMaterials.add(Block.FENCE_GATE_DARK_OAK);
        territoryProtectedMaterials.add(Block.FENCE_GATE_ACACIA);
        territoryProtectedMaterials.add(Block.CHEST);
        territoryProtectedMaterials.add(Block.FURNACE);
        territoryProtectedMaterials.add(Block.BURNING_FURNACE);
        territoryProtectedMaterials.add(Block.DISPENSER);
        territoryProtectedMaterials.add(Block.JUKEBOX);
        territoryProtectedMaterials.add(Block.BREWING_STAND_BLOCK);
        territoryProtectedMaterials.add(Block.ENCHANTMENT_TABLE);
        territoryProtectedMaterials.add(Block.CAULDRON_BLOCK);
        territoryProtectedMaterials.add(Block.FARMLAND);
        territoryProtectedMaterials.add(Block.BEACON);
        territoryProtectedMaterials.add(Block.ANVIL);
        territoryProtectedMaterials.add(Block.TRAPPED_CHEST);
        territoryProtectedMaterials.add(Block.DROPPER);
        territoryProtectedMaterials.add(Block.HOPPER_BLOCK);

        territoryDenyUseageMaterials.add(Item.FLINT_AND_STEEL);
        territoryDenyUseageMaterials.add(Item.BUCKET);
        territoryDenyUseageMaterials.add(Item.FIRE_CHARGE);
        territoryDenyUseageMaterials.add(Item.NETHERITE_HOE);
        territoryDenyUseageMaterials.add(Item.DIAMOND_HOE);
        territoryDenyUseageMaterials.add(Item.IRON_HOE);
        territoryDenyUseageMaterials.add(Item.GOLD_HOE);
        territoryDenyUseageMaterials.add(Item.STONE_HOE);
        territoryDenyUseageMaterials.add(Item.WOODEN_HOE);
        territoryDenyUseageMaterials.add(Item.NETHERITE_SHOVEL);
        territoryDenyUseageMaterials.add(Item.DIAMOND_SHOVEL);
        territoryDenyUseageMaterials.add(Item.IRON_SHOVEL);
        territoryDenyUseageMaterials.add(Item.GOLD_SHOVEL);
        territoryDenyUseageMaterials.add(Item.STONE_SHOVEL);
        territoryDenyUseageMaterials.add(Item.WOODEN_SHOVEL);

        territoryProtectedMaterialsWhenOffline.add(Block.WOOD_DOOR_BLOCK);
        territoryProtectedMaterialsWhenOffline.add(Block.IRON_DOOR_BLOCK);
        territoryProtectedMaterialsWhenOffline.add(Block.TRAPDOOR);
        territoryProtectedMaterialsWhenOffline.add(Block.IRON_TRAPDOOR);
        territoryProtectedMaterialsWhenOffline.add(Block.FENCE_GATE);
        territoryProtectedMaterialsWhenOffline.add(Block.FENCE_GATE_SPRUCE);
        territoryProtectedMaterialsWhenOffline.add(Block.FENCE_GATE_JUNGLE);
        territoryProtectedMaterialsWhenOffline.add(Block.FENCE_GATE_DARK_OAK);
        territoryProtectedMaterialsWhenOffline.add(Block.FENCE_GATE_ACACIA);
        territoryProtectedMaterialsWhenOffline.add(Block.CHEST);
        territoryProtectedMaterialsWhenOffline.add(Block.FURNACE);
        territoryProtectedMaterialsWhenOffline.add(Block.BURNING_FURNACE);
        territoryProtectedMaterialsWhenOffline.add(Block.DISPENSER);
        territoryProtectedMaterialsWhenOffline.add(Block.JUKEBOX);
        territoryProtectedMaterialsWhenOffline.add(Block.BREWING_STAND_BLOCK);
        territoryProtectedMaterialsWhenOffline.add(Block.ENCHANTMENT_TABLE);
        territoryProtectedMaterialsWhenOffline.add(Block.CAULDRON_BLOCK);
        territoryProtectedMaterialsWhenOffline.add(Block.FARMLAND);
        territoryProtectedMaterialsWhenOffline.add(Block.BEACON);
        territoryProtectedMaterialsWhenOffline.add(Block.ANVIL);
        territoryProtectedMaterialsWhenOffline.add(Block.TRAPPED_CHEST);
        territoryProtectedMaterialsWhenOffline.add(Block.DROPPER);
        territoryProtectedMaterialsWhenOffline.add(Block.HOPPER_BLOCK);

        territoryDenyUseageMaterialsWhenOffline.add(Item.FIRE_CHARGE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.FLINT_AND_STEEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.BUCKET);
        territoryDenyUseageMaterialsWhenOffline.add(Item.NETHERITE_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.DIAMOND_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.IRON_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.GOLD_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.STONE_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.WOODEN_HOE);
        territoryDenyUseageMaterialsWhenOffline.add(Item.NETHERITE_SHOVEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.DIAMOND_SHOVEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.IRON_SHOVEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.GOLD_SHOVEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.STONE_SHOVEL);
        territoryDenyUseageMaterialsWhenOffline.add(Item.WOODEN_SHOVEL);

//		safeZoneNerfedCreatureTypes.add(Entity.BLAZE);
//		safeZoneNerfedCreatureTypes.add(EntityType.CAVE_SPIDER);
//		safeZoneNerfedCreatureTypes.add(EntityType.CREEPER);
//		safeZoneNerfedCreatureTypes.add(EntityType.ENDER_DRAGON);
//		safeZoneNerfedCreatureTypes.add(EntityType.ENDERMAN);
//		safeZoneNerfedCreatureTypes.add(EntityType.GHAST);
//		safeZoneNerfedCreatureTypes.add(EntityType.MAGMA_CUBE);
//		safeZoneNerfedCreatureTypes.add(EntityType.PIG_ZOMBIE);
//		safeZoneNerfedCreatureTypes.add(EntityType.SILVERFISH);
//		safeZoneNerfedCreatureTypes.add(EntityType.SKELETON);
//		safeZoneNerfedCreatureTypes.add(EntityType.SPIDER);
//		safeZoneNerfedCreatureTypes.add(EntityType.SLIME);
//		safeZoneNerfedCreatureTypes.add(EntityType.WITCH);
//		safeZoneNerfedCreatureTypes.add(EntityType.WITHER);
//		safeZoneNerfedCreatureTypes.add(EntityType.ZOMBIE);
    }

    public static void load() {
        P.p.persist.loadOrSaveDefault(i, Conf.class, "conf");
    }

    public static void save() {
        P.p.persist.save(i);
    }
}

