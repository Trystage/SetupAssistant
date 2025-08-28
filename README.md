# SetupAssistant / 地图配置插件

A lightweight Minecraft plugin that simplifies server setup and administration through right-click command execution. Perfect for map makers and server administrators who need quick access to common setup commands.
轻量级 Minecraft 插件，通过右键单击执行命令简化服务器设置和管理。非常适合需要快速访问常用设置命令的地图制作者和服务器管理员。

## Features / 功能特点

- **One-Click Command Execution**: Right-click with specific items to execute commands instantly
  **一键命令执行**：使用特定物品右键单击即可立即执行命令
- **Coordinate Alignment**: Automatically aligns player positions to a grid (0.5 block precision, 45-degree angles)
  **坐标对齐**：自动将玩家位置对齐到网格（0.5格精度，45度角度）
- **BedWars Integration**: Specialized tools for BedWars map configuration
  **BedWars 集成**：专门的 BedWars 地图配置工具
- **Quick Teleportation**: Instant teleport to predefined locations
  **快速传送**：即时传送到预设位置

## Installation / 安装方法

1. Download the SetupAssistant plugin JAR file
   下载 SetupAssistant 插件 JAR 文件
2. Place it in your server's `plugins` folder
   将其放入服务器的 `plugins` 文件夹中
3. Restart your server
   重启服务器

## Item Functions / 物品功能

| Item / 物品 | Function / 功能 | Command / 命令 |
|------------|----------------|----------------|
| Iron Shovel (§a坐标对齐) | Aligns position to grid (0.5 block precision, 45° angles) / 将位置对齐到网格（0.5格精度，45度角度） | `/setup tp` |
| Sea Lantern (§a设置队伍出生点) | Sets team spawn point / 设置队伍出生点 | `/bw setspawn` |
| Villager Egg (§a设置商店) | Sets shop location / 设置商店位置 | `/bw setshop` |
| Diamond (§a设置升级) | Sets upgrade station / 设置升级站 | `/bw setupgrade` |
| Iron Ingot (§a设置资源池) | Adds resource generator / 添加资源生成器 | `/bw addgenerator` |
| Bed (§a设置床) | Sets bed location / 设置床位置 | `/bw setbed 1` |
| Oak Log (§a传送到等待区1) | Teleports to waiting area 1 / 传送到等待区1 | `/tp 15 150 15 135 0` |
| Spruce Log (§a传送到等待区2) | Teleports to waiting area 2 / 传送到等待区2 | `/tp -15 150 -15 -45 0` |

## Coordinate Alignment Precision / 坐标对齐精度说明

The coordinate alignment feature snaps player positions to the nearest **0.5 block** increment and rotates to the nearest **45-degree** angle. This means:
坐标对齐功能会将玩家位置捕捉到最近的 **0.5格** 增量，并旋转到最近的 **45度** 角度。这意味着：

### Position / 坐标:  
- 12.3 → 12.5  
- 7.8 → 8.0  
### Rotation / 旋转:
- 23° → 0°  
- 67° → 45°  
- 100° → 90°  
