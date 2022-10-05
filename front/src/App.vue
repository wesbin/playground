<script setup>
import Header from '@/components/common/header/Header';
</script>

<template>
  <Header></Header>
  <div class="content">
    <!-- todo left, center, right 반응형 설정 -->
    <div class="left-side-bar"></div>
    <div class="center">
      <router-view></router-view>
    </div>
    <div class="right-side-bar"></div>
  </div>
</template>

<style lang="scss">
@import '@/assets/css/common.scss';
</style>

<style scoped lang="scss">
.content {
  display: flex;
  justify-content: center;

  .left-side-bar {
    //flex: 1 1 0;
  }

  .center {
    padding-top: 10px;
    width: 1150px;
    //flex: 2 1 0;
  }

  .right-side-bar {
    //flex: 1 1 0;
  }
}
</style>