<script setup>
import Header from '@/components/header/Header';
</script>

<template>
  <Header></Header>
  <div class="content">
    <router-view></router-view>
  </div>
</template>

<style lang="scss">
@import '@/assets/css/common.scss';
</style>

<style scoped lang="scss">
.content {
  display: flex;
  justify-content: center;
}
</style>