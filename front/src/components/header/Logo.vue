<script setup>
import {useRouter} from 'vue-router';

let router = useRouter();
const clickLogo = () => {
  router.push({
    name: 'Main'
  })
}
</script>

<template>
  <div class="logo-container">
    <div
      class="logo"
      @click="clickLogo"
    >
      GUNU
    </div>
  </div>
</template>

<style lang="scss" scoped>
.logo-container {
  padding-left: 20px;
  justify-self: start;

  .logo {
    cursor: pointer;
    user-select: none;
  }
}
</style>