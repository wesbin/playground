<script setup>
import MenuItem from '@/components/header/Menu/MenuItem';

const menus = [
  {
    routerName: 'Comics',
    menuName: '만화',
  },
  {
    routerName: 'Music',
    menuName: '음악',
  },
]
</script>

<template>
  <div class="menu-container">
    <MenuItem
      v-for="(menu, index) of menus"
      :key="index"
      :routerName="menu.routerName"
    >
      {{ menu.menuName }}
    </MenuItem>
  </div>
</template>

<style lang="scss" scoped>
.menu-container {
  display: flex;
  height: 100%;
  gap: 10px;
}
</style>