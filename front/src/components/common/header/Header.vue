<script setup>
import Logo from '@/components/common/header/Logo';
import Menu from '@/components/common/header/Menu/Menu';
</script>

<template>
  <header class="header">
    <Logo></Logo>
    <Menu></Menu>
    <div class="empty-container"></div>
  </header>
</template>

<style lang="scss" scoped>
.header {
  display: grid;
  gap: 10px;
  height: 60px;
  background-color: $HEADER-COLOR;
  grid-template-columns: 1fr 3fr 1fr;
  justify-items: center;
  align-items: center;
  color: $WHITE-FONT;
}
</style>